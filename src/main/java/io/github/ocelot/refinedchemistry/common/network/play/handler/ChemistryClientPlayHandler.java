package io.github.ocelot.refinedchemistry.common.network.play.handler;

import io.github.ocelot.refinedchemistry.common.network.play.SSyncElementContainer;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.fml.network.NetworkEvent;

/**
 * @author Ocelot
 */
public class ChemistryClientPlayHandler implements IChemistryClientPlayHandler
{
    @Override
    public void handleSyncGameBorderMessage(SSyncElementContainer msg, NetworkEvent.Context ctx)
    {
        ClientWorld world = Minecraft.getInstance().world;
        if (world == null)
            return;

        PlayerEntity player = world.getPlayerByUuid(msg.getPlayer());
        if (player == null)
            return;

        ctx.enqueueWork(() -> player.getHeldItem(msg.getHand()).getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY).ifPresent(container -> container.setMolecules(msg.getMolecules())));
    }
}
