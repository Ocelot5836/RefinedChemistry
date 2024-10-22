package io.github.ocelot.refinedchemistry.common.registry;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.*;

/**
 * @author Ocelot
 */
public class ChemistryTags
{
//    public static final ITag.INamedTag<Item> EXAMPLE = makeItemWrapperTag("example");

    /* Registry Methods */

    /**
     * Creates a new tag wrapper using the specified name.
     *
     * @param name The name of the tag
     * @return The tag wrapper
     */
    public static ITag.INamedTag<Item> makeItemWrapperTag(String name)
    {
        return ItemTags.makeWrapperTag(RefinedChemistry.MOD_ID + ":" + name);
    }

    /**
     * Creates a new tag wrapper using the specified name.
     *
     * @param name The name of the tag
     * @return The tag wrapper
     */
    public static ITag.INamedTag<Block> makeBlockWrapperTag(String name)
    {
        return BlockTags.makeWrapperTag(RefinedChemistry.MOD_ID + ":" + name);
    }

    /**
     * Creates a new tag wrapper using the specified name.
     *
     * @param name The name of the tag
     * @return The tag wrapper
     */
    public static ITag.INamedTag<EntityType<?>> makeEntityWrapperTag(String name)
    {
        return EntityTypeTags.getTagById(RefinedChemistry.MOD_ID + ":" + name);
    }

    /**
     * Creates a new tag wrapper using the specified name.
     *
     * @param name The name of the tag
     * @return The tag wrapper
     */
    public static ITag.INamedTag<Fluid> makeFluidWrapperTag(String name)
    {
        return FluidTags.makeWrapperTag(RefinedChemistry.MOD_ID + ":" + name);
    }
}
