package io.github.ocelot.refinedchemistry.datagen;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.FluidTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FluidTagGen extends FluidTagsProvider
{
    public FluidTagGen(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, RefinedChemistry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags()
    {
    }
}
