package poke.data;

import java.math.BigInteger;
import java.util.Arrays;

public class Badges {
    private static final String[] badgeNames = {"Boulder", "Cascade", "Thunder", "Rainbow", "Soul", "Marsh",
            "Volcano", "Earth"};
    private final boolean[] hasBadge = new boolean[badgeNames.length];
    private final String toString;

    public Badges(byte b) {
        for (int i = 0; i < hasBadge.length; i++) {
            hasBadge[i] = BigInteger.valueOf(Byte.toUnsignedInt(b)).testBit(i);
        }

        final StringBuilder stringBuilder = new StringBuilder("Badges Earned: [");
        for (int i = 0; i < hasBadge.length; i++) {
            if (hasBadge[i]) {
                stringBuilder.append(badgeNames[i]).append(", ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(']');
        toString = stringBuilder.toString();
    }

    public static String getBadgeName(int index) {
        if (index < 0 || index >= badgeNames.length) {
            return "";
        }
        return badgeNames[index];
    }

    public boolean hasBadge(int index) {
        return hasBadge[index];
    }

    public String toString() {
        return toString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Badges badges = (Badges) o;
        return Arrays.equals(hasBadge, badges.hasBadge);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(hasBadge);
    }
}
