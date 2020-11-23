package io.github.ocelot.refinedchemistry.common.registry;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import io.github.ocelot.refinedchemistry.common.network.play.SSyncElementContainer;
import io.github.ocelot.refinedchemistry.common.network.play.handler.ChemistryClientPlayHandler;
import io.github.ocelot.refinedchemistry.common.network.play.handler.ChemistryServerPlayHandler;
import io.github.ocelot.sonar.common.network.SonarNetworkManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

/**
 * @author Ocelot
 */
public class ChemistryMessages
{
    public static final String PROTOCOL_VERSION = "1";
    //    public static final SimpleChannel LOGIN = NetworkRegistry.newSimpleChannel(new ResourceLocation(RefinedChemistry.MOD_ID, "login"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    public static final SimpleChannel PLAY = NetworkRegistry.newSimpleChannel(new ResourceLocation(RefinedChemistry.MOD_ID, "play"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

    //    public static final SonarNetworkManager LOGIN_MANAGER = new SonarNetworkManager(LOGIN, () -> ChemistryClientLoginHandler::new, () -> ChemistryServerLoginHandler::new);
    public static final SonarNetworkManager PLAY_MANAGER = new SonarNetworkManager(PLAY, () -> ChemistryClientPlayHandler::new, () -> ChemistryServerPlayHandler::new);

    public static void init()
    {
        // Common

        // Login

        // Play
        PLAY_MANAGER.register(SSyncElementContainer.class, SSyncElementContainer::new, NetworkDirection.PLAY_TO_CLIENT);
    }
}
