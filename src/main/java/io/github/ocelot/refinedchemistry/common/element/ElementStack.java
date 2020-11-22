package io.github.ocelot.refinedchemistry.common.element;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.Constants;

import java.util.Locale;

/**
 * <p>A quantity of a single element.</p>
 *
 * @author Ocelot
 */
public class ElementStack
{
    public static final ElementStack EMPTY = new ElementStack((ChemistryElement) null);

    private final ChemistryElement element;
    private int count;

    public ElementStack(CompoundNBT nbt)
    {
        this.element = nbt.contains("Element", Constants.NBT.TAG_STRING) ? ChemistryElement.byName(nbt.getString("Element")) : null;
        this.count = nbt.getShort("Count");
    }

    public ElementStack(ChemistryElement element)
    {
        this(element, 1);
    }

    public ElementStack(ChemistryElement element, int count)
    {
        this.element = element;
        this.count = count;
    }

    /**
     * Writes the data from this stack into the provided tag.
     *
     * @param nbt The tag to write data into
     */
    public CompoundNBT serializeNBT(CompoundNBT nbt)
    {
        if (this.element != null)
            nbt.putString("Element", this.element.name().toLowerCase(Locale.ROOT));
        nbt.putShort("Count", (short) this.count);
        return nbt;
    }

    /**
     * Increases the count in this stack by the provided amount.
     *
     * @param count The amount to grow
     */
    public void grow(int count)
    {
        this.count += count;
    }

    /**
     * Decreases the count in this stack by the provided amount.
     *
     * @param count The amount to shrink
     */
    public void shrink(int count)
    {
        this.count -= count;
    }

    /**
     * Attempts to split off the specified amount of this element.
     *
     * @param count The amount to take off
     * @return A new stack with the provided count or less
     */
    public ElementStack split(int count)
    {
        int removeCount = Math.min(this.count, count);
        ElementStack copy = this.copy();
        copy.setCount(removeCount);
        this.count -= removeCount;
        return copy;
    }

    /**
     * @return Constructs a copy of this stack
     */
    public ElementStack copy()
    {
        return this.isEmpty() ? EMPTY : new ElementStack(this.element, this.count);
    }

    /**
     * @return Whether or not this element stack is empty
     */
    public boolean isEmpty()
    {
        return this == EMPTY || this.element == null || this.count <= 0;
    }

    /**
     * @return The element represented in this stack
     */
    public ChemistryElement getElement()
    {
        return element;
    }

    /**
     * @return The amount of this element stored in milli-buckets
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Sets the amount of element in this stack in milli-buckets
     *
     * @param count The new amount
     */
    public void setCount(int count)
    {
        this.count = count;
    }
}
