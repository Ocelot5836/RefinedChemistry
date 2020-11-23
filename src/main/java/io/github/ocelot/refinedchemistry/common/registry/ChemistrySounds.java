package io.github.ocelot.refinedchemistry.common.registry;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author Ocelot
 */
public class ChemistrySounds
{
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RefinedChemistry.MOD_ID);

    // public static final RegistryObject<SoundEvent> EXAMPLE = register("example");

    /* Registry Methods */

    /**
     * Registers a new sound event under the specified id.
     *
     * @param id The id of the sound event
     */
    private static RegistryObject<SoundEvent> register(String id)
    {
        return SOUNDS.register(id, () -> new SoundEvent(new ResourceLocation(RefinedChemistry.MOD_ID, id)));
    }
}