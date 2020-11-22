package io.github.ocelot.refinedchemistry.common.element;

import org.apache.commons.lang3.Validate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>A basic implementation of {@link ElementContainer}.</p>
 *
 * @author Ocelot
 */
public class SimpleElementContainer implements ElementContainer
{
    private final Map<ChemistryElement, ElementStack> elements;
    private final int capacity;
    private int count;

    public SimpleElementContainer()
    {
        this(0);
    }

    public SimpleElementContainer(int capacity)
    {
        this.elements = new HashMap<>();
        Validate.isTrue(capacity >= 0, "Capacity can not be less than zero");
        this.capacity = capacity;
        this.count = 0;
    }

    @Override
    public Collection<ElementStack> getElements()
    {
        return this.elements.values();
    }

    @Override
    public ElementStack insertElement(ElementStack stack)
    {
        if (stack.isEmpty() || this.capacity == 0)
            return stack;
        ElementStack internalStack = this.elements.computeIfAbsent(stack.getElement(), ElementStack::new);
        if (this.count + stack.getCount() > this.capacity)
        {
            ElementStack copy = stack.copy();
            internalStack.setCount(this.capacity - this.count);
            copy.shrink(this.capacity - this.count);
            this.count += copy.getCount();
            return copy;
        }
        internalStack.setCount(internalStack.getCount() + stack.getCount());
        this.count += stack.getCount();
        return ElementStack.EMPTY;
    }

    @Override
    public ElementStack removeElement(ChemistryElement element, int count)
    {
        if (!this.elements.containsKey(element))
            return ElementStack.EMPTY;
        ElementStack internalStack = this.elements.get(element);
        ElementStack removed = internalStack.split(count);
        if (internalStack.isEmpty())
            this.elements.remove(element);
        return removed;
    }

    @Override
    public ElementStack getElement(ChemistryElement element)
    {
        return this.elements.getOrDefault(element, ElementStack.EMPTY);
    }

    @Override
    public void setElement(ElementStack stack)
    {
        if (stack.isEmpty())
        {
            this.elements.remove(stack.getElement());
        }
        else
        {
            this.elements.put(stack.getElement(), stack);
        }
    }

    @Override
    public int getCount()
    {
        return count;
    }

    @Override
    public int getCapacity()
    {
        return capacity;
    }
}
