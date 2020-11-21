package io.github.ocelot;

import com.google.common.base.Charsets;
import com.google.gson.*;
import io.github.ocelot.refinedchemistry.RefinedChemistry;
import io.github.ocelot.refinedchemistry.common.element.ChemistryElementState;
import io.github.ocelot.refinedchemistry.common.element.PeriodicTableSection;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.io.IOUtils;

import javax.annotation.Nullable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PeriodicTableGenerator
{
    private static final Gson GSON = new GsonBuilder().registerTypeAdapter(Element.class, new Element.Serializer()).setPrettyPrinting().create();
    private static final Pattern ATOMIC_MASS_PATTERN = Pattern.compile("\\(\\d+\\)");

    public static void main(String[] args) throws IOException
    {
        String classData = IOUtils.toString(PeriodicTableGenerator.class.getResourceAsStream("/periodic_class_template.java"), StandardCharsets.UTF_8);

        Element[] elements;
        try (InputStreamReader reader = new InputStreamReader(PeriodicTableGenerator.class.getResourceAsStream("/elements.json"))) // Periodic Table data from https://neelpatel05.pythonanywhere.com/
        {
            elements = GSON.fromJson(reader, Element[].class);
        }

        if (classData.contains("%ELEMENTS_ENUM%"))
        {
            String elementsEnum = Arrays.stream(elements).map(element ->
            {
                StringBuilder builder = new StringBuilder(element.name.toUpperCase(Locale.ROOT));

                builder.append('(');
                element.addInstanceParams(builder);
                builder.append(')');

                return builder;
            }).collect(Collectors.joining(",\n"));
            classData = classData.replaceAll("%ELEMENTS_ENUM%", elementsEnum);
        }

        if (classData.contains("%FIELDS%"))
        {
            StringBuilder builder = new StringBuilder();
            Element.addFields(builder);
            classData = classData.replaceAll("%FIELDS%", builder.toString());
        }

        if (classData.contains("%CONSTRUCTOR_PARAMS%"))
        {
            StringBuilder builder = new StringBuilder();
            Element.addConstructorParams(builder);
            classData = classData.replaceAll("%CONSTRUCTOR_PARAMS%", builder.toString());
        }

        if (classData.contains("%CONSTRUCTOR_SETTERS%"))
        {
            StringBuilder builder = new StringBuilder();
            Element.addConstructorSetters(builder);
            classData = classData.replaceAll("%CONSTRUCTOR_SETTERS%", builder.toString());
        }

        if (classData.contains("%GETTERS%"))
        {
            StringBuilder builder = new StringBuilder();
            Element.addGetters(builder);
            classData = classData.replaceAll("%GETTERS%", builder.toString());
        }

        Path outputFolder = Paths.get("src", "generated", "classes");
        Path outputClass = outputFolder.resolve("PeriodicTable.java");
        Path outputLang = outputFolder.resolve("en_us.json");

        Files.createDirectories(outputFolder);
        if (!Files.exists(outputClass))
            Files.createFile(outputClass);
        if (!Files.exists(outputLang))
            Files.createFile(outputLang);

        try (FileOutputStream os = new FileOutputStream(outputClass.toFile()))
        {
            IOUtils.write(classData, os, Charsets.UTF_8);
        }

        JsonObject langData = new JsonObject();
        for (Element element : elements)
            langData.addProperty(element.getTranslationKey(true), element.name);

        try (FileOutputStream os = new FileOutputStream(outputLang.toFile()))
        {
            IOUtils.write(GSON.toJson(langData), os, Charsets.UTF_8);
        }
    }

    private static class Element
    {
        private final double atomicMass;
        private final int atomicNumber;
        private final int atomicRadius;
        private final int boilingPoint;
        private final String bondingType;
        private final int cpkColor;
        private final double density;
        private final int electronAffinity;
        private final double electronegativity;
        private final String electronicConfiguration;
        private final PeriodicTableSection groupBlock;
        private final String ionRadius;
        private final int ionizationEnergy;
        private final int meltingPoint;
        private final String name;
        private final String oxidationStates;
        @Nullable
        private final ChemistryElementState standardState;
        private final String symbol;
        private final int vanDelWaalsRadius;
        private final int yearDiscovered;

        private Element(double atomicMass, int atomicNumber, int atomicRadius, int boilingPoint, String bondingType, int cpkColor, double density, int electronAffinity, double electronegativity, String electronicConfiguration, PeriodicTableSection groupBlock, String ionRadius, int ionizationEnergy, int meltingPoint, String name, String oxidationStates, @Nullable ChemistryElementState standardState, String symbol, int vanDelWaalsRadius, int yearDiscovered)
        {
            this.atomicMass = atomicMass;
            this.atomicNumber = atomicNumber;
            this.atomicRadius = atomicRadius;
            this.boilingPoint = boilingPoint;
            this.bondingType = bondingType;
            this.cpkColor = cpkColor;
            this.density = density;
            this.electronAffinity = electronAffinity;
            this.electronegativity = electronegativity;
            this.electronicConfiguration = electronicConfiguration;
            this.groupBlock = groupBlock;
            this.ionRadius = ionRadius;
            this.ionizationEnergy = ionizationEnergy;
            this.meltingPoint = meltingPoint;
            this.name = name;
            this.oxidationStates = oxidationStates;
            this.standardState = standardState;
            this.symbol = symbol;
            this.vanDelWaalsRadius = vanDelWaalsRadius;
            this.yearDiscovered = yearDiscovered;
        }

        private static double getAtomicMass(String atomicMass)
        {
            return Double.parseDouble(ATOMIC_MASS_PATTERN.matcher(atomicMass).replaceAll(""));
        }

        public String getTranslationKey(boolean insertLiteral)
        {
            return "element." + (insertLiteral ? RefinedChemistry.MOD_ID : "\" + RefinedChemistry.MOD_ID + \"") + "." + this.name.toLowerCase(Locale.ROOT).replaceAll(" ", "_");
        }

        public void addInstanceParams(StringBuilder builder)
        {
            builder.append(Arrays.stream(this.getClass().getDeclaredFields()).map(field ->
            {
                try
                {
                    if ("name".equals(field.getName()))
                        return "new TranslationTextComponent(\"" + this.getTranslationKey(false) + "\")";

                    Object value = field.get(this);
                    if ("cpkColor".equals(field.getName()))
                        return ((Integer) value) == 68 ? "0x00e675" : "0x" + Integer.toHexString((Integer) value);
                    if (CharSequence.class.isAssignableFrom(field.getType()))
                        return "\"" + value + "\"";
                    if (value != null && Enum.class.isAssignableFrom(field.getType()))
                        return field.getType().getSimpleName() + "." + value;
                    return String.valueOf(value);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    return "";
                }
            }).collect(Collectors.joining(", ")));
        }

        public static void addFields(StringBuilder builder)
        {
            builder.append(Arrays.stream(Element.class.getDeclaredFields()).map(field -> "private final " + processType(field).getSimpleName() + " " + field.getName() + ";").collect(Collectors.joining()));
        }

        public static void addConstructorParams(StringBuilder builder)
        {
            builder.append(Arrays.stream(Element.class.getDeclaredFields()).map(field -> processAnnotations(field) + processType(field).getSimpleName() + " " + field.getName()).collect(Collectors.joining(", ")));
        }

        public static void addConstructorSetters(StringBuilder builder)
        {
            builder.append(Arrays.stream(Element.class.getDeclaredFields()).map(field -> "this." + field.getName() + " = " + field.getName() + ";").collect(Collectors.joining("\n")));
        }

        public static void addGetters(StringBuilder builder)
        {
            builder.append(Arrays.stream(Element.class.getDeclaredFields()).map(field -> processAnnotations(field) + "public " + processType(field).getSimpleName() + " get" + field.getName().substring(0, 1).toUpperCase(Locale.ROOT) + field.getName().substring(1) + "(){return " + field.getName() + ";}").collect(Collectors.joining("\n")));
        }

        private static String processAnnotations(Field field)
        {
            return Arrays.stream(field.getAnnotations()).map(annotation -> "@" + annotation.annotationType().getSimpleName()).collect(Collectors.joining(" ")) + (field.getAnnotations().length > 0 ? " " : "");
        }

        private static Class<?> processType(Field field)
        {
            return "name".equals(field.getName()) ? ITextComponent.class : field.getType();
        }

        @Override
        public String toString()
        {
            return "Element{" +
                    "atomicMass='" + atomicMass + '\'' +
                    ", atomicNumber=" + atomicNumber +
                    ", atomicRadius=" + atomicRadius +
                    ", boilingPoint=" + boilingPoint +
                    ", bondingType='" + bondingType + '\'' +
                    ", cpkColor='" + cpkColor + '\'' +
                    ", density=" + density +
                    ", electronAffinity=" + electronAffinity +
                    ", electronegativity=" + electronegativity +
                    ", electronicConfiguration='" + electronicConfiguration + '\'' +
                    ", groupBlock='" + groupBlock + '\'' +
                    ", ionRadius='" + ionRadius + '\'' +
                    ", ionizationEnergy=" + ionizationEnergy +
                    ", meltingPoint=" + meltingPoint +
                    ", name='" + name + '\'' +
                    ", oxidationStates='" + oxidationStates + '\'' +
                    ", standardState='" + standardState + '\'' +
                    ", symbol='" + symbol + '\'' +
                    ", vanDelWaalsRadius=" + vanDelWaalsRadius +
                    ", yearDiscovered=" + yearDiscovered +
                    '}';
        }

        private static class Serializer implements JsonDeserializer<Element>
        {
            @Override
            public Element deserialize(JsonElement element, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
            {
                JsonObject json = element.getAsJsonObject();
                JsonElement atomicMassJson = json.get("atomicMass");
                String atomicMass = atomicMassJson.isJsonArray() ? atomicMassJson.getAsJsonArray().get(0).getAsString() : context.deserialize(atomicMassJson, String.class);
                int atomicNumber = context.deserialize(json.get("atomicNumber"), int.class);
                int atomicRadius = getOptionalInt(json, "atomicRadius", context);
                int boilingPoint = getOptionalInt(json, "boilingPoint", context);
                String bondingType = context.deserialize(json.get("bondingType"), String.class);
                String cpkHexColor = context.deserialize(json.get("cpkHexColor"), String.class);
                double density = getOptionalDouble(json, "density", context);
                int electronAffinity = getOptionalInt(json, "electronAffinity", context);
                double electronegativity = getOptionalDouble(json, "electronegativity", context);
                String electronicConfiguration = context.deserialize(json.get("electronicConfiguration"), String.class);
                String groupBlock = context.deserialize(json.get("groupBlock"), String.class);
                String ionRadius = context.deserialize(json.get("ionRadius"), String.class);
                int ionizationEnergy = getOptionalInt(json, "ionizationEnergy", context);
                int meltingPoint = getOptionalInt(json, "meltingPoint", context);
                String name = context.deserialize(json.get("name"), String.class);
                String oxidationStates = context.deserialize(json.get("oxidationStates"), String.class);
                String standardState = context.deserialize(json.get("standardState"), String.class);
                String symbol = context.deserialize(json.get("symbol"), String.class);
                int vanDelWaalsRadius = getOptionalInt(json, "vanDelWaalsRadius", context);
                int yearDiscovered = getYear(json, context);
                // Hack for Fluorine which is not a hex for some reason
                if ("9e+51".equals(cpkHexColor))
                    cpkHexColor = "90e050";
                return new Element(getAtomicMass(atomicMass), atomicNumber, atomicRadius, boilingPoint, bondingType, cpkHexColor.isEmpty() ? -1 : Integer.parseUnsignedInt(cpkHexColor, 16), density, electronAffinity, electronegativity, electronicConfiguration, PeriodicTableSection.byName(groupBlock), ionRadius, ionizationEnergy, meltingPoint, name, oxidationStates, standardState.isEmpty() ? null : ChemistryElementState.byName(standardState), symbol, vanDelWaalsRadius, yearDiscovered);
            }

            private static int getOptionalInt(JsonObject json, String name, JsonDeserializationContext context)
            {
                JsonElement element = json.get(name);
                if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString())
                    return Integer.MIN_VALUE;
                return context.deserialize(element, int.class);
            }

            private static int getYear(JsonObject json, JsonDeserializationContext context)
            {
                JsonElement element = json.get("yearDiscovered");
                if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString())
                    return -1;
                return context.deserialize(element, int.class);
            }

            private static double getOptionalDouble(JsonObject json, String name, JsonDeserializationContext context)
            {
                JsonElement element = json.get(name);
                if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString())
                    return Double.MIN_VALUE;
                return context.deserialize(element, double.class);
            }
        }
    }
}
