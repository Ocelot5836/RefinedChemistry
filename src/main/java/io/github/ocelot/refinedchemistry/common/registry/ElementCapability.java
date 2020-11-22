package io.github.ocelot.refinedchemistry.common.registry;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.element.ElementStack;
import io.github.ocelot.refinedchemistry.common.element.SimpleElementContainer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

/**
 * <p>Manages the element container capability.</p>
 *
 * @author Ocelot
 */
@Mod.EventBusSubscriber(modid = RefinedChemistry.MOD_ID)
public class ElementCapability
{
    @CapabilityInject(ElementContainer.class)
    public static Capability<ElementContainer> ELEMENT_CONTAINER_CAPABILITY = null;

    public static void init()
    {
        CapabilityManager.INSTANCE.register(ElementContainer.class, new Storage(), SimpleElementContainer::new);
    }

    private static class Storage implements Capability.IStorage<ElementContainer>
    {
        @Nullable
        @Override
        public INBT writeNBT(Capability<ElementContainer> capability, ElementContainer instance, Direction side)
        {
            ListNBT elementsNbt = new ListNBT();
            instance.getElements().forEach(elementStack -> elementsNbt.add(elementStack.serializeNBT(new CompoundNBT())));
            return elementsNbt;
        }

        @Override
        public void readNBT(Capability<ElementContainer> capability, ElementContainer instance, Direction side, INBT nbt)
        {
            if (nbt instanceof ListNBT)
            {
                ListNBT elementsNbt = (ListNBT) nbt;
                for (int i = 0; i < elementsNbt.size(); i++)
                {
                    instance.setElement(new ElementStack(elementsNbt.getCompound(i)));
                }
            }
        }
    }
}
