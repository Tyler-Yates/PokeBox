package poke.data;

import java.math.BigInteger;

public class Badges {
    private static final String[] badgeNames = {"Boulder", "Cascade", "Thunder", "Rainbow", "Soul", "Marsh",
            "Volcano", "Earth"};
    private final String toString;

    public Badges(byte b) {
        boolean[] badges = new boolean[8];
        for (int i = 0; i < badges.length; i++) {
            badges[i] = BigInteger.valueOf(Byte.toUnsignedInt(b)).testBit(0);
        }

        final StringBuilder stringBuilder = new StringBuilder("Badges Earned: [");
        for (int i = 0; i < badges.length; i++) {
            if (badges[i]) {
                stringBuilder.append(badgeNames[i]).append(", ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(']');
        toString = stringBuilder.toString();
    }

    public String toString() {
        return toString;
    }
}
