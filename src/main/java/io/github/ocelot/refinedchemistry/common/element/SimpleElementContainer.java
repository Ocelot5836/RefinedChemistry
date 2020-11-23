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
    private final Cache cache;

    public SimpleElementContainer()
    {
        this(0);
    }

    public SimpleElementContainer(int capacity)
    {
        this.elements = new HashMap<>();
        Validate.isTrue(capacity >= 0, "Capacity can not be less than zero");
        this.capacity = capacity;
        this.cache = new Cache();
    }

    @Override
    public Collection<ElementStack> getElements()
    {
        return this.elements.values();
    }

    @Override
    public ElementStack insertElement(ElementStack stack)
    {
        if (stack.isEmpty() || this.capacity == 0 || this.cache.count == this.capacity)
            return stack;
        System.out.println("Inserting " + stack);
        ElementStack internalStack = this.elements.computeIfAbsent(stack.getElement(), key -> new ElementStack(key, 0));
        if (this.cache.count + stack.getCount() > this.capacity)
        {
            ElementStack copy = stack.copy();
            internalStack.setCount(this.capacity - this.cache.count);
            copy.shrink(this.capacity - this.cache.count);
            this.cache.count += this.capacity - this.cache.count;
            this.cache.calculateColor();
            return copy;
        }
        internalStack.setCount(internalStack.getCount() + stack.getCount());
        this.cache.count += stack.getCount();
        this.cache.calculateColor();
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
        this.cache.count -= removed.getCount();
        this.cache.calculateColor();
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
            this.elements.put(stack.getElement(), stack.copy());
            this.cache.count += stack.getCount();
            this.cache.calculateColor();
        }
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
        this.elements.clear();
        this.cache.count = 0;
        this.cache.averageColor = 0xffffff;
    }

    private class Cache
    {
        private int count;
        private int averageColor;

        private void calculateColor()
        {
            if (SimpleElementContainer.this.getElements().isEmpty())
            {
                this.averageColor = 0xffffff;
                return;
            }

            int newColor = 0;
            for (ElementStack stack : SimpleElementContainer.this.getElements())
            {
                int elementColor = stack.getElement().getCpkColor();
                float percentage = (float) stack.getCount() / (float) this.count;
                newColor += (int) (((elementColor >> 16) & 0xff) * percentage) << 16 | (int) (((elementColor >> 8) & 0xff) * percentage) << 8 | (int) ((elementColor & 0xff) * percentage);
            }
            this.averageColor = newColor;
        }
    }
}
