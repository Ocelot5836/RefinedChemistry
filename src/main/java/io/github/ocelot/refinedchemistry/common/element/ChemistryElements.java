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
    HYDROGEN(1.00794, 1, 37, 20, "diatomic", 0xffffff, 8.99E-5, -73, 2.2, "1s1", PeriodicTableSection.NONMETAL, "", 1312, 14, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hydrogen"), "-1, 1", ChemistryElementState.GAS, "H", 120, 1766),
    HELIUM(4.002602, 2, 32, 4, "atomic", 0xd9ffff, 1.785E-4, 0, 4.9E-324, "1s2", PeriodicTableSection.NOBLE_GAS, "", 2372, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".helium"), "", ChemistryElementState.GAS, "He", 140, 1868),
    LITHIUM(6.941, 3, 134, 1615, "metallic", 0xcc80ff, 0.535, -60, 0.98, "[He] 2s1", PeriodicTableSection.ALKALI_METAL, "76 (+1)", 520, 454, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lithium"), "1", ChemistryElementState.SOLID, "Li", 182, 1817),
    BERYLLIUM(9.012182, 4, 90, 2743, "metallic", 0xc2ff00, 1.848, 0, 1.57, "[He] 2s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "45 (+2)", 900, 1560, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".beryllium"), "2", ChemistryElementState.SOLID, "Be", -2147483648, 1798),
    BORON(10.811, 5, 82, 4273, "covalent network", 0xffb5b5, 2.46, -27, 2.04, "[He] 2s2 2p1", PeriodicTableSection.METALLOID, "27 (+3)", 801, 2348, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".boron"), "1, 2, 3", ChemistryElementState.SOLID, "B", -2147483648, 1807),
    CARBON(12.0107, 6, 77, 4300, "covalent network", 0x909090, 2.26, -154, 2.55, "[He] 2s2 2p2", PeriodicTableSection.NONMETAL, "16 (+4)", 1087, 3823, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".carbon"), "-4, -3, -2, -1, 1, 2, 3, 4", ChemistryElementState.SOLID, "C", 170, -1),
    NITROGEN(14.0067, 7, 75, 77, "diatomic", 0x3050f8, 0.001251, -7, 3.04, "[He] 2s2 2p3", PeriodicTableSection.NONMETAL, "146 (-3)", 1402, 63, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nitrogen"), "-3, -2, -1, 1, 2, 3, 4, 5", ChemistryElementState.GAS, "N", 155, 1772),
    OXYGEN(15.9994, 8, 73, 90, "diatomic", 0xff0d0d, 0.001429, -141, 3.44, "[He] 2s2 2p4", PeriodicTableSection.NONMETAL, "140 (-2)", 1314, 55, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".oxygen"), "-2, -1, 1, 2", ChemistryElementState.GAS, "O", 152, 1774),
    FLUORINE(18.9984032, 9, 71, 85, "atomic", 0x90e050, 0.001696, -328, 3.98, "[He] 2s2 2p5", PeriodicTableSection.HALOGEN, "133 (-1)", 1681, 54, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".fluorine"), "-1", ChemistryElementState.GAS, "F", 147, 1670),
    NEON(20.1797, 10, 69, 27, "atomic", 0xb3e3f5, 9.0E-4, 0, 4.9E-324, "[He] 2s2 2p6", PeriodicTableSection.NOBLE_GAS, "", 2081, 25, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neon"), "", ChemistryElementState.GAS, "Ne", 154, 1898),
    SODIUM(22.98976928, 11, 154, 1156, "metallic", 0xab5cf2, 0.968, -53, 0.93, "[Ne] 3s1", PeriodicTableSection.ALKALI_METAL, "102 (+1)", 496, 371, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".sodium"), "-1, 1", ChemistryElementState.SOLID, "Na", 227, 1807),
    MAGNESIUM(24.305, 12, 130, 1363, "metallic", 0x8aff00, 1.738, 0, 1.31, "[Ne] 3s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "72 (+2)", 738, 923, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".magnesium"), "1, 2", ChemistryElementState.SOLID, "Mg", 173, 1808),
    ALUMINUM(26.9815386, 13, 118, 2792, "metallic", 0xbfa6a6, 2.7, -43, 1.61, "[Ne] 3s2 3p1", PeriodicTableSection.METAL, "53.5 (+3)", 578, 933, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".aluminum"), "1, 3", ChemistryElementState.SOLID, "Al", -2147483648, -1),
    SILICON(28.0855, 14, 111, 3173, "metallic", 0xf0c8a0, 2.33, -134, 1.9, "[Ne] 3s2 3p2", PeriodicTableSection.METALLOID, "40 (+4)", 787, 1687, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".silicon"), "-4, -3, -2, -1, 1, 2, 3, 4", ChemistryElementState.SOLID, "Si", 210, 1854),
    PHOSPHORUS(30.973762, 15, 106, 554, "covalent network", 0xff8000, 1.823, -72, 2.19, "[Ne] 3s2 3p3", PeriodicTableSection.NONMETAL, "44 (+3)", 1012, 317, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".phosphorus"), "-3, -2, -1, 1, 2, 3, 4, 5", ChemistryElementState.SOLID, "P", 180, 1669),
    SULFUR(32.065, 16, 102, 718, "covalent network", 0xffff30, 1.96, -200, 2.58, "[Ne] 3s2 3p4", PeriodicTableSection.NONMETAL, "184 (-2)", 1000, 388, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".sulfur"), "-2, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "S", 180, -1),
    CHLORINE(35.453, 17, 99, 239, "covalent network", 0x1ff01f, 0.003214, -349, 3.16, "[Ne] 3s2 3p5", PeriodicTableSection.HALOGEN, "181 (-1)", 1251, 172, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".chlorine"), "-1, 1, 2, 3, 4, 5, 6, 7", ChemistryElementState.GAS, "Cl", 175, 1774),
    ARGON(39.948, 18, 97, 87, "atomic", 0x80d1e3, 0.001784, 0, 4.9E-324, "[Ne] 3s2 3p6", PeriodicTableSection.NOBLE_GAS, "", 1521, 84, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".argon"), "", ChemistryElementState.GAS, "Ar", 188, 1894),
    POTASSIUM(39.0983, 19, 196, 1032, "metallic", 0x8f40d4, 0.856, -48, 0.82, "[Ar] 4s1", PeriodicTableSection.ALKALI_METAL, "138 (+1)", 419, 337, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".potassium"), "1", ChemistryElementState.SOLID, "K", 275, 1807),
    CALCIUM(40.078, 20, 174, 1757, "metallic", 0x3dff00, 1.55, -2, 1.0, "[Ar] 4s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "100 (+2)", 590, 1115, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".calcium"), "2", ChemistryElementState.SOLID, "Ca", -2147483648, -1),
    SCANDIUM(44.955912, 21, 144, 3103, "metallic", 0xe6e6e6, 2.985, -18, 1.36, "[Ar] 3d1 4s2", PeriodicTableSection.TRANSITION_METAL, "74.5 (+3)", 633, 1814, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".scandium"), "1, 2, 3", ChemistryElementState.SOLID, "Sc", -2147483648, 1876),
    TITANIUM(47.867, 22, 136, 3560, "metallic", 0xbfc2c7, 4.507, -8, 1.54, "[Ar] 3d2 4s2", PeriodicTableSection.TRANSITION_METAL, "86 (+2)", 659, 1941, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".titanium"), "-1, 2, 3, 4", ChemistryElementState.SOLID, "Ti", -2147483648, 1791),
    VANADIUM(50.9415, 23, 125, 3680, "metallic", 0xa6a6ab, 6.11, -51, 1.63, "[Ar] 3d3 4s2", PeriodicTableSection.TRANSITION_METAL, "79 (+2)", 651, 2183, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".vanadium"), "-1, 2, 3, 4", ChemistryElementState.SOLID, "V", -2147483648, 1803),
    CHROMIUM(51.9961, 24, 127, 2944, "metallic", 0x8a99c7, 7.14, -64, 1.66, "[Ar] 3d5 4s1", PeriodicTableSection.TRANSITION_METAL, "80 (+2*)", 653, 2180, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".chromium"), "-2, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Cr", -2147483648, -1),
    MANGANESE(54.938045, 25, 139, 2334, "metallic", 0x9c7ac7, 7.47, 0, 1.55, "[Ar] 3d5 4s2", PeriodicTableSection.TRANSITION_METAL, "67 (+2)", 717, 1519, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".manganese"), "-3, -2, -1, 1, 2, 3, 4, 5, 6, 7", ChemistryElementState.SOLID, "Mn", -2147483648, 1774),
    IRON(55.845, 26, 125, 3134, "metallic", 0xe06633, 7.874, -16, 1.83, "[Ar] 3d6 4s2", PeriodicTableSection.TRANSITION_METAL, "78 (+2*)", 763, 1811, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iron"), "-2, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Fe", -2147483648, -1),
    COBALT(58.933195, 27, 126, 3200, "metallic", 0xf090a0, 8.9, -64, 1.88, "[Ar] 3d7 4s2", PeriodicTableSection.TRANSITION_METAL, "74.5 (+2*)", 760, 1768, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cobalt"), "-1, 1, 2, 3, 4, 5", ChemistryElementState.SOLID, "Co", -2147483648, -1),
    NICKEL(58.6934, 28, 121, 3186, "metallic", 0x50d050, 8.908, -112, 1.91, "[Ar] 3d8 4s2", PeriodicTableSection.TRANSITION_METAL, "69 (+2)", 737, 1728, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nickel"), "-1, 1, 2, 3, 4", ChemistryElementState.SOLID, "Ni", 163, 1751),
    COPPER(63.546, 29, 138, 3200, "metallic", 0xc88033, 8.92, -118, 1.9, "[Ar] 3d10 4s1", PeriodicTableSection.TRANSITION_METAL, "77 (+1)", 746, 1358, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".copper"), "1, 2, 3, 4", ChemistryElementState.SOLID, "Cu", 140, -1),
    ZINC(65.38, 30, 131, 1180, "metallic", 0x7d80b0, 7.14, 0, 1.65, "[Ar] 3d10 4s2", PeriodicTableSection.TRANSITION_METAL, "74 (+2)", 906, 693, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".zinc"), "2", ChemistryElementState.SOLID, "Zn", 139, 1746),
    GALLIUM(69.723, 31, 126, 2477, "metallic", 0xc28f8f, 5.904, -29, 1.81, "[Ar] 3d10 4s2 4p1", PeriodicTableSection.METAL, "62 (+3)", 579, 303, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gallium"), "1, 2, 3", ChemistryElementState.SOLID, "Ga", 187, 1875),
    GERMANIUM(72.64, 32, 122, 3093, "metallic", 0x668f8f, 5.323, -119, 2.01, "[Ar] 3d10 4s2 4p2", PeriodicTableSection.METALLOID, "73 (+2)", 762, 1211, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".germanium"), "-4, 1, 2, 3, 4", ChemistryElementState.SOLID, "Ge", -2147483648, 1886),
    ARSENIC(74.9216, 33, 119, 887, "metallic", 0xbd80e3, 5.727, -78, 2.18, "[Ar] 3d10 4s2 4p3", PeriodicTableSection.METALLOID, "58 (+3)", 947, 1090, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".arsenic"), "-3, 2, 3, 5", ChemistryElementState.SOLID, "As", 185, -1),
    SELENIUM(78.96, 34, 116, 958, "metallic", 0xffa100, 4.819, -195, 2.55, "[Ar] 3d10 4s2 4p4", PeriodicTableSection.NONMETAL, "198 (-2)", 941, 494, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".selenium"), "-2, 2, 4, 6", ChemistryElementState.SOLID, "Se", 190, 1817),
    BROMINE(79.904, 35, 114, 332, "covalent network", 0xa62929, 3.12, -325, 2.96, "[Ar] 3d10 4s2 4p5", PeriodicTableSection.HALOGEN, "196 (-1)", 1140, 266, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bromine"), "-1, 1, 3, 4, 5, 7", ChemistryElementState.LIQUID, "Br", 185, 1826),
    KRYPTON(83.798, 36, 110, 120, "atomic", 0x5cb8d1, 0.00375, 0, 4.9E-324, "[Ar] 3d10 4s2 4p6", PeriodicTableSection.NOBLE_GAS, "", 1351, 116, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".krypton"), "2", ChemistryElementState.GAS, "Kr", 202, 1898),
    RUBIDIUM(85.4678, 37, 211, 961, "metallic", 0x702eb0, 1.532, -47, 0.82, "[Kr] 5s1", PeriodicTableSection.ALKALI_METAL, "152 (+1)", 403, 312, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rubidium"), "1", ChemistryElementState.SOLID, "Rb", -2147483648, 1861),
    STRONTIUM(87.62, 38, 192, 1655, "metallic", 0xff00, 2.63, -5, 0.95, "[Kr] 5s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "118 (+2)", 550, 1050, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".strontium"), "2", ChemistryElementState.SOLID, "Sr", -2147483648, 1790),
    YTTRIUM(88.90585, 39, 162, 3618, "metallic", 0x94ffff, 4.472, -30, 1.22, "[Kr] 4d1 5s2", PeriodicTableSection.TRANSITION_METAL, "90 (+3)", 600, 1799, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".yttrium"), "1, 2, 3", ChemistryElementState.SOLID, "Y", -2147483648, 1794),
    ZIRCONIUM(91.224, 40, 148, 4682, "metallic", 0x94e0e0, 6.511, -41, 1.33, "[Kr] 4d2 5s2", PeriodicTableSection.TRANSITION_METAL, "72 (+4)", 640, 2128, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".zirconium"), "1, 2, 3, 4", ChemistryElementState.SOLID, "Zr", -2147483648, 1789),
    NIOBIUM(92.90638, 41, 137, 5017, "metallic", 0x73c2c9, 8.57, -86, 1.6, "[Kr] 4d4 5s1", PeriodicTableSection.TRANSITION_METAL, "72 (+3)", 652, 2750, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".niobium"), "-1, 2, 3, 4, 5", ChemistryElementState.SOLID, "Nb", -2147483648, 1801),
    MOLYBDENUM(95.96, 42, 145, 4912, "metallic", 0x54b5b5, 10.28, -72, 2.16, "[Kr] 4d5 5s1", PeriodicTableSection.TRANSITION_METAL, "69 (+3)", 684, 2896, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".molybdenum"), "-2, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Mo", -2147483648, 1778),
    TECHNETIUM(98.0, 43, 156, 4538, "metallic", 0x3b9e9e, 11.5, -53, 1.9, "[Kr] 4d5 5s2", PeriodicTableSection.TRANSITION_METAL, "64.5 (+4)", 702, 2430, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".technetium"), "-3, -1, 1, 2, 3, 4, 5, 6, 7", ChemistryElementState.SOLID, "Tc", -2147483648, 1937),
    RUTHENIUM(101.07, 44, 126, 4423, "metallic", 0x248f8f, 12.37, -101, 2.2, "[Kr] 4d7 5s1", PeriodicTableSection.TRANSITION_METAL, "68 (+3)", 710, 2607, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".ruthenium"), "-2, 1, 2, 3, 4, 5, 6, 7, 8", ChemistryElementState.SOLID, "Ru", -2147483648, 1827),
    RHODIUM(102.9055, 45, 135, 3968, "metallic", 0xa7d8c, 12.45, -110, 2.28, "[Kr] 4d8 5s1", PeriodicTableSection.TRANSITION_METAL, "66.5 (+3)", 720, 2237, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rhodium"), "-1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Rh", -2147483648, 1803),
    PALLADIUM(106.42, 46, 131, 3236, "metallic", 0x6985, 12.023, -54, 2.2, "[Kr] 4d10", PeriodicTableSection.TRANSITION_METAL, "59 (+1)", 804, 1828, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".palladium"), "2, 4", ChemistryElementState.SOLID, "Pd", 163, 1803),
    SILVER(107.8682, 47, 153, 2435, "metallic", 0xc0c0c0, 10.49, -126, 1.93, "[Kr] 4d10 5s1", PeriodicTableSection.TRANSITION_METAL, "115 (+1)", 731, 1235, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".silver"), "1, 2, 3", ChemistryElementState.SOLID, "Ag", 172, -1),
    CADMIUM(112.411, 48, 148, 1040, "metallic", 0xffd98f, 8.65, 0, 1.69, "[Kr] 4d10 5s2", PeriodicTableSection.TRANSITION_METAL, "95 (+2)", 868, 594, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cadmium"), "2", ChemistryElementState.SOLID, "Cd", 158, 1817),
    INDIUM(114.818, 49, 144, 2345, "metallic", 0xa67573, 7.31, -29, 1.78, "[Kr] 4d10 5s2 5p1", PeriodicTableSection.METAL, "80 (+3)", 558, 430, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".indium"), "1, 2, 3", ChemistryElementState.SOLID, "In", 193, 1863),
    TIN(118.71, 50, 141, 2875, "metallic", 0x668080, 7.31, -107, 1.96, "[Kr] 4d10 5s2 5p2", PeriodicTableSection.METAL, "112 (+2)", 709, 505, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tin"), "-4, 2, 4", ChemistryElementState.SOLID, "Sn", 217, -1),
    ANTIMONY(121.76, 51, 138, 1860, "metallic", 0x9e63b5, 6.697, -103, 2.05, "[Kr] 4d10 5s2 5p3", PeriodicTableSection.METALLOID, "76 (+3)", 834, 904, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".antimony"), "-3, 3, 5", ChemistryElementState.SOLID, "Sb", -2147483648, -1),
    TELLURIUM(127.6, 52, 135, 1261, "metallic", 0xd47a00, 6.24, -190, 2.1, "[Kr] 4d10 5s2 5p4", PeriodicTableSection.METALLOID, "221 (-2)", 869, 723, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tellurium"), "-2, 2, 4, 5, 6", ChemistryElementState.SOLID, "Te", 206, 1782),
    IODINE(126.90447, 53, 133, 457, "covalent network", 0x940094, 4.94, -295, 2.66, "[Kr] 4d10 5s2 5p5", PeriodicTableSection.HALOGEN, "220 (-1)", 1008, 387, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iodine"), "-1, 1, 3, 5, 7", ChemistryElementState.SOLID, "I", 198, 1811),
    XENON(131.293, 54, 130, 165, "atomic", 0x429eb0, 0.0059, 0, 4.9E-324, "[Kr] 4d10 5s2 5p6", PeriodicTableSection.NOBLE_GAS, "48 (+8)", 1170, 161, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".xenon"), "2, 4, 6, 8", ChemistryElementState.GAS, "Xe", 216, 1898),
    CESIUM(132.9054519, 55, 225, 944, "metallic", 0x57178f, 1.879, -46, 0.79, "[Xe] 6s1", PeriodicTableSection.ALKALI_METAL, "167 (+1)", 376, 302, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cesium"), "1", ChemistryElementState.SOLID, "Cs", -2147483648, 1860),
    BARIUM(137.327, 56, 198, 2143, "metallic", 0xc900, 3.51, -14, 0.89, "[Xe] 6s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "135 (+2)", 503, 1000, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".barium"), "2", ChemistryElementState.SOLID, "Ba", -2147483648, 1808),
    LANTHANUM(138.90547, 57, 169, 3737, "metallic", 0x70d4ff, 6.146, -48, 1.1, "[Xe] 5d1 6s2", PeriodicTableSection.LANTHANOID, "103.2 (+3)", 538, 1193, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lanthanum"), "2, 3", ChemistryElementState.SOLID, "La", -2147483648, 1839),
    CERIUM(140.116, 58, -2147483648, 3633, "metallic", 0xffffc7, 6.689, -50, 1.12, "[Xe] 4f1 5d1 6s2", PeriodicTableSection.LANTHANOID, "102 (+3)", 534, 1071, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cerium"), "2, 3, 4", ChemistryElementState.SOLID, "Ce", -2147483648, 1803),
    PRASEODYMIUM(140.90765, 59, -2147483648, 3563, "metallic", 0xd9ffc7, 6.64, -50, 1.13, "[Xe] 4f3 6s2", PeriodicTableSection.LANTHANOID, "99 (+3)", 527, 1204, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".praseodymium"), "2, 3, 4", ChemistryElementState.SOLID, "Pr", -2147483648, 1885),
    NEODYMIUM(144.242, 60, -2147483648, 3373, "metallic", 0xc7ffc7, 7.01, -50, 1.14, "[Xe] 4f4 6s2", PeriodicTableSection.LANTHANOID, "129 (+2)", 533, 1294, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neodymium"), "2, 3", ChemistryElementState.SOLID, "Nd", -2147483648, 1885),
    PROMETHIUM(145.0, 61, -2147483648, 3273, "metallic", 0xa3ffc7, 7.264, -50, 1.13, "[Xe] 4f5 6s2", PeriodicTableSection.LANTHANOID, "97 (+3)", 540, 1373, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".promethium"), "3", ChemistryElementState.SOLID, "Pm", -2147483648, 1947),
    SAMARIUM(150.36, 62, -2147483648, 2076, "metallic", 0x8fffc7, 7.353, -50, 1.17, "[Xe] 4f6 6s2", PeriodicTableSection.LANTHANOID, "122 (+2)", 545, 1345, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".samarium"), "2, 3", ChemistryElementState.SOLID, "Sm", -2147483648, 1853),
    EUROPIUM(151.964, 63, -2147483648, 1800, "metallic", 0x61ffc7, 5.244, -50, 1.2, "[Xe] 4f7 6s2", PeriodicTableSection.LANTHANOID, "117 (+2)", 547, 1095, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".europium"), "2, 3", ChemistryElementState.SOLID, "Eu", -2147483648, 1901),
    GADOLINIUM(157.25, 64, -2147483648, 3523, "metallic", 0x45ffc7, 7.901, -50, 1.2, "[Xe] 4f7 5d1 6s2", PeriodicTableSection.LANTHANOID, "93.8 (+3)", 593, 1586, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gadolinium"), "1, 2, 3", ChemistryElementState.SOLID, "Gd", -2147483648, 1880),
    TERBIUM(158.92535, 65, -2147483648, 3503, "metallic", 0x30ffc7, 8.219, -50, 1.2, "[Xe] 4f9 6s2", PeriodicTableSection.LANTHANOID, "92.3 (+3)", 566, 1629, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".terbium"), "1, 3, 4", ChemistryElementState.SOLID, "Tb", -2147483648, 1843),
    DYSPROSIUM(162.5, 66, -2147483648, 2840, "metallic", 0x1fffc7, 8.551, -50, 1.22, "[Xe] 4f10 6s2", PeriodicTableSection.LANTHANOID, "107 (+2)", 573, 1685, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".dysprosium"), "2, 3", ChemistryElementState.SOLID, "Dy", -2147483648, 1886),
    HOLMIUM(164.93032, 67, -2147483648, 2973, "metallic", 0xff9c, 8.795, -50, 1.23, "[Xe] 4f11 6s2", PeriodicTableSection.LANTHANOID, "90.1 (+3)", 581, 1747, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".holmium"), "3", ChemistryElementState.SOLID, "Ho", -2147483648, 1878),
    ERBIUM(167.259, 68, -2147483648, 3141, "metallic", 0x0, 9.066, -50, 1.24, "[Xe] 4f12 6s2", PeriodicTableSection.LANTHANOID, "89 (+3)", 589, 1770, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".erbium"), "3", ChemistryElementState.SOLID, "Er", -2147483648, 1842),
    THULIUM(168.93421, 69, -2147483648, 2223, "metallic", 0xd452, 9.321, -50, 1.25, "[Xe] 4f13 6s2", PeriodicTableSection.LANTHANOID, "103 (+2)", 597, 1818, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thulium"), "2, 3", ChemistryElementState.SOLID, "Tm", -2147483648, 1879),
    YTTERBIUM(173.054, 70, -2147483648, 1469, "metallic", 0xbf38, 6.57, -50, 1.1, "[Xe] 4f14 6s2", PeriodicTableSection.LANTHANOID, "102 (+2)", 603, 1092, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".ytterbium"), "2, 3", ChemistryElementState.SOLID, "Yb", -2147483648, 1878),
    LUTETIUM(174.9668, 71, 160, 3675, "metallic", 0xab24, 9.841, -50, 1.27, "[Xe] 4f14 5d1 6s2", PeriodicTableSection.LANTHANOID, "86.1 (+3)", 524, 1936, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lutetium"), "3", ChemistryElementState.SOLID, "Lu", -2147483648, 1907),
    HAFNIUM(178.49, 72, 150, 4876, "metallic", 0x4dc2ff, 13.31, 0, 1.3, "[Xe] 4f14 5d2 6s2", PeriodicTableSection.TRANSITION_METAL, "71 (+4)", 659, 2506, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hafnium"), "2, 3, 4", ChemistryElementState.SOLID, "Hf", -2147483648, 1923),
    TANTALUM(180.94788, 73, 138, 5731, "metallic", 0x4da6ff, 16.65, -31, 1.5, "[Xe] 4f14 5d3 6s2", PeriodicTableSection.TRANSITION_METAL, "72 (+3)", 761, 3290, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tantalum"), "-1, 2, 3, 4, 5", ChemistryElementState.SOLID, "Ta", -2147483648, 1802),
    TUNGSTEN(183.84, 74, 146, 5828, "metallic", 0x2194d6, 19.25, -79, 2.36, "[Xe] 4f14 5d4 6s2", PeriodicTableSection.TRANSITION_METAL, "66 (+4)", 770, 3695, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tungsten"), "-2, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "W", -2147483648, 1783),
    RHENIUM(186.207, 75, 159, 5869, "metallic", 0x267dab, 21.02, -15, 1.9, "[Xe] 4f14 5d5 6s2", PeriodicTableSection.TRANSITION_METAL, "63 (+4)", 760, 3459, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rhenium"), "-3, -1, 1, 2, 3, 4, 5, 6, 7", ChemistryElementState.SOLID, "Re", -2147483648, 1925),
    OSMIUM(190.23, 76, 128, 5285, "metallic", 0x266696, 22.61, -106, 2.2, "[Xe] 4f14 5d6 6s2", PeriodicTableSection.TRANSITION_METAL, "63 (+4)", 840, 3306, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".osmium"), "-2, -1, 1, 2, 3, 4, 5, 6, 7, 8", ChemistryElementState.SOLID, "Os", -2147483648, 1803),
    IRIDIUM(192.217, 77, 137, 4701, "metallic", 0x175487, 22.65, -151, 2.2, "[Xe] 4f14 5d7 6s2", PeriodicTableSection.TRANSITION_METAL, "68 (+3)", 880, 2739, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iridium"), "-3, -1, 1, 2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Ir", -2147483648, 1803),
    PLATINUM(195.084, 78, 128, 4098, "metallic", 0xd0d0e0, 21.09, -205, 2.28, "[Xe] 4f14 5d9 6s1", PeriodicTableSection.TRANSITION_METAL, "86 (+2)", 870, 2041, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".platinum"), "2, 4, 5, 6", ChemistryElementState.SOLID, "Pt", 175, -1),
    GOLD(196.966569, 79, 144, 3129, "metallic", 0xffd123, 19.3, -223, 2.54, "[Xe] 4f14 5d10 6s1", PeriodicTableSection.TRANSITION_METAL, "137 (+1)", 890, 1337, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gold"), "-1, 1, 2, 3, 5", ChemistryElementState.SOLID, "Au", 166, -1),
    MERCURY(200.59, 80, 149, 630, "metallic", 0xb8b8d0, 13.534, 0, 2.0, "[Xe] 4f14 5d10 6s2", PeriodicTableSection.TRANSITION_METAL, "119 (+1)", 1007, 234, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".mercury"), "1, 2, 4", ChemistryElementState.LIQUID, "Hg", 155, -1),
    THALLIUM(204.3833, 81, 148, 1746, "metallic", 0xa6544d, 11.85, -19, 2.04, "[Xe] 4f14 5d10 6s2 6p1", PeriodicTableSection.METAL, "150 (+1)", 589, 577, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thallium"), "1, 3", ChemistryElementState.SOLID, "Tl", 196, 1861),
    LEAD(207.2, 82, 147, 2022, "metallic", 0x575961, 11.34, -35, 2.33, "[Xe] 4f14 5d10 6s2 6p2", PeriodicTableSection.METAL, "119 (+2)", 716, 601, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lead"), "-4, 2, 4", ChemistryElementState.SOLID, "Pb", 202, -1),
    BISMUTH(208.9804, 83, 146, 1837, "metallic", 0x9e4fb5, 9.78, -91, 2.02, "[Xe] 4f14 5d10 6s2 6p3", PeriodicTableSection.METAL, "103 (+3)", 703, 544, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bismuth"), "-3, 3, 5", ChemistryElementState.SOLID, "Bi", -2147483648, -1),
    POLONIUM(209.0, 84, -2147483648, 1235, "metallic", 0xab5c00, 9.196, -183, 2.0, "[Xe] 4f14 5d10 6s2 6p4", PeriodicTableSection.METALLOID, "94 (+4)", 812, 527, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".polonium"), "-2, 2, 4, 6", ChemistryElementState.SOLID, "Po", -2147483648, 1898),
    ASTATINE(210.0, 85, -2147483648, -2147483648, "covalent network", 0x754f45, 4.9E-324, -270, 2.2, "[Xe] 4f14 5d10 6s2 6p5", PeriodicTableSection.HALOGEN, "62 (+7)", 920, 575, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".astatine"), "-1, 1, 3, 5", ChemistryElementState.SOLID, "At", -2147483648, 1940),
    RADON(222.0, 86, 145, 211, "atomic", 0x428296, 0.00973, -2147483648, 4.9E-324, "[Xe] 4f14 5d10 6s2 6p6", PeriodicTableSection.NOBLE_GAS, "", 1037, 202, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".radon"), "2", ChemistryElementState.GAS, "Rn", -2147483648, 1900),
    FRANCIUM(223.0, 87, -2147483648, -2147483648, "metallic", 0x420066, 4.9E-324, -2147483648, 0.7, "[Rn] 7s1", PeriodicTableSection.ALKALI_METAL, "180 (+1)", 380, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".francium"), "1", ChemistryElementState.SOLID, "Fr", -2147483648, 1939),
    RADIUM(226.0, 88, -2147483648, 2010, "metallic", 0x7d00, 5.0, -2147483648, 0.9, "[Rn] 7s2", PeriodicTableSection.ALKALINE_EARTH_METAL, "148 (+2)", 509, 973, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".radium"), "2", ChemistryElementState.SOLID, "Ra", -2147483648, 1898),
    ACTINIUM(227.0, 89, -2147483648, 3473, "metallic", 0x70abfa, 10.07, -2147483648, 1.1, "[Rn] 6d1 7s2", PeriodicTableSection.ACTINOID, "112 (+3)", 499, 1323, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".actinium"), "3", ChemistryElementState.SOLID, "Ac", -2147483648, 1899),
    THORIUM(232.03806, 90, -2147483648, 5093, "metallic", 0xbaff, 11.724, -2147483648, 1.3, "[Rn] 6d2 7s2", PeriodicTableSection.ACTINOID, "94 (+4)", 587, 2023, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thorium"), "2, 3, 4", ChemistryElementState.SOLID, "Th", -2147483648, 1828),
    PROTACTINIUM(231.03588, 91, -2147483648, 4273, "metallic", 0xa1ff, 15.37, -2147483648, 1.5, "[Rn] 5f2 6d1 7s2", PeriodicTableSection.ACTINOID, "104 (+3)", 568, 1845, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".protactinium"), "3, 4, 5", ChemistryElementState.SOLID, "Pa", -2147483648, 1913),
    URANIUM(238.02891, 92, -2147483648, 4200, "metallic", 0x8fff, 19.05, -2147483648, 1.38, "[Rn] 5f3 6d1 7s2", PeriodicTableSection.ACTINOID, "102.5 (+3)", 598, 1408, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".uranium"), "3, 4, 5, 6", ChemistryElementState.SOLID, "U", 186, 1789),
    NEPTUNIUM(237.0, 93, -2147483648, 4273, "metallic", 0x80ff, 20.45, -2147483648, 1.36, "[Rn] 5f4 6d1 7s2", PeriodicTableSection.ACTINOID, "110 (+2)", 605, 917, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neptunium"), "3, 4, 5, 6, 7", ChemistryElementState.SOLID, "Np", -2147483648, 1940),
    PLUTONIUM(244.0, 94, -2147483648, 3503, "metallic", 0x6bff, 19.816, -2147483648, 1.28, "[Rn] 5f6 7s2", PeriodicTableSection.ACTINOID, "100 (+3)", 585, 913, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".plutonium"), "3, 4, 5, 6, 7", ChemistryElementState.SOLID, "Pu", -2147483648, 1940),
    AMERICIUM(243.0, 95, -2147483648, 2284, "metallic", 0x545cf2, 4.9E-324, -2147483648, 1.3, "[Rn] 5f7 7s2", PeriodicTableSection.ACTINOID, "126 (+2)", 578, 1449, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".americium"), "2, 3, 4, 5, 6", ChemistryElementState.SOLID, "Am", -2147483648, 1944),
    CURIUM(247.0, 96, -2147483648, 3383, "metallic", 0x785ce3, 13.51, -2147483648, 1.3, "[Rn] 5f7 6d1 7s2", PeriodicTableSection.ACTINOID, "97 (+3)", 581, 1618, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".curium"), "3, 4", ChemistryElementState.SOLID, "Cm", -2147483648, 1944),
    BERKELIUM(247.0, 97, -2147483648, -2147483648, "metallic", 0x8a4fe3, 14.78, -2147483648, 1.3, "[Rn] 5f9 7s2", PeriodicTableSection.ACTINOID, "96 (+3)", 601, 1323, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".berkelium"), "3, 4", ChemistryElementState.SOLID, "Bk", -2147483648, 1949),
    CALIFORNIUM(251.0, 98, -2147483648, -2147483648, "metallic", 0xa136d4, 15.1, -2147483648, 1.3, "[Rn] 5f10 7s2", PeriodicTableSection.ACTINOID, "95 (+3)", 608, 1173, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".californium"), "2, 3, 4", ChemistryElementState.SOLID, "Cf", -2147483648, 1950),
    EINSTEINIUM(252.0, 99, -2147483648, -2147483648, "", 0xb31fd4, 4.9E-324, -2147483648, 1.3, "[Rn] 5f11 7s2", PeriodicTableSection.ACTINOID, "", 619, 1133, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".einsteinium"), "2, 3", ChemistryElementState.SOLID, "Es", -2147483648, 1952),
    FERMIUM(257.0, 100, -2147483648, -2147483648, "", 0xb31fba, 4.9E-324, -2147483648, 1.3, "[Rn] 5f12 7s2", PeriodicTableSection.ACTINOID, "", 627, 1800, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".fermium"), "2, 3", null, "Fm", -2147483648, 1952),
    MENDELEVIUM(258.0, 101, -2147483648, -2147483648, "", 0xb30da6, 4.9E-324, -2147483648, 1.3, "[Rn] 5f13 7s2", PeriodicTableSection.ACTINOID, "", 635, 1100, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".mendelevium"), "2, 3", null, "Md", -2147483648, 1955),
    NOBELIUM(259.0, 102, -2147483648, -2147483648, "", 0xbd0d87, 4.9E-324, -2147483648, 1.3, "[Rn] 5f14 7s2", PeriodicTableSection.ACTINOID, "", 642, 1100, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nobelium"), "2, 3", null, "No", -2147483648, 1957),
    LAWRENCIUM(262.0, 103, -2147483648, -2147483648, "", 0xc70066, 4.9E-324, -2147483648, 1.3, "[Rn] 5f14 7s2 7p1", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, 1900, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lawrencium"), "3", null, "Lr", -2147483648, 1961),
    RUTHERFORDIUM(267.0, 104, -2147483648, -2147483648, "", 0xcc0059, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d2 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rutherfordium"), "4", null, "Rf", -2147483648, 1969),
    DUBNIUM(268.0, 105, -2147483648, -2147483648, "", 0xd1004f, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d3 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".dubnium"), "", null, "Db", -2147483648, 1967),
    SEABORGIUM(271.0, 106, -2147483648, -2147483648, "", 0xd90045, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d4 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".seaborgium"), "", null, "Sg", -2147483648, 1974),
    BOHRIUM(272.0, 107, -2147483648, -2147483648, "", 0xe00038, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d5 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bohrium"), "", null, "Bh", -2147483648, 1976),
    HASSIUM(270.0, 108, -2147483648, -2147483648, "", 0xe6002e, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d6 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hassium"), "", null, "Hs", -2147483648, 1984),
    MEITNERIUM(276.0, 109, -2147483648, -2147483648, "", 0xeb0026, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d7 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".meitnerium"), "", null, "Mt", -2147483648, 1982),
    DARMSTADTIUM(281.0, 110, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d9 7s1", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".darmstadtium"), "", null, "Ds", -2147483648, 1994),
    ROENTGENIUM(280.0, 111, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s1", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".roentgenium"), "", null, "Rg", -2147483648, 1994),
    COPERNICIUM(285.0, 112, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2", PeriodicTableSection.TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".copernicium"), "", null, "Cn", -2147483648, 1996),
    NIHONIUM(284.0, 113, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p1", PeriodicTableSection.POST_TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nihonium"), "", null, "Nh", -2147483648, 2003),
    FLEROVIUM(289.0, 114, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p2", PeriodicTableSection.POST_TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".flerovium"), "", null, "Fl", -2147483648, 1998),
    MOSCOVIUM(288.0, 115, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p3", PeriodicTableSection.POST_TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".moscovium"), "", null, "Mc", -2147483648, 2003),
    LIVERMORIUM(293.0, 116, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p4", PeriodicTableSection.POST_TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".livermorium"), "", null, "Lv", -2147483648, 2000),
    TENNESSINE(294.0, 117, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p5", PeriodicTableSection.POST_TRANSITION_METAL, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tennessine"), "", null, "Ts", -2147483648, 2010),
    OGANESSON(294.0, 118, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p6", PeriodicTableSection.NOBLE_GAS, "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".oganesson"), "", null, "Og", -2147483648, 2002);

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
    private final ITextComponent name;
    private final String oxidationStates;
    private final ChemistryElementState standardState;
    private final String symbol;
    private final int vanDelWaalsRadius;
    private final int yearDiscovered;

    ChemistryElements(double atomicMass, int atomicNumber, int atomicRadius, int boilingPoint, String bondingType, int cpkColor, double density, int electronAffinity, double electronegativity, String electronicConfiguration, PeriodicTableSection groupBlock, String ionRadius, int ionizationEnergy, int meltingPoint, ITextComponent name, String oxidationStates, @Nullable ChemistryElementState standardState, String symbol, int vanDelWaalsRadius, int yearDiscovered)
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

    public double getAtomicMass()
    {
        return atomicMass;
    }

    public int getAtomicNumber()
    {
        return atomicNumber;
    }

    public int getAtomicRadius()
    {
        return atomicRadius;
    }

    public int getBoilingPoint()
    {
        return boilingPoint;
    }

    public String getBondingType()
    {
        return bondingType;
    }

    public int getCpkColor()
    {
        return cpkColor;
    }

    public double getDensity()
    {
        return density;
    }

    public int getElectronAffinity()
    {
        return electronAffinity;
    }

    public double getElectronegativity()
    {
        return electronegativity;
    }

    public String getElectronicConfiguration()
    {
        return electronicConfiguration;
    }

    public PeriodicTableSection getGroupBlock()
    {
        return groupBlock;
    }

    public String getIonRadius()
    {
        return ionRadius;
    }

    public int getIonizationEnergy()
    {
        return ionizationEnergy;
    }

    public int getMeltingPoint()
    {
        return meltingPoint;
    }

    public ITextComponent getName()
    {
        return name;
    }

    public String getOxidationStates()
    {
        return oxidationStates;
    }

    @Nullable
    public ChemistryElementState getStandardState()
    {
        return standardState;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public int getVanDelWaalsRadius()
    {
        return vanDelWaalsRadius;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }
}