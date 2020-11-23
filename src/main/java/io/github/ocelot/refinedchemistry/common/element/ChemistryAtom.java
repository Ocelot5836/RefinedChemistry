package io.github.ocelot.refinedchemistry.common.element;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.common.util.Constants;

import java.util.Objects;

/**
 * <p>A quantity of a single atom.</p>
 *
 * @author Ocelot
 */
public class ChemistryAtom
{
    public static final ChemistryAtom EMPTY = new ChemistryAtom((ChemistryElement) null);

    private final ChemistryElement element;
    private int count;

    public ChemistryAtom(CompoundNBT nbt)
    {
        this.element = nbt.contains("Element", Constants.NBT.TAG_ANY_NUMERIC) ? ChemistryElement.values()[nbt.getShort("Element") % ChemistryElement.values().length] : null;
        this.count = nbt.getShort("Count");
    }

    public ChemistryAtom(PacketBuffer buf)
    {
        this.element = buf.readBoolean() ? buf.readEnumValue(ChemistryElement.class) : null;
        this.count = buf.readShort();
    }

    public ChemistryAtom(ChemistryElement element)
    {
        this(element, 1);
    }

    public ChemistryAtom(ChemistryElement element, int count)
    {
        this.element = element;
        this.count = count;
    }

    /**
     * Writes the data from this atom into the provided tag.
     *
     * @param nbt The tag to write data into
     */
    public CompoundNBT serializeNBT(CompoundNBT nbt)
    {
        if (this.element != null)
            nbt.putShort("Element", (short) this.element.ordinal());
        nbt.putShort("Count", (short) this.count);
        return nbt;
    }

    /**
     * Writes the data from this atom into the provided buffer.
     *
     * @param buf The buffer to write data into
     */
    public void write(PacketBuffer buf)
    {
        buf.writeBoolean(this.element != null);
        if (this.element != null)
            buf.writeEnumValue(this.element);
        buf.writeShort(this.count);
    }

    /**
     * Increases the count in this atom by the provided amount.
     *
     * @param count The amount to grow
     */
    public void grow(int count)
    {
        if (this == EMPTY)
            return;
        this.count += count;
    }

    /**
     * Decreases the count in this atom by the provided amount.
     *
     * @param count The amount to shrink
     */
    public void shrink(int count)
    {
        if (this == EMPTY)
            return;
        this.count -= count;
    }

    /**
     * Attempts to split off the specified amount of this atom.
     *
     * @param count The amount to take off
     * @return A new atom with the provided count or less
     */
    public ChemistryAtom split(int count)
    {
        int removeCount = Math.min(this.count, count);
        ChemistryAtom copy = this.copy();
        copy.setCount(removeCount);
        this.count -= removeCount;
        return copy;
    }

    /**
     * @return Constructs a copy of this atom
     */
    public ChemistryAtom copy()
    {
        return this.isEmpty() ? EMPTY : new ChemistryAtom(this.element, this.count);
    }

    /**
     * @return Whether or not this atom is empty
     */
    public boolean isEmpty()
    {
        return this == EMPTY || this.element == null || this.count <= 0;
    }

    /**
     * @return The atom represented in this stack
     */
    public ChemistryElement getElement()
    {
        return element;
    }

    /**
     * @return The amount of this atom stored in milli-buckets
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Sets the amount of atom in this stack in milli-buckets
     *
     * @param count The new amount
     */
    public void setCount(int count)
    {
        if (this == EMPTY)
            return;
        this.count = count;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChemistryAtom stack = (ChemistryAtom) o;
        return (this.isEmpty() && stack.isEmpty()) || count == stack.count && element == stack.element;
    }

    @Override
    public int hashCode()
    {
        return this.isEmpty() ? Objects.hash(EMPTY.element, EMPTY.count) : Objects.hash(element, count);
    }

    @Override
    public String toString()
    {
        return this.isEmpty() ? "Empty Atom" : this.count + " " + this.element.getName().getString() + " Atom(s)";
    }
}
