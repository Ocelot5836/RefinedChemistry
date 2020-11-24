package io.github.ocelot.refinedchemistry.common.element;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.LazyValue;
import net.minecraft.util.text.*;
import net.minecraftforge.common.util.Constants;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>A quantity of a single molecule.</p>
 *
 * @author Ocelot
 */
public class ChemistryMolecule
{
    public static final ChemistryMolecule EMPTY = new ChemistryMolecule();

    private final ChemistryAtom[] atoms;
    private int count;
    private ChemistryElementState state;

    private LazyValue<ITextComponent> name;
    private final LazyValue<Integer> color;

    public ChemistryMolecule(CompoundNBT nbt)
    {
        ListNBT elementsNbt = nbt.getList("Atoms", Constants.NBT.TAG_COMPOUND);
        ChemistryAtom[] atoms = new ChemistryAtom[elementsNbt.size()];
        for (int i = 0; i < atoms.length; i++)
            atoms[i] = new ChemistryAtom(elementsNbt.getCompound(i));
        this.atoms = mergeAtoms(atoms);
        this.count = nbt.getShort("Count");
        this.state = ChemistryElementState.values()[nbt.getByte("State") % ChemistryElementState.values().length];

        this.name = new LazyValue<>(() -> createName(this.state, this.atoms));
        this.color = new LazyValue<>(() -> createColor(this.atoms));
    }

    public ChemistryMolecule(PacketBuffer buf)
    {
        ChemistryAtom[] atoms = new ChemistryAtom[buf.readVarInt()];
        for (int i = 0; i < atoms.length; i++)
            atoms[i] = new ChemistryAtom(buf);
        this.atoms = mergeAtoms(atoms);
        this.count = buf.readShort();
        this.state = buf.readEnumValue(ChemistryElementState.class);

        this.name = new LazyValue<>(() -> createName(this.state, this.atoms));
        this.color = new LazyValue<>(() -> createColor(this.atoms));
    }

    public ChemistryMolecule(ChemistryAtom... atoms)
    {
        this(1, atoms);
    }

    public ChemistryMolecule(int count, ChemistryAtom... atoms)
    {
        this.atoms = mergeAtoms(atoms);
        this.count = count;
        this.state = ChemistryElementState.SOLID;

        this.name = new LazyValue<>(() -> createName(this.state, this.atoms));
        this.color = new LazyValue<>(() -> createColor(this.atoms));
    }

    /**
     * Writes the data from this molecule into the provided tag.
     *
     * @param nbt The tag to write data into
     */
    public CompoundNBT serializeNBT(CompoundNBT nbt)
    {
        ListNBT elementsNbt = new ListNBT();
        for (ChemistryAtom stack : this.atoms)
            elementsNbt.add(stack.serializeNBT(new CompoundNBT()));
        nbt.put("Atoms", elementsNbt);
        nbt.putShort("Count", (short) this.count);
        nbt.putByte("State", (byte) this.state.ordinal());
        return nbt;
    }

    /**
     * Writes the data from this molecule into the provided buffer.
     *
     * @param buf The buffer to write data into
     */
    public void write(PacketBuffer buf)
    {
        buf.writeVarInt(this.atoms.length);
        for (ChemistryAtom stack : this.atoms)
            stack.write(buf);
        buf.writeShort(this.count);
        buf.writeEnumValue(this.state);
    }

    /**
     * Increases the count in this molecule by the provided amount.
     *
     * @param count The amount to grow
     */
    public ChemistryMolecule grow(int count)
    {
        if (this == EMPTY)
            return this;
        this.count += count;
        return this;
    }

    /**
     * Decreases the count in this molecule by the provided amount.
     *
     * @param count The amount to shrink
     */
    public ChemistryMolecule shrink(int count)
    {
        if (this == EMPTY)
            return this;
        this.count -= count;
        return this;
    }

    /**
     * Attempts to split off the specified amount of this molecule.
     *
     * @param count The amount to take off
     * @return A new molecule with the provided count or less
     */
    public ChemistryMolecule split(int count)
    {
        int removeCount = Math.min(this.count, count);
        ChemistryMolecule copy = this.copy();
        copy.setCount(removeCount);
        this.count -= removeCount;
        return copy;
    }

