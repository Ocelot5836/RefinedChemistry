package io.github.ocelot.refinedchemistry.common.item;

import io.github.ocelot.refinedchemistry.common.element.*;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

/**
 * @author Ocelot
 */
public class ElementVialItem extends Item
{
    private final int capacity;

    public ElementVialItem(int capacity, Properties properties)
    {
        super(properties);
        this.capacity = capacity;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
        ItemStack stack = player.getHeldItem(hand);
        if (!world.isRemote())
        {
            BlockRayTraceResult result = rayTrace(world, player, RayTraceContext.FluidMode.SOURCE_ONLY);
            ChemistryMolecule molecule = new ChemistryMolecule(new ChemistryAtom(ChemistryElement.HYDROGEN, 2), new ChemistryAtom(ChemistryElement.OXYGEN)).setState(result.getType() == RayTraceResult.Type.BLOCK && world.getFluidState(result.getPos()).getFluid() == Fluids.WATER ? ChemistryElementState.LIQUID : ChemistryElementState.GAS);
            if (stack.getCount() > 1)
            {
                if (!player.isCreative())
                    stack.shrink(1);

                ItemStack split = stack.copy();
                split.setCount(1);
                split.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.insertMolecule(molecule));
                player.addItemStackToInventory(split);
            }
            else
            {
                stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.insertMolecule(molecule));
                ((ServerPlayerEntity) player).connection.sendPacket(new SSetSlotPacket(-2, hand != Hand.MAIN_HAND || player.inventory.currentItem == -1 ? player.inventory.mainInventory.size() + player.inventory.armorInventory.size() : player.inventory.currentItem, stack));
            }
        }
        return ActionResult.func_233538_a_(stack, world.isRemote());
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.getMolecules().forEach(molecule -> tooltip.add(new StringTextComponent(molecule.getCount() + " ").mergeStyle(TextFormatting.GRAY).append(molecule.getName()))));
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt)
    {
        return new ICapabilitySerializable<INBT>()
        {
            private final LazyOptional<ElementContainer> capability = LazyOptional.of(() -> new SimpleElementContainer(ElementVialItem.this.capacity));

            @Override
            public INBT serializeNBT()
            {
                if (!this.capability.isPresent())
                    return new CompoundNBT();
                return Objects.requireNonNull(ElementCapability.ELEMENT_CONTAINER_CAPABILITY.getStorage().writeNBT(ElementCapability.ELEMENT_CONTAINER_CAPABILITY, this.capability.orElseThrow(IllegalStateException::new), null));
            }

            @Override
            public void deserializeNBT(INBT nbt)
            {
                if (!this.capability.isPresent())
                    return;
                ElementCapability.ELEMENT_CONTAINER_CAPABILITY.getStorage().readNBT(ElementCapability.ELEMENT_CONTAINER_CAPABILITY, this.capability.orElseThrow(IllegalStateException::new), null, nbt);
            }

            @Nonnull
            @Override
            public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side)
            {
                if (cap == ElementCapability.ELEMENT_CONTAINER_CAPABILITY)
                    return this.capability.cast();
                return LazyOptional.empty();
            }
        };
    }
}
