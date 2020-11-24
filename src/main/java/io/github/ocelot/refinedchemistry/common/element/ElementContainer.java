package io.github.ocelot.refinedchemistry.common.element;

import net.minecraft.inventory.IClearable;

import java.util.List;
import java.util.function.Predicate;

/**
 * <p>Enables something to contain a specified amount of {@link ChemistryMolecule}.</p>
 *
 * @author Ocelot
 */
public interface ElementContainer extends IClearable
{
    /**
     * @return The molecules in this container
     */
    List<ChemistryMolecule> getMolecules();

    /**
     * Inserts the specified molecule into this container.
     *
     * @param molecule The molecule to add
     * @return The remaining molecules that could not be inserted
     */
    ChemistryMolecule insertMolecule(ChemistryMolecule molecule);

    /**
     * Removes the specified amount of the specified molecule.
     *
     * @param count The amount of that molecule to remove
     * @param state The state of matter to remove
     * @param atoms The atoms required in a molecule to remove
     * @return The molecule removed from this container
     */
    ChemistryMolecule removeMolecule(int count, ChemistryElementState state, ChemistryAtom... atoms);

    /**
     * Clears and sets the contents of this container to the provided molecules.
     *
     * @param molecules The new molecule contents
     */
    void setMolecules(ChemistryMolecule... molecules);

    /**
     * @return The total capacity of this container
     */
    int getCapacity();

    /**
     * @return The total count of all molecules in this container
     */
    int getCount();

    /**
     * @return The color of the content in this container
     */
    int getAverageColor();

    /**
     * Calculates the total percentage of the specified molecule is in this container.
     *
     * @param predicate  The filter to use when calculating percentage
     * @param cumulative Whether to calculate percentage based on the capacity of this container
     * @return The percentage of molecules that fit the provided filter
     */
    default float calculateFillPercentage(Predicate<ChemistryMolecule> predicate, boolean cumulative)
    {
        if (this.getMolecules().isEmpty())
            return 0;

        int total = 0;
        int current = 0;
        for (ChemistryMolecule molecule : this.getMolecules())
        {
            total += molecule.getCount();
            if (predicate.test(molecule))
                current += molecule.getCount();
        }
        return cumulative ? (float) current / (float) Math.min(total, this.getCapacity()) : (float) current / (float) total;
    }
}