package poke.data.xp;

import java.util.Map;

public abstract class XpType {
    private static Slow slow;
    private static MediumSlow mediumSlow;
    private static MediumFast mediumFast;
    private static Fast fast;

    public static XpType getSlowXpType() {
        if (slow == null) {
            slow = new Slow();
        }
        return slow;
    }

    public static XpType getMediumSlowXpType() {
        if (mediumSlow == null) {
            mediumSlow = new MediumSlow();
        }
        return mediumSlow;
    }

    public static XpType getMediumFastXpType() {
        if (mediumFast == null) {
            mediumFast = new MediumFast();
        }
        return mediumFast;
    }

    public static XpType getFastXpType() {
        if (fast == null) {
            fast = new Fast();
        }
        return fast;
    }

    public int getLevel(int xp) {
        final Map<Integer, Integer> xpNeededPerLevel = getXpNeededPerLevel();
        for (int level = 2; level <= 101; level++) {
            final int neededXp = xpNeededPerLevel.get(level);
            if (xp < neededXp) {
                return level - 1;
            }
        }
        return 0;
    }

    abstract Map<Integer, Integer> getXpNeededPerLevel();
}
