package io.github.ocelot.refinedchemistry.common.network.play;

import io.github.ocelot.refinedchemistry.common.element.ChemistryMolecule;
import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.network.play.handler.IChemistryClientPlayHandler;
import io.github.ocelot.refinedchemistry.common.registry.ElementCapability;
import io.github.ocelot.sonar.common.network.message.SonarMessage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Hand;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.UUID;

/**
 * @author Ocelot
 */
public class SSyncElementContainer implements SonarMessage<IChemistryClientPlayHandler>
{
    private ChemistryMolecule[] molecules;
    private UUID player;
    private Hand hand;

    public SSyncElementContainer()
    {
    }

    public SSyncElementContainer(PlayerEntity player, Hand hand)
    {
        LazyOptional<ElementContainer> lazyOptional = player.getHeldItem(hand).getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY);
        this.molecules = lazyOptional.isPresent() ? lazyOptional.orElseThrow(IllegalStateException::new).getMolecules().toArray(new ChemistryMolecule[0]) : new ChemistryMolecule[0];
        this.player = player.getUniqueID();
        this.hand = hand;
    }

    @Override
    public void readPacketData(PacketBuffer buf)
    {
        this.molecules = new ChemistryMolecule[buf.readVarInt()];
        for (int i = 0; i < this.molecules.length; i++)
            this.molecules[i] = new ChemistryMolecule(buf);
        this.player = buf.readUniqueId();
        this.hand = buf.readEnumValue(Hand.class);
    }

    @Override
    public void writePacketData(PacketBuffer buf)
    {
        buf.writeVarInt(this.molecules.length);
        for (ChemistryMolecule molecule : this.molecules)
            molecule.write(buf);
        buf.writeUniqueId(this.player);
        buf.writeEnumValue(this.hand);
    }

    @Override
    public void processPacket(IChemistryClientPlayHandler handler, NetworkEvent.Context ctx)
    {
        handler.handleSyncGameBorderMessage(this, ctx);
    }

    /**
     * @return The molecules in the stack
     */
    @OnlyIn(Dist.CLIENT)
    public ChemistryMolecule[] getMolecules()
    {
        return molecules;
    }

    /**
     * @return The player holding the container
     */
    @OnlyIn(Dist.CLIENT)
    public UUID getPlayer()
    {
        return player;
    }

    /**
     * @return The hand the player is holding the container in
     */
    @OnlyIn(Dist.CLIENT)
    public Hand getHand()
    {
        return hand;
    }
}
