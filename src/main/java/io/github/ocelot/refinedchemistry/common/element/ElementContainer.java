package io.github.ocelot.refinedchemistry.common.element;

import net.minecraft.inventory.IClearable;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * <p>Enables something to contain a specified amount of {@link ElementStack}.</p>
 *
 * @author Ocelot
 */
public interface ElementContainer extends IClearable
{
    /**
     * @return The elements in this container
     */
    Collection<ElementStack> getElements();

    /**
     * Inserts the specified element into this container.
     *
     * @param stack The stack to add
     * @return The remaining elements that could not be inserted
     */
    ElementStack insertElement(ElementStack stack);

    /**
     * Removes the specified amount of the specified stack.
     *
     * @param element The element to remove
     * @param count   The amount of that element to remove
     * @return The stack of element removed from this container
     */
    ElementStack removeElement(ChemistryElement element, int count);

    /**
     * Fetches a stack of elements by the specified element.
     *
     * @param element The element to get the stacl for
     * @return The stack of that element in this container
     */
    ElementStack getElement(ChemistryElement element);

    /**
     * Sets the stack for the specified element.
     *
     * @param stack The new stack for that element
     */
    void setElement(ElementStack stack);

    /**
     * @return The total capacity of this container
     */
    int getCapacity();

    /**
     * @return The total count of all elements in this container
     */
    int getCount();

    /**
     * @return The color of the content in this container
     */
    int getAverageColor();

    /**
     * Calculates the total percentage of the specified element is in this container.
     *
     * @param predicate  The filter to use when calculating percentage
     * @param cumulative Whether to calculate percentage based on the capacity of this container
     * @return The percentage of elements that fit the provided filter
     */
    default float calculateFillPercentage(Predicate<ElementStack> predicate, boolean cumulative)
    {
        if (this.getElements().isEmpty())
            return 0;

        int total = 0;
        int current = 0;
        for (ElementStack stack : this.getElements())
        {
            total += stack.getCount();
            if (predicate.test(stack))
                current++;
        }
        return cumulative ? (float) current / (float) Math.min(total, this.getCapacity()) : (float) current / (float) total;
    }
}