    /**
     * @return Constructs a copy of this molecule
     */
    public ChemistryMolecule copy()
    {
        return this.isEmpty() ? EMPTY : new ChemistryMolecule(this.count, this.atoms);
    }

    /**
     * @return Whether or not this molecule is empty
     */
    public boolean isEmpty()
    {
        return this == EMPTY || this.atoms.length == 0 || this.count <= 0;
    }

    /**
     * @return The atoms represented in this molecule
     */
    public ChemistryAtom[] getAtoms()
    {
        return atoms;
    }

    /**
     * @return The amount of this molecule stored in milli-buckets
     */
    public int getCount()
    {
        return count;
    }

    /**
     * @return The state this molecule is in
     */
    public ChemistryElementState getState()
    {
        return state;
    }

    /**
     * @return The human friendly name of this molecule
     */
    public ITextComponent getName()
    {
        return this.name.getValue();
    }

    /**
     * @return The average color of the atoms in this molecule
     */
    public int getColor()
    {
        return this.color.getValue();
    }

    /**
     * Sets the amount of molecules in this stack in milli-buckets
     *
     * @param count The new amount
     */
    public ChemistryMolecule setCount(int count)
    {
        if (this == EMPTY)
            return this;
        this.count = count;
        return this;
    }

    /**
     * Sets the molecule of this compound
     *
     * @param state The new state of this compound
     */
    public ChemistryMolecule setState(ChemistryElementState state)
    {
        if (this == EMPTY)
            return this;
        this.state = state;
        this.name = new LazyValue<>(() -> createName(this.state, this.atoms));
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChemistryMolecule that = (ChemistryMolecule) o;
        return (this.isEmpty() && that.isEmpty()) || this.count == that.count && Arrays.equals(this.atoms, that.atoms);
    }

    @Override
    public int hashCode()
    {
        // Hash code of empty array is 1. 31 * 1 + 1 = 32
        return this.isEmpty() ? 32 : 31 * Objects.hash(this.count) + Arrays.hashCode(this.atoms);
    }

    @Override
    public String toString()
    {
        return this.isEmpty() ? "Empty Molecule" : this.count + " " + Arrays.stream(this.atoms).map(ChemistryAtom::getElementString).collect(Collectors.joining()) + " " + this.state.getName().getString();
    }

    private static ChemistryAtom[] mergeAtoms(ChemistryAtom[] atoms)
    {
        Map<ChemistryElement, ChemistryAtom> merged = new HashMap<>();
        for (ChemistryAtom atom : atoms)
        {
            if (!merged.containsKey(atom.getElement()))
            {
                merged.put(atom.getElement(), atom);
                continue;
            }
            merged.get(atom.getElement()).grow(atom.getCount());
        }
        return merged.values().stream().sorted(Comparator.comparing(atom -> atom.getElement().getSymbol())).toArray(ChemistryAtom[]::new);
    }

    private static ITextComponent createName(ChemistryElementState state, ChemistryAtom[] atoms)
    {
        IFormattableTextComponent name = new StringTextComponent("");
        for (ChemistryAtom atom : atoms)
            name.append(new StringTextComponent(atom.getElementString()).mergeStyle(Style.EMPTY.setColor(Color.fromInt(atom.getElement().getCpkColor()))));
        return name.appendString(" ").append(state.getName());
    }

    private static int createColor(ChemistryAtom[] atoms)
    {
        int totalCount = Arrays.stream(atoms).mapToInt(ChemistryAtom::getCount).sum();
        int newColor = 0;
        for (ChemistryAtom atom : atoms)
        {
            int elementColor = atom.getElement().getCpkColor();
            float percentage = (float) atom.getCount() / (float) totalCount;
            newColor += (int) (((elementColor >> 16) & 0xff) * percentage) << 16 | (int) (((elementColor >> 8) & 0xff) * percentage) << 8 | (int) ((elementColor & 0xff) * percentage);
        }
        return newColor;
    }
}
