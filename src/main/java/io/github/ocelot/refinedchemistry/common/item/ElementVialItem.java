package io.github.ocelot.refinedchemistry.common.item;

import io.github.ocelot.refinedchemistry.common.element.ChemistryElement;
import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.element.ElementStack;
import io.github.ocelot.refinedchemistry.common.element.SimpleElementContainer;
import io.github.ocelot.refinedchemistry.common.network.play.SSyncElementContainer;
import io.github.ocelot.refinedchemistry.common.registry.ChemistryMessages;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fml.network.PacketDistributor;

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
            stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.insertElement(new ElementStack(ChemistryElement.values()[(int) Math.abs(player.getPosX())], 10)));
            ChemistryMessages.PLAY.send(PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> player), new SSyncElementContainer(player, hand));
        }
        return ActionResult.func_233538_a_(stack, world.isRemote());
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.getElements().forEach(elementStack -> tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip", elementStack.getCount(), elementStack.getElement().getName()).mergeStyle(Style.EMPTY.setColor(Color.fromInt(elementStack.getElement().getCpkColor()))))));
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
