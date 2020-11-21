package io.github.ocelot.refinedchemistry.common;

import io.github.ocelot.refinedchemistry.RefinedChemistry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

/**
 * <p>Specifies all elements on the Periodic Table.</p>
 *
 * @author Ocelot
 */
public enum ChemistryElements
{
    HYDROGEN("1.00794(4)", 1, 37, 20, "diatomic", 0xffffff, 8.99E-5, -73, 2.2, "1s1", "nonmetal", "", 1312, 14, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hydrogen"), "-1, 1", "gas", "H", 120, 1),
    HELIUM("4.002602(2)", 2, 32, 4, "atomic", 0xd9ffff, 1.785E-4, 0, 4.9E-324, "1s2", "noble gas", "", 2372, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".helium"), "", "gas", "He", 140, 2),
    LITHIUM("6.941(2)", 3, 134, 1615, "metallic", 0xcc80ff, 0.535, -60, 0.98, "[He] 2s1", "alkali metal", "76 (+1)", 520, 454, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lithium"), "1", "solid", "Li", 182, 3),
    BERYLLIUM("9.012182(3)", 4, 90, 2743, "metallic", 0xc2ff00, 1.848, 0, 1.57, "[He] 2s2", "alkaline earth metal", "45 (+2)", 900, 1560, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".beryllium"), "2", "solid", "Be", -2147483648, 4),
    BORON("10.811(7)", 5, 82, 4273, "covalent network", 0xffb5b5, 2.46, -27, 2.04, "[He] 2s2 2p1", "metalloid", "27 (+3)", 801, 2348, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".boron"), "1, 2, 3", "solid", "B", -2147483648, 5),
    CARBON("12.0107(8)", 6, 77, 4300, "covalent network", 0x909090, 2.26, -154, 2.55, "[He] 2s2 2p2", "nonmetal", "16 (+4)", 1087, 3823, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".carbon"), "-4, -3, -2, -1, 1, 2, 3, 4", "solid", "C", 170, 6),
    NITROGEN("14.0067(2)", 7, 75, 77, "diatomic", 0x3050f8, 0.001251, -7, 3.04, "[He] 2s2 2p3", "nonmetal", "146 (-3)", 1402, 63, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nitrogen"), "-3, -2, -1, 1, 2, 3, 4, 5", "gas", "N", 155, 7),
    OXYGEN("15.9994(3)", 8, 73, 90, "diatomic", 0xff0d0d, 0.001429, -141, 3.44, "[He] 2s2 2p4", "nonmetal", "140 (-2)", 1314, 55, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".oxygen"), "-2, -1, 1, 2", "gas", "O", 152, 8),
    FLUORINE("18.9984032(5)", 9, 71, 85, "atomic", 0x90e050, 0.001696, -328, 3.98, "[He] 2s2 2p5", "halogen", "133 (-1)", 1681, 54, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".fluorine"), "-1", "gas", "F", 147, 9),
    NEON("20.1797(6)", 10, 69, 27, "atomic", 0xb3e3f5, 9.0E-4, 0, 4.9E-324, "[He] 2s2 2p6", "noble gas", "", 2081, 25, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neon"), "", "gas", "Ne", 154, 10),
    SODIUM("22.98976928(2)", 11, 154, 1156, "metallic", 0xab5cf2, 0.968, -53, 0.93, "[Ne] 3s1", "alkali metal", "102 (+1)", 496, 371, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".sodium"), "-1, 1", "solid", "Na", 227, 11),
    MAGNESIUM("24.3050(6)", 12, 130, 1363, "metallic", 0x8aff00, 1.738, 0, 1.31, "[Ne] 3s2", "alkaline earth metal", "72 (+2)", 738, 923, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".magnesium"), "1, 2", "solid", "Mg", 173, 12),
    ALUMINUM("26.9815386(8)", 13, 118, 2792, "metallic", 0xbfa6a6, 2.7, -43, 1.61, "[Ne] 3s2 3p1", "metal", "53.5 (+3)", 578, 933, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".aluminum"), "1, 3", "solid", "Al", -2147483648, 13),
    SILICON("28.0855(3)", 14, 111, 3173, "metallic", 0xf0c8a0, 2.33, -134, 1.9, "[Ne] 3s2 3p2", "metalloid", "40 (+4)", 787, 1687, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".silicon"), "-4, -3, -2, -1, 1, 2, 3, 4", "solid", "Si", 210, 14),
    PHOSPHORUS("30.973762(2)", 15, 106, 554, "covalent network", 0xff8000, 1.823, -72, 2.19, "[Ne] 3s2 3p3", "nonmetal", "44 (+3)", 1012, 317, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".phosphorus"), "-3, -2, -1, 1, 2, 3, 4, 5", "solid", "P", 180, 15),
    SULFUR("32.065(5)", 16, 102, 718, "covalent network", 0xffff30, 1.96, -200, 2.58, "[Ne] 3s2 3p4", "nonmetal", "184 (-2)", 1000, 388, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".sulfur"), "-2, -1, 1, 2, 3, 4, 5, 6", "solid", "S", 180, 16),
    CHLORINE("35.453(2)", 17, 99, 239, "covalent network", 0x1ff01f, 0.003214, -349, 3.16, "[Ne] 3s2 3p5", "halogen", "181 (-1)", 1251, 172, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".chlorine"), "-1, 1, 2, 3, 4, 5, 6, 7", "gas", "Cl", 175, 17),
    ARGON("39.948(1)", 18, 97, 87, "atomic", 0x80d1e3, 0.001784, 0, 4.9E-324, "[Ne] 3s2 3p6", "noble gas", "", 1521, 84, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".argon"), "", "gas", "Ar", 188, 18),
    POTASSIUM("39.0983(1)", 19, 196, 1032, "metallic", 0x8f40d4, 0.856, -48, 0.82, "[Ar] 4s1", "alkali metal", "138 (+1)", 419, 337, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".potassium"), "1", "solid", "K", 275, 19),
    CALCIUM("40.078(4)", 20, 174, 1757, "metallic", 0x3dff00, 1.55, -2, 1.0, "[Ar] 4s2", "alkaline earth metal", "100 (+2)", 590, 1115, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".calcium"), "2", "solid", "Ca", -2147483648, 20),
    SCANDIUM("44.955912(6)", 21, 144, 3103, "metallic", 0xe6e6e6, 2.985, -18, 1.36, "[Ar] 3d1 4s2", "transition metal", "74.5 (+3)", 633, 1814, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".scandium"), "1, 2, 3", "solid", "Sc", -2147483648, 21),
    TITANIUM("47.867(1)", 22, 136, 3560, "metallic", 0xbfc2c7, 4.507, -8, 1.54, "[Ar] 3d2 4s2", "transition metal", "86 (+2)", 659, 1941, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".titanium"), "-1, 2, 3, 4", "solid", "Ti", -2147483648, 22),
    VANADIUM("50.9415(1)", 23, 125, 3680, "metallic", 0xa6a6ab, 6.11, -51, 1.63, "[Ar] 3d3 4s2", "transition metal", "79 (+2)", 651, 2183, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".vanadium"), "-1, 2, 3, 4", "solid", "V", -2147483648, 23),
    CHROMIUM("51.9961(6)", 24, 127, 2944, "metallic", 0x8a99c7, 7.14, -64, 1.66, "[Ar] 3d5 4s1", "transition metal", "80 (+2*)", 653, 2180, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".chromium"), "-2, -1, 1, 2, 3, 4, 5, 6", "solid", "Cr", -2147483648, 24),
    MANGANESE("54.938045(5)", 25, 139, 2334, "metallic", 0x9c7ac7, 7.47, 0, 1.55, "[Ar] 3d5 4s2", "transition metal", "67 (+2)", 717, 1519, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".manganese"), "-3, -2, -1, 1, 2, 3, 4, 5, 6, 7", "solid", "Mn", -2147483648, 25),
    IRON("55.845(2)", 26, 125, 3134, "metallic", 0xe06633, 7.874, -16, 1.83, "[Ar] 3d6 4s2", "transition metal", "78 (+2*)", 763, 1811, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iron"), "-2, -1, 1, 2, 3, 4, 5, 6", "solid", "Fe", -2147483648, 26),
    COBALT("58.933195(5)", 27, 126, 3200, "metallic", 0xf090a0, 8.9, -64, 1.88, "[Ar] 3d7 4s2", "transition metal", "74.5 (+2*)", 760, 1768, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cobalt"), "-1, 1, 2, 3, 4, 5", "solid", "Co", -2147483648, 27),
    NICKEL("58.6934(4)", 28, 121, 3186, "metallic", 0x50d050, 8.908, -112, 1.91, "[Ar] 3d8 4s2", "transition metal", "69 (+2)", 737, 1728, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nickel"), "-1, 1, 2, 3, 4", "solid", "Ni", 163, 28),
    COPPER("63.546(3)", 29, 138, 3200, "metallic", 0xc88033, 8.92, -118, 1.9, "[Ar] 3d10 4s1", "transition metal", "77 (+1)", 746, 1358, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".copper"), "1, 2, 3, 4", "solid", "Cu", 140, 29),
    ZINC("65.38(2)", 30, 131, 1180, "metallic", 0x7d80b0, 7.14, 0, 1.65, "[Ar] 3d10 4s2", "transition metal", "74 (+2)", 906, 693, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".zinc"), "2", "solid", "Zn", 139, 30),
    GALLIUM("69.723(1)", 31, 126, 2477, "metallic", 0xc28f8f, 5.904, -29, 1.81, "[Ar] 3d10 4s2 4p1", "metal", "62 (+3)", 579, 303, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gallium"), "1, 2, 3", "solid", "Ga", 187, 31),
    GERMANIUM("72.64(1)", 32, 122, 3093, "metallic", 0x668f8f, 5.323, -119, 2.01, "[Ar] 3d10 4s2 4p2", "metalloid", "73 (+2)", 762, 1211, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".germanium"), "-4, 1, 2, 3, 4", "solid", "Ge", -2147483648, 32),
    ARSENIC("74.92160(2)", 33, 119, 887, "metallic", 0xbd80e3, 5.727, -78, 2.18, "[Ar] 3d10 4s2 4p3", "metalloid", "58 (+3)", 947, 1090, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".arsenic"), "-3, 2, 3, 5", "solid", "As", 185, 33),
    SELENIUM("78.96(3)", 34, 116, 958, "metallic", 0xffa100, 4.819, -195, 2.55, "[Ar] 3d10 4s2 4p4", "nonmetal", "198 (-2)", 941, 494, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".selenium"), "-2, 2, 4, 6", "solid", "Se", 190, 34),
    BROMINE("79.904(1)", 35, 114, 332, "covalent network", 0xa62929, 3.12, -325, 2.96, "[Ar] 3d10 4s2 4p5", "halogen", "196 (-1)", 1140, 266, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bromine"), "-1, 1, 3, 4, 5, 7", "liquid", "Br", 185, 35),
    KRYPTON("83.798(2)", 36, 110, 120, "atomic", 0x5cb8d1, 0.00375, 0, 4.9E-324, "[Ar] 3d10 4s2 4p6", "noble gas", "", 1351, 116, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".krypton"), "2", "gas", "Kr", 202, 36),
    RUBIDIUM("85.4678(3)", 37, 211, 961, "metallic", 0x702eb0, 1.532, -47, 0.82, "[Kr] 5s1", "alkali metal", "152 (+1)", 403, 312, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rubidium"), "1", "solid", "Rb", -2147483648, 37),
    STRONTIUM("87.62(1)", 38, 192, 1655, "metallic", 0xff00, 2.63, -5, 0.95, "[Kr] 5s2", "alkaline earth metal", "118 (+2)", 550, 1050, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".strontium"), "2", "solid", "Sr", -2147483648, 38),
    YTTRIUM("88.90585(2)", 39, 162, 3618, "metallic", 0x94ffff, 4.472, -30, 1.22, "[Kr] 4d1 5s2", "transition metal", "90 (+3)", 600, 1799, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".yttrium"), "1, 2, 3", "solid", "Y", -2147483648, 39),
    ZIRCONIUM("91.224(2)", 40, 148, 4682, "metallic", 0x94e0e0, 6.511, -41, 1.33, "[Kr] 4d2 5s2", "transition metal", "72 (+4)", 640, 2128, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".zirconium"), "1, 2, 3, 4", "solid", "Zr", -2147483648, 40),
    NIOBIUM("92.90638(2)", 41, 137, 5017, "metallic", 0x73c2c9, 8.57, -86, 1.6, "[Kr] 4d4 5s1", "transition metal", "72 (+3)", 652, 2750, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".niobium"), "-1, 2, 3, 4, 5", "solid", "Nb", -2147483648, 41),
    MOLYBDENUM("95.96(2)", 42, 145, 4912, "metallic", 0x54b5b5, 10.28, -72, 2.16, "[Kr] 4d5 5s1", "transition metal", "69 (+3)", 684, 2896, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".molybdenum"), "-2, -1, 1, 2, 3, 4, 5, 6", "solid", "Mo", -2147483648, 42),
    TECHNETIUM("98", 43, 156, 4538, "metallic", 0x3b9e9e, 11.5, -53, 1.9, "[Kr] 4d5 5s2", "transition metal", "64.5 (+4)", 702, 2430, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".technetium"), "-3, -1, 1, 2, 3, 4, 5, 6, 7", "solid", "Tc", -2147483648, 43),
    RUTHENIUM("101.07(2)", 44, 126, 4423, "metallic", 0x248f8f, 12.37, -101, 2.2, "[Kr] 4d7 5s1", "transition metal", "68 (+3)", 710, 2607, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".ruthenium"), "-2, 1, 2, 3, 4, 5, 6, 7, 8", "solid", "Ru", -2147483648, 44),
    RHODIUM("102.90550(2)", 45, 135, 3968, "metallic", 0xa7d8c, 12.45, -110, 2.28, "[Kr] 4d8 5s1", "transition metal", "66.5 (+3)", 720, 2237, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rhodium"), "-1, 1, 2, 3, 4, 5, 6", "solid", "Rh", -2147483648, 45),
    PALLADIUM("106.42(1)", 46, 131, 3236, "metallic", 0x6985, 12.023, -54, 2.2, "[Kr] 4d10", "transition metal", "59 (+1)", 804, 1828, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".palladium"), "2, 4", "solid", "Pd", 163, 46),
    SILVER("107.8682(2)", 47, 153, 2435, "metallic", 0xc0c0c0, 10.49, -126, 1.93, "[Kr] 4d10 5s1", "transition metal", "115 (+1)", 731, 1235, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".silver"), "1, 2, 3", "solid", "Ag", 172, 47),
    CADMIUM("112.411(8)", 48, 148, 1040, "metallic", 0xffd98f, 8.65, 0, 1.69, "[Kr] 4d10 5s2", "transition metal", "95 (+2)", 868, 594, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cadmium"), "2", "solid", "Cd", 158, 48),
    INDIUM("114.818(3)", 49, 144, 2345, "metallic", 0xa67573, 7.31, -29, 1.78, "[Kr] 4d10 5s2 5p1", "metal", "80 (+3)", 558, 430, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".indium"), "1, 2, 3", "solid", "In", 193, 49),
    TIN("118.710(7)", 50, 141, 2875, "metallic", 0x668080, 7.31, -107, 1.96, "[Kr] 4d10 5s2 5p2", "metal", "112 (+2)", 709, 505, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tin"), "-4, 2, 4", "solid", "Sn", 217, 50),
    ANTIMONY("121.760(1)", 51, 138, 1860, "metallic", 0x9e63b5, 6.697, -103, 2.05, "[Kr] 4d10 5s2 5p3", "metalloid", "76 (+3)", 834, 904, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".antimony"), "-3, 3, 5", "solid", "Sb", -2147483648, 51),
    TELLURIUM("127.60(3)", 52, 135, 1261, "metallic", 0xd47a00, 6.24, -190, 2.1, "[Kr] 4d10 5s2 5p4", "metalloid", "221 (-2)", 869, 723, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tellurium"), "-2, 2, 4, 5, 6", "solid", "Te", 206, 52),
    IODINE("126.90447(3)", 53, 133, 457, "covalent network", 0x940094, 4.94, -295, 2.66, "[Kr] 4d10 5s2 5p5", "halogen", "220 (-1)", 1008, 387, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iodine"), "-1, 1, 3, 5, 7", "solid", "I", 198, 53),
    XENON("131.293(6)", 54, 130, 165, "atomic", 0x429eb0, 0.0059, 0, 4.9E-324, "[Kr] 4d10 5s2 5p6", "noble gas", "48 (+8)", 1170, 161, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".xenon"), "2, 4, 6, 8", "gas", "Xe", 216, 54),
    CESIUM("132.9054519(2)", 55, 225, 944, "metallic", 0x57178f, 1.879, -46, 0.79, "[Xe] 6s1", "alkali metal", "167 (+1)", 376, 302, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cesium"), "1", "solid", "Cs", -2147483648, 55),
    BARIUM("137.327(7)", 56, 198, 2143, "metallic", 0xc900, 3.51, -14, 0.89, "[Xe] 6s2", "alkaline earth metal", "135 (+2)", 503, 1000, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".barium"), "2", "solid", "Ba", -2147483648, 56),
    LANTHANUM("138.90547(7)", 57, 169, 3737, "metallic", 0x70d4ff, 6.146, -48, 1.1, "[Xe] 5d1 6s2", "lanthanoid", "103.2 (+3)", 538, 1193, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lanthanum"), "2, 3", "solid", "La", -2147483648, 57),
    CERIUM("140.116(1)", 58, -2147483648, 3633, "metallic", 0xffffc7, 6.689, -50, 1.12, "[Xe] 4f1 5d1 6s2", "lanthanoid", "102 (+3)", 534, 1071, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".cerium"), "2, 3, 4", "solid", "Ce", -2147483648, 58),
    PRASEODYMIUM("140.90765(2)", 59, -2147483648, 3563, "metallic", 0xd9ffc7, 6.64, -50, 1.13, "[Xe] 4f3 6s2", "lanthanoid", "99 (+3)", 527, 1204, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".praseodymium"), "2, 3, 4", "solid", "Pr", -2147483648, 59),
    NEODYMIUM("144.242(3)", 60, -2147483648, 3373, "metallic", 0xc7ffc7, 7.01, -50, 1.14, "[Xe] 4f4 6s2", "lanthanoid", "129 (+2)", 533, 1294, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neodymium"), "2, 3", "solid", "Nd", -2147483648, 60),
    PROMETHIUM("145", 61, -2147483648, 3273, "metallic", 0xa3ffc7, 7.264, -50, 1.13, "[Xe] 4f5 6s2", "lanthanoid", "97 (+3)", 540, 1373, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".promethium"), "3", "solid", "Pm", -2147483648, 61),
    SAMARIUM("150.36(2)", 62, -2147483648, 2076, "metallic", 0x8fffc7, 7.353, -50, 1.17, "[Xe] 4f6 6s2", "lanthanoid", "122 (+2)", 545, 1345, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".samarium"), "2, 3", "solid", "Sm", -2147483648, 62),
    EUROPIUM("151.964(1)", 63, -2147483648, 1800, "metallic", 0x61ffc7, 5.244, -50, 1.2, "[Xe] 4f7 6s2", "lanthanoid", "117 (+2)", 547, 1095, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".europium"), "2, 3", "solid", "Eu", -2147483648, 63),
    GADOLINIUM("157.25(3)", 64, -2147483648, 3523, "metallic", 0x45ffc7, 7.901, -50, 1.2, "[Xe] 4f7 5d1 6s2", "lanthanoid", "93.8 (+3)", 593, 1586, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gadolinium"), "1, 2, 3", "solid", "Gd", -2147483648, 64),
    TERBIUM("158.92535(2)", 65, -2147483648, 3503, "metallic", 0x30ffc7, 8.219, -50, 1.2, "[Xe] 4f9 6s2", "lanthanoid", "92.3 (+3)", 566, 1629, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".terbium"), "1, 3, 4", "solid", "Tb", -2147483648, 65),
    DYSPROSIUM("162.500(1)", 66, -2147483648, 2840, "metallic", 0x1fffc7, 8.551, -50, 1.22, "[Xe] 4f10 6s2", "lanthanoid", "107 (+2)", 573, 1685, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".dysprosium"), "2, 3", "solid", "Dy", -2147483648, 66),
    HOLMIUM("164.93032(2)", 67, -2147483648, 2973, "metallic", 0xff9c, 8.795, -50, 1.23, "[Xe] 4f11 6s2", "lanthanoid", "90.1 (+3)", 581, 1747, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".holmium"), "3", "solid", "Ho", -2147483648, 67),
    ERBIUM("167.259(3)", 68, -2147483648, 3141, "metallic", 0x0, 9.066, -50, 1.24, "[Xe] 4f12 6s2", "lanthanoid", "89 (+3)", 589, 1770, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".erbium"), "3", "solid", "Er", -2147483648, 68),
    THULIUM("168.93421(2)", 69, -2147483648, 2223, "metallic", 0xd452, 9.321, -50, 1.25, "[Xe] 4f13 6s2", "lanthanoid", "103 (+2)", 597, 1818, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thulium"), "2, 3", "solid", "Tm", -2147483648, 69),
    YTTERBIUM("173.054(5)", 70, -2147483648, 1469, "metallic", 0xbf38, 6.57, -50, 1.1, "[Xe] 4f14 6s2", "lanthanoid", "102 (+2)", 603, 1092, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".ytterbium"), "2, 3", "solid", "Yb", -2147483648, 70),
    LUTETIUM("174.9668(1)", 71, 160, 3675, "metallic", 0xab24, 9.841, -50, 1.27, "[Xe] 4f14 5d1 6s2", "lanthanoid", "86.1 (+3)", 524, 1936, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lutetium"), "3", "solid", "Lu", -2147483648, 71),
    HAFNIUM("178.49(2)", 72, 150, 4876, "metallic", 0x4dc2ff, 13.31, 0, 1.3, "[Xe] 4f14 5d2 6s2", "transition metal", "71 (+4)", 659, 2506, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hafnium"), "2, 3, 4", "solid", "Hf", -2147483648, 72),
    TANTALUM("180.94788(2)", 73, 138, 5731, "metallic", 0x4da6ff, 16.65, -31, 1.5, "[Xe] 4f14 5d3 6s2", "transition metal", "72 (+3)", 761, 3290, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tantalum"), "-1, 2, 3, 4, 5", "solid", "Ta", -2147483648, 73),
    TUNGSTEN("183.84(1)", 74, 146, 5828, "metallic", 0x2194d6, 19.25, -79, 2.36, "[Xe] 4f14 5d4 6s2", "transition metal", "66 (+4)", 770, 3695, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tungsten"), "-2, -1, 1, 2, 3, 4, 5, 6", "solid", "W", -2147483648, 74),
    RHENIUM("186.207(1)", 75, 159, 5869, "metallic", 0x267dab, 21.02, -15, 1.9, "[Xe] 4f14 5d5 6s2", "transition metal", "63 (+4)", 760, 3459, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rhenium"), "-3, -1, 1, 2, 3, 4, 5, 6, 7", "solid", "Re", -2147483648, 75),
    OSMIUM("190.23(3)", 76, 128, 5285, "metallic", 0x266696, 22.61, -106, 2.2, "[Xe] 4f14 5d6 6s2", "transition metal", "63 (+4)", 840, 3306, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".osmium"), "-2, -1, 1, 2, 3, 4, 5, 6, 7, 8", "solid", "Os", -2147483648, 76),
    IRIDIUM("192.217(3)", 77, 137, 4701, "metallic", 0x175487, 22.65, -151, 2.2, "[Xe] 4f14 5d7 6s2", "transition metal", "68 (+3)", 880, 2739, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".iridium"), "-3, -1, 1, 2, 3, 4, 5, 6", "solid", "Ir", -2147483648, 77),
    PLATINUM("195.084(9)", 78, 128, 4098, "metallic", 0xd0d0e0, 21.09, -205, 2.28, "[Xe] 4f14 5d9 6s1", "transition metal", "86 (+2)", 870, 2041, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".platinum"), "2, 4, 5, 6", "solid", "Pt", 175, 78),
    GOLD("196.966569(4)", 79, 144, 3129, "metallic", 0xffd123, 19.3, -223, 2.54, "[Xe] 4f14 5d10 6s1", "transition metal", "137 (+1)", 890, 1337, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".gold"), "-1, 1, 2, 3, 5", "solid", "Au", 166, 79),
    MERCURY("200.59(2)", 80, 149, 630, "metallic", 0xb8b8d0, 13.534, 0, 2.0, "[Xe] 4f14 5d10 6s2", "transition metal", "119 (+1)", 1007, 234, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".mercury"), "1, 2, 4", "liquid", "Hg", 155, 80),
    THALLIUM("204.3833(2)", 81, 148, 1746, "metallic", 0xa6544d, 11.85, -19, 2.04, "[Xe] 4f14 5d10 6s2 6p1", "metal", "150 (+1)", 589, 577, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thallium"), "1, 3", "solid", "Tl", 196, 81),
    LEAD("207.2(1)", 82, 147, 2022, "metallic", 0x575961, 11.34, -35, 2.33, "[Xe] 4f14 5d10 6s2 6p2", "metal", "119 (+2)", 716, 601, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lead"), "-4, 2, 4", "solid", "Pb", 202, 82),
    BISMUTH("208.98040(1)", 83, 146, 1837, "metallic", 0x9e4fb5, 9.78, -91, 2.02, "[Xe] 4f14 5d10 6s2 6p3", "metal", "103 (+3)", 703, 544, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bismuth"), "-3, 3, 5", "solid", "Bi", -2147483648, 83),
    POLONIUM("209", 84, -2147483648, 1235, "metallic", 0xab5c00, 9.196, -183, 2.0, "[Xe] 4f14 5d10 6s2 6p4", "metalloid", "94 (+4)", 812, 527, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".polonium"), "-2, 2, 4, 6", "solid", "Po", -2147483648, 84),
    ASTATINE("210", 85, -2147483648, -2147483648, "covalent network", 0x754f45, 4.9E-324, -270, 2.2, "[Xe] 4f14 5d10 6s2 6p5", "halogen", "62 (+7)", 920, 575, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".astatine"), "-1, 1, 3, 5", "solid", "At", -2147483648, 85),
    RADON("222", 86, 145, 211, "atomic", 0x428296, 0.00973, -2147483648, 4.9E-324, "[Xe] 4f14 5d10 6s2 6p6", "noble gas", "", 1037, 202, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".radon"), "2", "gas", "Rn", -2147483648, 86),
    FRANCIUM("223", 87, -2147483648, -2147483648, "metallic", 0x420066, 4.9E-324, -2147483648, 0.7, "[Rn] 7s1", "alkali metal", "180 (+1)", 380, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".francium"), "1", "solid", "Fr", -2147483648, 87),
    RADIUM("226", 88, -2147483648, 2010, "metallic", 0x7d00, 5.0, -2147483648, 0.9, "[Rn] 7s2", "alkaline earth metal", "148 (+2)", 509, 973, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".radium"), "2", "solid", "Ra", -2147483648, 88),
    ACTINIUM("227", 89, -2147483648, 3473, "metallic", 0x70abfa, 10.07, -2147483648, 1.1, "[Rn] 6d1 7s2", "actinoid", "112 (+3)", 499, 1323, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".actinium"), "3", "solid", "Ac", -2147483648, 89),
    THORIUM("232.03806(2)", 90, -2147483648, 5093, "metallic", 0xbaff, 11.724, -2147483648, 1.3, "[Rn] 6d2 7s2", "actinoid", "94 (+4)", 587, 2023, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".thorium"), "2, 3, 4", "solid", "Th", -2147483648, 90),
    PROTACTINIUM("231.03588(2)", 91, -2147483648, 4273, "metallic", 0xa1ff, 15.37, -2147483648, 1.5, "[Rn] 5f2 6d1 7s2", "actinoid", "104 (+3)", 568, 1845, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".protactinium"), "3, 4, 5", "solid", "Pa", -2147483648, 91),
    URANIUM("238.02891(3)", 92, -2147483648, 4200, "metallic", 0x8fff, 19.05, -2147483648, 1.38, "[Rn] 5f3 6d1 7s2", "actinoid", "102.5 (+3)", 598, 1408, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".uranium"), "3, 4, 5, 6", "solid", "U", 186, 92),
    NEPTUNIUM("237", 93, -2147483648, 4273, "metallic", 0x80ff, 20.45, -2147483648, 1.36, "[Rn] 5f4 6d1 7s2", "actinoid", "110 (+2)", 605, 917, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".neptunium"), "3, 4, 5, 6, 7", "solid", "Np", -2147483648, 93),
    PLUTONIUM("244", 94, -2147483648, 3503, "metallic", 0x6bff, 19.816, -2147483648, 1.28, "[Rn] 5f6 7s2", "actinoid", "100 (+3)", 585, 913, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".plutonium"), "3, 4, 5, 6, 7", "solid", "Pu", -2147483648, 94),
    AMERICIUM("243", 95, -2147483648, 2284, "metallic", 0x545cf2, 4.9E-324, -2147483648, 1.3, "[Rn] 5f7 7s2", "actinoid", "126 (+2)", 578, 1449, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".americium"), "2, 3, 4, 5, 6", "solid", "Am", -2147483648, 95),
    CURIUM("247", 96, -2147483648, 3383, "metallic", 0x785ce3, 13.51, -2147483648, 1.3, "[Rn] 5f7 6d1 7s2", "actinoid", "97 (+3)", 581, 1618, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".curium"), "3, 4", "solid", "Cm", -2147483648, 96),
    BERKELIUM("247", 97, -2147483648, -2147483648, "metallic", 0x8a4fe3, 14.78, -2147483648, 1.3, "[Rn] 5f9 7s2", "actinoid", "96 (+3)", 601, 1323, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".berkelium"), "3, 4", "solid", "Bk", -2147483648, 97),
    CALIFORNIUM("251", 98, -2147483648, -2147483648, "metallic", 0xa136d4, 15.1, -2147483648, 1.3, "[Rn] 5f10 7s2", "actinoid", "95 (+3)", 608, 1173, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".californium"), "2, 3, 4", "solid", "Cf", -2147483648, 98),
    EINSTEINIUM("252", 99, -2147483648, -2147483648, "", 0xb31fd4, 4.9E-324, -2147483648, 1.3, "[Rn] 5f11 7s2", "actinoid", "", 619, 1133, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".einsteinium"), "2, 3", "solid", "Es", -2147483648, 99),
    FERMIUM("257", 100, -2147483648, -2147483648, "", 0xb31fba, 4.9E-324, -2147483648, 1.3, "[Rn] 5f12 7s2", "actinoid", "", 627, 1800, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".fermium"), "2, 3", "", "Fm", -2147483648, 100),
    MENDELEVIUM("258", 101, -2147483648, -2147483648, "", 0xb30da6, 4.9E-324, -2147483648, 1.3, "[Rn] 5f13 7s2", "actinoid", "", 635, 1100, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".mendelevium"), "2, 3", "", "Md", -2147483648, 101),
    NOBELIUM("259", 102, -2147483648, -2147483648, "", 0xbd0d87, 4.9E-324, -2147483648, 1.3, "[Rn] 5f14 7s2", "actinoid", "", 642, 1100, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nobelium"), "2, 3", "", "No", -2147483648, 102),
    LAWRENCIUM("262", 103, -2147483648, -2147483648, "", 0xc70066, 4.9E-324, -2147483648, 1.3, "[Rn] 5f14 7s2 7p1", "transition metal", "", -2147483648, 1900, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".lawrencium"), "3", "", "Lr", -2147483648, 103),
    RUTHERFORDIUM("267", 104, -2147483648, -2147483648, "", 0xcc0059, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d2 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".rutherfordium"), "4", "", "Rf", -2147483648, 104),
    DUBNIUM("268", 105, -2147483648, -2147483648, "", 0xd1004f, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d3 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".dubnium"), "", "", "Db", -2147483648, 105),
    SEABORGIUM("271", 106, -2147483648, -2147483648, "", 0xd90045, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d4 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".seaborgium"), "", "", "Sg", -2147483648, 106),
    BOHRIUM("272", 107, -2147483648, -2147483648, "", 0xe00038, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d5 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".bohrium"), "", "", "Bh", -2147483648, 107),
    HASSIUM("270", 108, -2147483648, -2147483648, "", 0xe6002e, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d6 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".hassium"), "", "", "Hs", -2147483648, 108),
    MEITNERIUM("276", 109, -2147483648, -2147483648, "", 0xeb0026, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d7 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".meitnerium"), "", "", "Mt", -2147483648, 109),
    DARMSTADTIUM("281", 110, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d9 7s1", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".darmstadtium"), "", "", "Ds", -2147483648, 110),
    ROENTGENIUM("280", 111, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s1", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".roentgenium"), "", "", "Rg", -2147483648, 111),
    COPERNICIUM("285", 112, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2", "transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".copernicium"), "", "", "Cn", -2147483648, 112),
    NIHONIUM("284", 113, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p1", "post-transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".nihonium"), "", "", "Nh", -2147483648, 113),
    FLEROVIUM("289", 114, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p2", "post-transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".flerovium"), "", "", "Fl", -2147483648, 114),
    MOSCOVIUM("288", 115, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p3", "post-transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".moscovium"), "", "", "Mc", -2147483648, 115),
    LIVERMORIUM("293", 116, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p4", "post-transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".livermorium"), "", "", "Lv", -2147483648, 116),
    TENNESSINE("294", 117, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p5", "post-transition metal", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".tennessine"), "", "", "Ts", -2147483648, 117),
    OGANESSON("294", 118, -2147483648, -2147483648, "", 0xffffffff, 4.9E-324, -2147483648, 4.9E-324, "[Rn] 5f14 6d10 7s2 7p6", "noble gas", "", -2147483648, -2147483648, new TranslationTextComponent("element." + RefinedChemistry.MOD_ID + ".oganesson"), "", "", "Og", -2147483648, 118);

    private final String atomicMass;
    private final int atomicNumber;
    private final int atomicRadius;
    private final int boilingPoint;
    private final String bondingType;
    private final int cpkColor;
    private final double density;
    private final int electronAffinity;
    private final double electronegativity;
    private final String electronicConfiguration;
    private final String groupBlock;
    private final String ionRadius;
    private final int ionizationEnergy;
    private final int meltingPoint;
    private final ITextComponent name;
    private final String oxidationStates;
    private final String standardState;
    private final String symbol;
    private final int vanDelWaalsRadius;
    private final int yearDiscovered;

    ChemistryElements(String atomicMass, int atomicNumber, int atomicRadius, int boilingPoint, String bondingType, int cpkColor, double density, int electronAffinity, double electronegativity, String electronicConfiguration, String groupBlock, String ionRadius, int ionizationEnergy, int meltingPoint, ITextComponent name, String oxidationStates, String standardState, String symbol, int vanDelWaalsRadius, int yearDiscovered)
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

    public String getAtomicMass()
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

    public String getGroupBlock()
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

    public String getStandardState()
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