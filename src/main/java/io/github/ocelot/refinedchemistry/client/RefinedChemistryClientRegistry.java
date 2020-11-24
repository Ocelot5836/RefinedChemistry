package io.github.ocelot.refinedchemistry.client;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import io.github.ocelot.refinedchemistry.common.element.ChemistryElementState;
import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.registry.ChemistryItems;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = RefinedChemistry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RefinedChemistryClientRegistry
{
//    private static final Logger LOGGER = LogManager.getLogger();

    public static void init(IEventBus bus)
    {

    }

    public static void setup(FMLClientSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            IItemPropertyGetter elementContainer = (stack, world, entity) ->
            {
                LazyOptional<ElementContainer> optional = stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY);
                if (!optional.isPresent())
                    return 0;

                ElementContainer container = optional.orElseThrow(IllegalStateException::new);
                ChemistryElementState maxState = null;
                float lastPercentage = 0;
                for (ChemistryElementState state : ChemistryElementState.values())
                {
                    float percentage = container.calculateFillPercentage(s -> s.getState() == state, false);
                    if (percentage > lastPercentage)
                    {
                        maxState = state;
                        lastPercentage = percentage;
                    }
                }
                return maxState == null ? 0 : maxState.ordinal() + 1;
            };
            ItemModelsProperties.registerProperty(ChemistryItems.SMALL_ELEMENT_BOTTLE.get(), new ResourceLocation(RefinedChemistry.MOD_ID, "element_state"), elementContainer);
            ItemModelsProperties.registerProperty(ChemistryItems.LARGE_ELEMENT_BOTTLE.get(), new ResourceLocation(RefinedChemistry.MOD_ID, "element_state"), elementContainer);
            ItemModelsProperties.registerProperty(ChemistryItems.SMALL_ELEMENT_TEST_TUBE.get(), new ResourceLocation(RefinedChemistry.MOD_ID, "element_state"), elementContainer);
            ItemModelsProperties.registerProperty(ChemistryItems.LARGE_ELEMENT_TEST_TUBE.get(), new ResourceLocation(RefinedChemistry.MOD_ID, "element_state"), elementContainer);
        });
    }

    @SubscribeEvent
    public static void onEvent(ColorHandlerEvent.Item event)
    {
//        BlockColors blockColors = event.getBlockColors();
        ItemColors itemColors = event.getItemColors();

        itemColors.register((stack, index) ->
        {
            if (index != 1)
                return -1;

            LazyOptional<ElementContainer> optional = stack.getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY);
            if (!optional.isPresent())
                return -1;

            return optional.orElseThrow(IllegalStateException::new).getAverageColor();
        }, ChemistryItems.SMALL_ELEMENT_BOTTLE.get(), ChemistryItems.LARGE_ELEMENT_BOTTLE.get(), ChemistryItems.SMALL_ELEMENT_TEST_TUBE.get(), ChemistryItems.LARGE_ELEMENT_TEST_TUBE.get());
    }
}
