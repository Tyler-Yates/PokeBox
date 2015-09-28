package poke.data.xp;

import java.util.HashMap;
import java.util.Map;

public class MediumFast extends XpType {
    private static final Map<Integer, Integer> xpNeededPerLevel = new HashMap<>();

    static {
        xpNeededPerLevel.put(1, 0);
        xpNeededPerLevel.put(2, 8);
        xpNeededPerLevel.put(3, 27);
        xpNeededPerLevel.put(4, 64);
        xpNeededPerLevel.put(5, 125);
        xpNeededPerLevel.put(6, 216);
        xpNeededPerLevel.put(7, 343);
        xpNeededPerLevel.put(8, 512);
        xpNeededPerLevel.put(9, 729);
        xpNeededPerLevel.put(10, 1000);
        xpNeededPerLevel.put(11, 1331);
        xpNeededPerLevel.put(12, 1728);
        xpNeededPerLevel.put(13, 2197);
        xpNeededPerLevel.put(14, 2744);
        xpNeededPerLevel.put(15, 3375);
        xpNeededPerLevel.put(16, 4096);
        xpNeededPerLevel.put(17, 4913);
        xpNeededPerLevel.put(18, 5832);
        xpNeededPerLevel.put(19, 6859);
        xpNeededPerLevel.put(20, 8000);
        xpNeededPerLevel.put(21, 9261);
        xpNeededPerLevel.put(22, 10648);
        xpNeededPerLevel.put(23, 12167);
        xpNeededPerLevel.put(24, 13824);
        xpNeededPerLevel.put(25, 15625);
        xpNeededPerLevel.put(26, 17576);
        xpNeededPerLevel.put(27, 19683);
        xpNeededPerLevel.put(28, 21952);
        xpNeededPerLevel.put(29, 24389);
        xpNeededPerLevel.put(30, 27000);
        xpNeededPerLevel.put(31, 29791);
        xpNeededPerLevel.put(32, 32768);
        xpNeededPerLevel.put(33, 35937);
        xpNeededPerLevel.put(34, 39304);
        xpNeededPerLevel.put(35, 42875);
        xpNeededPerLevel.put(36, 46656);
        xpNeededPerLevel.put(37, 50653);
        xpNeededPerLevel.put(38, 54872);
        xpNeededPerLevel.put(39, 59319);
        xpNeededPerLevel.put(40, 64000);
        xpNeededPerLevel.put(41, 68921);
        xpNeededPerLevel.put(42, 74088);
        xpNeededPerLevel.put(43, 79507);
        xpNeededPerLevel.put(44, 85184);
        xpNeededPerLevel.put(45, 91125);
        xpNeededPerLevel.put(46, 97336);
        xpNeededPerLevel.put(47, 103823);
        xpNeededPerLevel.put(48, 110592);
        xpNeededPerLevel.put(49, 117649);
        xpNeededPerLevel.put(50, 125000);
        xpNeededPerLevel.put(51, 132651);
        xpNeededPerLevel.put(52, 140608);
        xpNeededPerLevel.put(53, 148877);
        xpNeededPerLevel.put(54, 157464);
        xpNeededPerLevel.put(55, 166375);
        xpNeededPerLevel.put(56, 175616);
        xpNeededPerLevel.put(57, 185193);
        xpNeededPerLevel.put(58, 195112);
        xpNeededPerLevel.put(59, 205379);
        xpNeededPerLevel.put(60, 216000);
        xpNeededPerLevel.put(61, 226981);
        xpNeededPerLevel.put(62, 238328);
        xpNeededPerLevel.put(63, 250047);
        xpNeededPerLevel.put(64, 262144);
        xpNeededPerLevel.put(65, 274625);
        xpNeededPerLevel.put(66, 287496);
        xpNeededPerLevel.put(67, 300763);
        xpNeededPerLevel.put(68, 314432);
        xpNeededPerLevel.put(69, 328509);
        xpNeededPerLevel.put(70, 343000);
        xpNeededPerLevel.put(71, 357911);
        xpNeededPerLevel.put(72, 373248);
        xpNeededPerLevel.put(73, 389017);
        xpNeededPerLevel.put(74, 405224);
        xpNeededPerLevel.put(75, 421875);
        xpNeededPerLevel.put(76, 438976);
        xpNeededPerLevel.put(77, 456533);
        xpNeededPerLevel.put(78, 474552);
        xpNeededPerLevel.put(79, 493039);
        xpNeededPerLevel.put(80, 512000);
        xpNeededPerLevel.put(81, 531441);
        xpNeededPerLevel.put(82, 551368);
        xpNeededPerLevel.put(83, 571787);
        xpNeededPerLevel.put(84, 592704);
        xpNeededPerLevel.put(85, 614125);
        xpNeededPerLevel.put(86, 636056);
        xpNeededPerLevel.put(87, 658503);
        xpNeededPerLevel.put(88, 681472);
        xpNeededPerLevel.put(89, 704969);
        xpNeededPerLevel.put(90, 729000);
        xpNeededPerLevel.put(91, 753571);
        xpNeededPerLevel.put(92, 778688);
        xpNeededPerLevel.put(93, 804357);
        xpNeededPerLevel.put(94, 830584);
        xpNeededPerLevel.put(95, 857375);
        xpNeededPerLevel.put(96, 884736);
        xpNeededPerLevel.put(97, 912673);
        xpNeededPerLevel.put(98, 941192);
        xpNeededPerLevel.put(99, 970299);
        xpNeededPerLevel.put(100, 1000000);
    }

    @Override
    Map<Integer, Integer> getXpNeededPerLevel() {
        return xpNeededPerLevel;
    }
}
