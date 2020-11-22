package io.github.ocelot.refinedchemistry.common.element;

import java.util.Collection;

/**
 * <p>Allows a player to become incredibly strong at will.</p>
 *
 * @author Ocelot
 */
public interface ElementContainer
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
     * @return The total count of all elements in this container
     */
    int getCount();

    /**
     * @return The total capacity of this container
     */
    int getCapacity();
}