package io.github.ocelot.refinedchemistry.common.element;

import com.google.gson.JsonSyntaxException;
import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Locale;

public enum PeriodicTableSection
{
    NONMETAL,
    ALKALI_METAL,
    ALKALINE_EARTH_METAL,
    LANTHANOID,
    ACTINOID,
    TRANSITION_METAL,
    POST_TRANSITION_METAL,
    METAL,
    METALLOID,
    HALOGEN,
    NOBLE_GAS;

    private final ITextComponent displayName;

    PeriodicTableSection()
    {
        this.displayName = new TranslationTextComponent("section." + RefinedChemistry.MOD_ID + "." + this.name().toLowerCase(Locale.ROOT));
    }

    public ITextComponent getDisplayName()
    {
        return displayName;
    }

    public static PeriodicTableSection byName(String name)
    {
        for (PeriodicTableSection section : values())
            if (section.name().equalsIgnoreCase(name.replaceAll("[ -]", "_")))
                return section;
        throw new JsonSyntaxException("Unknown section: " + name);
    }
}
