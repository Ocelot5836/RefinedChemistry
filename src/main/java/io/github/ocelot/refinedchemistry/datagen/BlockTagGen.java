package io.github.ocelot.refinedchemistry.datagen;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGen extends BlockTagsProvider
{
    public BlockTagGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, RefinedChemistry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags()
    {
    }
}
