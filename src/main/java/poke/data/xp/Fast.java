package poke.data.xp;


import java.util.HashMap;
import java.util.Map;

public class Fast extends XpType {
    private static final Map<Integer, Integer> xpNeededPerLevel = new HashMap<>();

    static {
        xpNeededPerLevel.put(1, 0);
        xpNeededPerLevel.put(2, 6);
        xpNeededPerLevel.put(3, 21);
        xpNeededPerLevel.put(4, 51);
        xpNeededPerLevel.put(5, 100);
        xpNeededPerLevel.put(6, 172);
        xpNeededPerLevel.put(7, 274);
        xpNeededPerLevel.put(8, 409);
        xpNeededPerLevel.put(9, 583);
        xpNeededPerLevel.put(10, 800);
        xpNeededPerLevel.put(11, 1064);
        xpNeededPerLevel.put(12, 1382);
        xpNeededPerLevel.put(13, 1757);
        xpNeededPerLevel.put(14, 2195);
        xpNeededPerLevel.put(15, 2700);
        xpNeededPerLevel.put(16, 3276);
        xpNeededPerLevel.put(17, 3930);
        xpNeededPerLevel.put(18, 4665);
        xpNeededPerLevel.put(19, 5487);
        xpNeededPerLevel.put(20, 6400);
        xpNeededPerLevel.put(21, 7408);
        xpNeededPerLevel.put(22, 8518);
        xpNeededPerLevel.put(23, 9733);
        xpNeededPerLevel.put(24, 11059);
        xpNeededPerLevel.put(25, 12500);
        xpNeededPerLevel.put(26, 14060);
        xpNeededPerLevel.put(27, 15746);
        xpNeededPerLevel.put(28, 17561);
        xpNeededPerLevel.put(29, 19511);
        xpNeededPerLevel.put(30, 21600);
        xpNeededPerLevel.put(31, 23832);
        xpNeededPerLevel.put(32, 26214);
        xpNeededPerLevel.put(33, 28749);
        xpNeededPerLevel.put(34, 31443);
        xpNeededPerLevel.put(35, 34300);
        xpNeededPerLevel.put(36, 37324);
        xpNeededPerLevel.put(37, 40522);
        xpNeededPerLevel.put(38, 43897);
        xpNeededPerLevel.put(39, 47455);
        xpNeededPerLevel.put(40, 51200);
        xpNeededPerLevel.put(41, 55136);
        xpNeededPerLevel.put(42, 59270);
        xpNeededPerLevel.put(43, 63605);
        xpNeededPerLevel.put(44, 68147);
        xpNeededPerLevel.put(45, 72900);
        xpNeededPerLevel.put(46, 77868);
        xpNeededPerLevel.put(47, 83058);
        xpNeededPerLevel.put(48, 88473);
        xpNeededPerLevel.put(49, 94119);
        xpNeededPerLevel.put(50, 100000);
        xpNeededPerLevel.put(51, 106120);
        xpNeededPerLevel.put(52, 112486);
        xpNeededPerLevel.put(53, 119101);
        xpNeededPerLevel.put(54, 125971);
        xpNeededPerLevel.put(55, 133100);
        xpNeededPerLevel.put(56, 140492);
        xpNeededPerLevel.put(57, 148154);
        xpNeededPerLevel.put(58, 156089);
        xpNeededPerLevel.put(59, 164303);
        xpNeededPerLevel.put(60, 172800);
        xpNeededPerLevel.put(61, 181584);
        xpNeededPerLevel.put(62, 190662);
        xpNeededPerLevel.put(63, 200037);
        xpNeededPerLevel.put(64, 209715);
        xpNeededPerLevel.put(65, 219700);
        xpNeededPerLevel.put(66, 229996);
        xpNeededPerLevel.put(67, 240610);
        xpNeededPerLevel.put(68, 251545);
        xpNeededPerLevel.put(69, 262807);
        xpNeededPerLevel.put(70, 274400);
        xpNeededPerLevel.put(71, 286328);
        xpNeededPerLevel.put(72, 298598);
        xpNeededPerLevel.put(73, 311213);
        xpNeededPerLevel.put(74, 324179);
        xpNeededPerLevel.put(75, 337500);
        xpNeededPerLevel.put(76, 351180);
        xpNeededPerLevel.put(77, 365226);
        xpNeededPerLevel.put(78, 379641);
        xpNeededPerLevel.put(79, 394431);
        xpNeededPerLevel.put(80, 409600);
        xpNeededPerLevel.put(81, 425152);
        xpNeededPerLevel.put(82, 441094);
        xpNeededPerLevel.put(83, 457429);
        xpNeededPerLevel.put(84, 474163);
        xpNeededPerLevel.put(85, 491300);
        xpNeededPerLevel.put(86, 508844);
        xpNeededPerLevel.put(87, 526802);
        xpNeededPerLevel.put(88, 545177);
        xpNeededPerLevel.put(89, 563975);
        xpNeededPerLevel.put(90, 583200);
        xpNeededPerLevel.put(91, 602856);
        xpNeededPerLevel.put(92, 622950);
        xpNeededPerLevel.put(93, 643485);
        xpNeededPerLevel.put(94, 664467);
        xpNeededPerLevel.put(95, 685900);
        xpNeededPerLevel.put(96, 707788);
        xpNeededPerLevel.put(97, 730138);
        xpNeededPerLevel.put(98, 752953);
        xpNeededPerLevel.put(99, 776239);
        xpNeededPerLevel.put(100, 800000);
    }

    @Override
    Map<Integer, Integer> getXpNeededPerLevel() {
        return xpNeededPerLevel;
    }
}
