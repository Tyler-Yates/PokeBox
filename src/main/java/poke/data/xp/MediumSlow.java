package poke.data.xp;

import java.util.HashMap;
import java.util.Map;

public class MediumSlow implements XpType {
    private static final Map<Integer, Integer> xpNeededPerLevel = new HashMap<>();

    static {
        for (int level = 1; level <= 100; level++) {
            xpNeededPerLevel.put(level, xpNeededForLevel(level));
        }
    }

    private static int xpNeededForLevel(int level) {
        return (int) (6.0 / 5 * Math.pow(level, 3) - 15 * Math.pow(level, 2) + 100 * level - 140);
    }

    @Override
    public int getLevel(int xp) {
        for (int level = 2; level <= 101; level++) {
            final int neededXp = xpNeededPerLevel.get(level);
            if (xp < neededXp) {
                return level - 1;
            }
        }
        return 0;
    }
}
