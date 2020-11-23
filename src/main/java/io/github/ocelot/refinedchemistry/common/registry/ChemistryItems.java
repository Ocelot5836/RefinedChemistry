package io.github.ocelot.refinedchemistry.common.registry;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import io.github.ocelot.refinedchemistry.common.item.ElementVialItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

/**
 * @author Ocelot
 */
public class ChemistryItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RefinedChemistry.MOD_ID);

    public static final RegistryObject<ElementVialItem> SMALL_ELEMENT_BOTTLE = register("small_element_bottle", () -> new ElementVialItem(500, new Item.Properties().group(RefinedChemistry.TAB)));
    public static final RegistryObject<ElementVialItem> LARGE_ELEMENT_BOTTLE = register("large_element_bottle", () -> new ElementVialItem(1000, new Item.Properties().group(RefinedChemistry.TAB)));
    public static final RegistryObject<ElementVialItem> SMALL_ELEMENT_TEST_TUBE = register("small_element_test_tube", () -> new ElementVialItem(100, new Item.Properties().group(RefinedChemistry.TAB)));
    public static final RegistryObject<ElementVialItem> LARGE_ELEMENT_TEST_TUBE = register("large_element_test_tube", () -> new ElementVialItem(200, new Item.Properties().group(RefinedChemistry.TAB)));

    /* Registry Methods */

    /**
     * Registers a new item under the specified name.
     *
     * @param name The name of the item
     * @param item The item to register
     * @return The object created when registering the item
     */
    public static <T extends Item> RegistryObject<T> register(String name, Supplier<? extends T> item)
    {
        RegistryObject<T> object = ITEMS.register(name, item);
        RefinedChemistry.TAB.getOrderedItems().add(object);
        return object;
    }
}