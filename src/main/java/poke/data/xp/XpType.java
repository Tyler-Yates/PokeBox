package poke.data.xp;

import java.util.Map;

public abstract class XpType {
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
