package poke.data.xp;

import java.util.HashMap;
import java.util.Map;

public class MediumSlow extends XpType {
    private static final Map<Integer, Integer> xpNeededPerLevel = new HashMap<>();

    static {
        xpNeededPerLevel.put(1, 0);
        xpNeededPerLevel.put(2, 9);
        xpNeededPerLevel.put(3, 57);
        xpNeededPerLevel.put(4, 96);
        xpNeededPerLevel.put(5, 135);
        xpNeededPerLevel.put(6, 179);
        xpNeededPerLevel.put(7, 236);
        xpNeededPerLevel.put(8, 314);
        xpNeededPerLevel.put(9, 419);
        xpNeededPerLevel.put(10, 560);
        xpNeededPerLevel.put(11, 742);
        xpNeededPerLevel.put(12, 973);
        xpNeededPerLevel.put(13, 1261);
        xpNeededPerLevel.put(14, 1612);
        xpNeededPerLevel.put(15, 2035);
        xpNeededPerLevel.put(16, 2535);
        xpNeededPerLevel.put(17, 3120);
        xpNeededPerLevel.put(18, 3798);
        xpNeededPerLevel.put(19, 4575);
        xpNeededPerLevel.put(20, 5460);
        xpNeededPerLevel.put(21, 6458);
        xpNeededPerLevel.put(22, 7577);
        xpNeededPerLevel.put(23, 8825);
        xpNeededPerLevel.put(24, 10208);
        xpNeededPerLevel.put(25, 11735);
        xpNeededPerLevel.put(26, 13411);
        xpNeededPerLevel.put(27, 15244);
        xpNeededPerLevel.put(28, 17242);
        xpNeededPerLevel.put(29, 19411);
        xpNeededPerLevel.put(30, 21760);
        xpNeededPerLevel.put(31, 24294);
        xpNeededPerLevel.put(32, 27021);
        xpNeededPerLevel.put(33, 29949);
        xpNeededPerLevel.put(34, 33084);
        xpNeededPerLevel.put(35, 36435);
        xpNeededPerLevel.put(36, 40007);
        xpNeededPerLevel.put(37, 43808);
        xpNeededPerLevel.put(38, 47846);
        xpNeededPerLevel.put(39, 52127);
        xpNeededPerLevel.put(40, 56660);
        xpNeededPerLevel.put(41, 61450);
        xpNeededPerLevel.put(42, 66505);
        xpNeededPerLevel.put(43, 71833);
        xpNeededPerLevel.put(44, 77440);
        xpNeededPerLevel.put(45, 83335);
        xpNeededPerLevel.put(46, 89523);
        xpNeededPerLevel.put(47, 96012);
        xpNeededPerLevel.put(48, 102810);
        xpNeededPerLevel.put(49, 109923);
        xpNeededPerLevel.put(50, 117360);
        xpNeededPerLevel.put(51, 125126);
        xpNeededPerLevel.put(52, 133229);
        xpNeededPerLevel.put(53, 141677);
        xpNeededPerLevel.put(54, 150476);
        xpNeededPerLevel.put(55, 159635);
        xpNeededPerLevel.put(56, 169159);
        xpNeededPerLevel.put(57, 179056);
        xpNeededPerLevel.put(58, 189334);
        xpNeededPerLevel.put(59, 199999);
        xpNeededPerLevel.put(60, 211060);
        xpNeededPerLevel.put(61, 222522);
        xpNeededPerLevel.put(62, 234393);
        xpNeededPerLevel.put(63, 246681);
        xpNeededPerLevel.put(64, 259392);
        xpNeededPerLevel.put(65, 272535);
        xpNeededPerLevel.put(66, 286115);
        xpNeededPerLevel.put(67, 300140);
        xpNeededPerLevel.put(68, 314618);
        xpNeededPerLevel.put(69, 329555);
        xpNeededPerLevel.put(70, 344960);
        xpNeededPerLevel.put(71, 360838);
        xpNeededPerLevel.put(72, 377197);
        xpNeededPerLevel.put(73, 394045);
        xpNeededPerLevel.put(74, 411388);
        xpNeededPerLevel.put(75, 429235);
        xpNeededPerLevel.put(76, 447591);
        xpNeededPerLevel.put(77, 466464);
        xpNeededPerLevel.put(78, 485862);
        xpNeededPerLevel.put(79, 505791);
        xpNeededPerLevel.put(80, 526260);
        xpNeededPerLevel.put(81, 547274);
        xpNeededPerLevel.put(82, 568841);
        xpNeededPerLevel.put(83, 590969);
        xpNeededPerLevel.put(84, 613664);
        xpNeededPerLevel.put(85, 636935);
        xpNeededPerLevel.put(86, 660787);
        xpNeededPerLevel.put(87, 685228);
        xpNeededPerLevel.put(88, 710266);
        xpNeededPerLevel.put(89, 735907);
        xpNeededPerLevel.put(90, 762160);
        xpNeededPerLevel.put(91, 789030);
        xpNeededPerLevel.put(92, 816525);
        xpNeededPerLevel.put(93, 844653);
        xpNeededPerLevel.put(94, 873420);
        xpNeededPerLevel.put(95, 902835);
        xpNeededPerLevel.put(96, 932903);
        xpNeededPerLevel.put(97, 963632);
        xpNeededPerLevel.put(98, 995030);
        xpNeededPerLevel.put(99, 1027103);
        xpNeededPerLevel.put(100, 1059860);
    }

    MediumSlow() {

    }

    @Override
    Map<Integer, Integer> getXpNeededPerLevel() {
        return xpNeededPerLevel;
    }
}
