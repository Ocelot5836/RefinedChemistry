package io.github.ocelot.refinedchemistry.common.element;

import com.google.gson.JsonSyntaxException;

public enum ChemistryElementState
{
    SOLID,
    LIQUID,
    GAS;

    public static ChemistryElementState byName(String name)
    {
        for (ChemistryElementState section : values())
            if (section.name().equalsIgnoreCase(name))
                return section;
        throw new JsonSyntaxException("Unknown state: " + name);
    }
}
