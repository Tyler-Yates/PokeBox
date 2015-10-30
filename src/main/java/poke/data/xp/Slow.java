package poke.data.xp;

import java.util.HashMap;
import java.util.Map;

public class Slow extends XpType {
    private static final Map<Integer, Integer> xpNeededPerLevel = new HashMap<>();

    static {
        xpNeededPerLevel.put(1, 0);
        xpNeededPerLevel.put(2, 10);
        xpNeededPerLevel.put(3, 33);
        xpNeededPerLevel.put(4, 80);
        xpNeededPerLevel.put(5, 156);
        xpNeededPerLevel.put(6, 270);
        xpNeededPerLevel.put(7, 428);
        xpNeededPerLevel.put(8, 640);
        xpNeededPerLevel.put(9, 911);
        xpNeededPerLevel.put(10, 1250);
        xpNeededPerLevel.put(11, 1663);
        xpNeededPerLevel.put(12, 2160);
        xpNeededPerLevel.put(13, 2746);
        xpNeededPerLevel.put(14, 3430);
        xpNeededPerLevel.put(15, 4218);
        xpNeededPerLevel.put(16, 5120);
        xpNeededPerLevel.put(17, 6141);
        xpNeededPerLevel.put(18, 7290);
        xpNeededPerLevel.put(19, 8573);
        xpNeededPerLevel.put(20, 10000);
        xpNeededPerLevel.put(21, 11576);
        xpNeededPerLevel.put(22, 13310);
        xpNeededPerLevel.put(23, 15208);
        xpNeededPerLevel.put(24, 17280);
        xpNeededPerLevel.put(25, 19531);
        xpNeededPerLevel.put(26, 21970);
        xpNeededPerLevel.put(27, 24603);
        xpNeededPerLevel.put(28, 27440);
        xpNeededPerLevel.put(29, 30486);
        xpNeededPerLevel.put(30, 33750);
        xpNeededPerLevel.put(31, 37238);
        xpNeededPerLevel.put(32, 40960);
        xpNeededPerLevel.put(33, 44921);
        xpNeededPerLevel.put(34, 49130);
        xpNeededPerLevel.put(35, 53593);
        xpNeededPerLevel.put(36, 58320);
        xpNeededPerLevel.put(37, 63316);
        xpNeededPerLevel.put(38, 68590);
        xpNeededPerLevel.put(39, 74148);
        xpNeededPerLevel.put(40, 80000);
        xpNeededPerLevel.put(41, 86151);
        xpNeededPerLevel.put(42, 92610);
        xpNeededPerLevel.put(43, 99383);
        xpNeededPerLevel.put(44, 106480);
        xpNeededPerLevel.put(45, 113906);
        xpNeededPerLevel.put(46, 121670);
        xpNeededPerLevel.put(47, 129778);
        xpNeededPerLevel.put(48, 138240);
        xpNeededPerLevel.put(49, 147061);
        xpNeededPerLevel.put(50, 156250);
        xpNeededPerLevel.put(51, 165813);
        xpNeededPerLevel.put(52, 175760);
        xpNeededPerLevel.put(53, 186096);
        xpNeededPerLevel.put(54, 196830);
        xpNeededPerLevel.put(55, 207968);
        xpNeededPerLevel.put(56, 219520);
        xpNeededPerLevel.put(57, 231491);
        xpNeededPerLevel.put(58, 243890);
        xpNeededPerLevel.put(59, 256723);
        xpNeededPerLevel.put(60, 270000);
        xpNeededPerLevel.put(61, 283726);
        xpNeededPerLevel.put(62, 297910);
        xpNeededPerLevel.put(63, 312558);
        xpNeededPerLevel.put(64, 327680);
        xpNeededPerLevel.put(65, 343281);
        xpNeededPerLevel.put(66, 359370);
        xpNeededPerLevel.put(67, 375953);
        xpNeededPerLevel.put(68, 393040);
        xpNeededPerLevel.put(69, 410636);
        xpNeededPerLevel.put(70, 428750);
        xpNeededPerLevel.put(71, 447388);
        xpNeededPerLevel.put(72, 466560);
        xpNeededPerLevel.put(73, 486271);
        xpNeededPerLevel.put(74, 506530);
        xpNeededPerLevel.put(75, 527343);
        xpNeededPerLevel.put(76, 548720);
        xpNeededPerLevel.put(77, 570666);
        xpNeededPerLevel.put(78, 593190);
        xpNeededPerLevel.put(79, 616298);
        xpNeededPerLevel.put(80, 640000);
        xpNeededPerLevel.put(81, 664301);
        xpNeededPerLevel.put(82, 689210);
        xpNeededPerLevel.put(83, 714733);
        xpNeededPerLevel.put(84, 740880);
        xpNeededPerLevel.put(85, 767656);
        xpNeededPerLevel.put(86, 795070);
        xpNeededPerLevel.put(87, 823128);
        xpNeededPerLevel.put(88, 851840);
        xpNeededPerLevel.put(89, 881211);
        xpNeededPerLevel.put(90, 911250);
        xpNeededPerLevel.put(91, 941963);
        xpNeededPerLevel.put(92, 973360);
        xpNeededPerLevel.put(93, 1005446);
        xpNeededPerLevel.put(94, 1038230);
        xpNeededPerLevel.put(95, 1071718);
        xpNeededPerLevel.put(96, 1105920);
        xpNeededPerLevel.put(97, 1140841);
        xpNeededPerLevel.put(98, 1176490);
        xpNeededPerLevel.put(99, 1212873);
        xpNeededPerLevel.put(100, 1250000);
    }

    Slow() {

    }

    @Override
    Map<Integer, Integer> getXpNeededPerLevel() {
        return xpNeededPerLevel;
    }
}
