package io.github.ocelot.refinedchemistry.common.element;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

/**
 * <p>Specifies all elements on the Periodic Table.</p>
 *
 * @author Ocelot
 */
public enum ChemistryElements
{
    %ELEMENTS_ENUM%;

    %FIELDS%

    ChemistryElements(%CONSTRUCTOR_PARAMS%)
    {
        %CONSTRUCTOR_SETTERS%
    }

    %GETTERS%
}