package io.github.ocelot.refinedchemistry.common.element;

import org.apache.commons.lang3.Validate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>A basic implementation of {@link ElementContainer}.</p>
 *
 * @author Ocelot
 */
public class SimpleElementContainer implements ElementContainer
{
    private static final Comparator<ChemistryMolecule> COMPARATOR = (o1, o2) -> ChemistryElementState.values().length * (o2.getCount() - o1.getCount()) + o2.getState().ordinal() - o1.getState().ordinal();
    private final List<ChemistryMolecule> molecules;
    private final int capacity;
    private final Cache cache;

    public SimpleElementContainer()
    {
        this(0);
    }

    public SimpleElementContainer(int capacity)
    {
        Validate.isTrue(capacity >= 0, "Capacity can not be less than zero");
        this.molecules = new LinkedList<>();
        this.capacity = capacity;
        this.cache = new Cache();
    }

    /**
     * Finds an existing molecule of the same composition or creates a new empty one.
     *
     * @param state The state of matter the molecule should be in
     * @param atoms The atoms to search for in a molecule
     * @return A pre-existing molecule of provided composition or a new, empty molecule
     */
    private ChemistryMolecule findMatching(ChemistryElementState state, ChemistryAtom... atoms)
    {
        for (ChemistryMolecule internalMolecule : this.molecules)
            if (internalMolecule.getState() == state && Arrays.equals(internalMolecule.getAtoms(), atoms))
                return internalMolecule;
        return new ChemistryMolecule(0, atoms).setState(state);
    }

    @Override
    public List<ChemistryMolecule> getMolecules()
    {
        return this.molecules;
    }

    @Override
    public ChemistryMolecule insertMolecule(ChemistryMolecule molecule)
    {
        if (molecule.isEmpty() || this.capacity == 0 || this.cache.count == this.capacity)
            return molecule;
        System.out.println("Inserting " + molecule);

        ChemistryMolecule internalMolecule = this.findMatching(molecule.getState(), molecule.getAtoms());
        if (internalMolecule.isEmpty())
            this.molecules.add(internalMolecule);
        if (this.cache.count + molecule.getCount() > this.capacity)
        {
            ChemistryMolecule copy = molecule.copy();
            internalMolecule.setCount(this.capacity - this.cache.count);
            copy.shrink(this.capacity - this.cache.count);
            this.cache.count += this.capacity - this.cache.count;
            this.cache.recalculateColor();
            this.molecules.sort(COMPARATOR);
            return copy;
        }

        internalMolecule.setCount(internalMolecule.getCount() + molecule.getCount());
        this.cache.count += molecule.getCount();
        this.cache.recalculateColor();
        this.molecules.sort(COMPARATOR);
        return ChemistryMolecule.EMPTY;
    }

    @Override
    public ChemistryMolecule removeMolecule(int count, ChemistryElementState state, ChemistryAtom... atoms)
    {
        ChemistryMolecule molecule = this.findMatching(state, atoms);
        if (molecule.isEmpty())
            return ChemistryMolecule.EMPTY;

        ChemistryMolecule removed = molecule.split(count);
        if (molecule.isEmpty())
            this.molecules.remove(molecule);
        this.cache.count -= removed.getCount();
        this.cache.recalculateColor();
        this.molecules.sort(COMPARATOR);
        return removed;
    }

    @Override
    public void setMolecules(ChemistryMolecule... molecules)
    {
        this.clear();
        for (ChemistryMolecule molecule : molecules)
        {
            this.molecules.add(molecule);
            this.cache.count += molecule.getCount();
        }
        this.cache.recalculateColor();
        this.molecules.sort(COMPARATOR);
    }

    @Override
    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public int getCount()
    {
        return this.cache.count;
    }

    @Override
    public int getAverageColor()
    {
        return this.cache.averageColor;
    }

    @Override
    public void clear()
    {
        this.molecules.clear();
        this.cache.count = 0;
        this.cache.averageColor = 0xffffff;
    }

    private class Cache
    {
        private int count;
        private int averageColor;

        private void recalculateColor()
        {
            if (SimpleElementContainer.this.getMolecules().isEmpty())
            {
                this.averageColor = 0xffffff;
                return;
            }

            this.averageColor = 0;
            for (ChemistryMolecule molecule : SimpleElementContainer.this.getMolecules())
            {
                int moleculeColor = molecule.getColor();
                float percentage = (float) molecule.getCount() / (float) this.count;
                this.averageColor += (int) (((moleculeColor >> 16) & 0xff) * percentage) << 16 | (int) (((moleculeColor >> 8) & 0xff) * percentage) << 8 | (int) ((moleculeColor & 0xff) * percentage);
            }
        }
    }
}
