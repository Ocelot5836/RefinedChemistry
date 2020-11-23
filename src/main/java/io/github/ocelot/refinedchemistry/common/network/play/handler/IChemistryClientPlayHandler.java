package io.github.ocelot.refinedchemistry.common.network.play.handler;

import io.github.ocelot.refinedchemistry.common.network.play.SSyncElementContainer;
import net.minecraftforge.fml.network.NetworkEvent;

/**
 * @author Ocelot
 */
public interface IChemistryClientPlayHandler
{
    /**
     * Called when the server notifies the client of the contents in an element container.
     *
     * @param msg The message received
     * @param ctx The message context
     */
    void handleSyncGameBorderMessage(SSyncElementContainer msg, NetworkEvent.Context ctx);
}
