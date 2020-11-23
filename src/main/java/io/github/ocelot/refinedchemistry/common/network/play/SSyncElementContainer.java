package io.github.ocelot.refinedchemistry.common.network.play;

import io.github.ocelot.refinedchemistry.common.element.ElementContainer;
import io.github.ocelot.refinedchemistry.common.element.ElementStack;
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
    private ElementStack[] elements;
    private UUID player;
    private Hand hand;

    public SSyncElementContainer()
    {
    }

    public SSyncElementContainer(PlayerEntity player, Hand hand)
    {
        LazyOptional<ElementContainer> lazyOptional = player.getHeldItem(hand).getCapability(ElementCapability.ELEMENT_CONTAINER_CAPABILITY);
        this.elements = lazyOptional.isPresent() ? lazyOptional.orElseThrow(IllegalStateException::new).getElements().toArray(new ElementStack[0]) : new ElementStack[0];
        this.player = player.getUniqueID();
        this.hand = hand;
    }

    @Override
    public void readPacketData(PacketBuffer buf)
    {
        this.elements = new ElementStack[buf.readVarInt()];
        for (int i = 0; i < this.elements.length; i++)
            this.elements[i] = new ElementStack(buf);
        this.player = buf.readUniqueId();
        this.hand = buf.readEnumValue(Hand.class);
    }

    @Override
    public void writePacketData(PacketBuffer buf)
    {
        buf.writeVarInt(this.elements.length);
        for (ElementStack stack : this.elements)
            stack.write(buf);
        buf.writeUniqueId(this.player);
        buf.writeEnumValue(this.hand);
    }

    @Override
    public void processPacket(IChemistryClientPlayHandler handler, NetworkEvent.Context ctx)
    {
        handler.handleSyncGameBorderMessage(this, ctx);
    }

    /**
     * @return The elements in the stack
     */
    @OnlyIn(Dist.CLIENT)
    public ElementStack[] getElements()
    {
        return elements;
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
     * @return The hand the player is holding the element in
     */
    @OnlyIn(Dist.CLIENT)
    public Hand getHand()
    {
        return hand;
    }
}
