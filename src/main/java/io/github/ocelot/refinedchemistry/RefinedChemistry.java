package io.github.ocelot.refinedchemistry;

import io.github.ocelot.refinedchemistry.common.registry.*;
import io.github.ocelot.refinedchemistry.datagen.*;
import io.github.ocelot.sonar.Sonar;
import io.github.ocelot.sonar.common.util.SortedItemGroup;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RefinedChemistry.MOD_ID)
public class RefinedChemistry
{
    public static final String MOD_ID = "refinedchemistry";

    public static final SortedItemGroup TAB = new SortedItemGroup(MOD_ID)
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.DIAMOND);
        }
    };

    public RefinedChemistry()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Sonar.init(bus);
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::dataSetup);

        ChemistryItems.ITEMS.register(bus);
        ChemistryBlocks.BLOCKS.register(bus);
        ChemistryBlocks.TILE_ENTITIES.register(bus);
        ChemistryEntities.ENTITIES.register(bus);
        ChemistrySounds.SOUNDS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event)
    {
        ElementCapability.init();
    }

    private void clientSetup(FMLClientSetupEvent event)
    {
    }

    private void dataSetup(GatherDataEvent event)
    {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        BlockTagGen blockTagGen = new BlockTagGen(dataGenerator, existingFileHelper);
        dataGenerator.addProvider(new RecipeGen(dataGenerator));
        dataGenerator.addProvider(new LootTableGen(dataGenerator));
        dataGenerator.addProvider(blockTagGen);
        dataGenerator.addProvider(new ItemTagGen(dataGenerator, blockTagGen, existingFileHelper));
        dataGenerator.addProvider(new FluidTagGen(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new EntityTypeTagGen(dataGenerator, existingFileHelper));
    }
}
