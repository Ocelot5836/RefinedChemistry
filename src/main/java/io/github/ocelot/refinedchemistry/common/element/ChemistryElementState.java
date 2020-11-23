package io.github.ocelot.refinedchemistry.common.element;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Locale;

/**
 * <p>A single state of matter for an atom.</p>
 *
 * @author Ocelot
 */
public enum ChemistryElementState
{
    SOLID,
    LIQUID,
    GAS;

    private final ITextComponent name;

    ChemistryElementState()
    {
        this.name = new TranslationTextComponent("state." + RefinedChemistry.MOD_ID + "." + this.name().toLowerCase(Locale.ROOT));
    }

    public ITextComponent getName()
    {
        return name;
    }

    public static ChemistryElementState byName(String name)
    {
        for (ChemistryElementState section : values())
            if (section.name().equalsIgnoreCase(name))
                return section;
        return SOLID;
    }
}
