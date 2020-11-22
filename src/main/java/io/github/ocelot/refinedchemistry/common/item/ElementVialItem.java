package io.github.ocelot.refinedchemistry.common.item;

import io.github.ocelot.refinedchemistry.common.element.ChemistryElementState;
import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.element.SimpleElementContainer;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class ElementVialItem extends Item
{
    private final ChemistryElementState state;
    private final int capacity;

    public ElementVialItem(ChemistryElementState state, int capacity, Properties properties)
    {
        super(properties);
        this.state = state;
        this.capacity = capacity;
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt)
    {
        return new ICapabilitySerializable<INBT>()
        {
            private final LazyOptional<ElementContainer> capability = LazyOptional.of(SimpleElementContainer::new);

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

    public ChemistryElementState getState()
    {
        return state;
    }

//    @Nullable
//    public static ChemistryElement getElement(ItemStack stack)
//    {
//        if (!(stack.getItem() instanceof ElementVialItem))
//            return null;
//        if(stack.getTag() != null && stack.getTag().contains("Element", Constants.NBT.TAG_STRING))
//        return null;
//    }
}
