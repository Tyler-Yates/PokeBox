package poke.data;

import java.util.HashMap;
import java.util.Map;

public enum StatusCondition {
    ASLEEP, POISONED, BURNED, FROZEN, PARALYZED, NONE;

    private static final Map<Byte, StatusCondition> mapping = new HashMap<>();

    static {
        mapping.put((byte) 0x00, NONE);
        mapping.put((byte) 0x04, ASLEEP);
        mapping.put((byte) 0x08, POISONED);
        mapping.put((byte) 0x10, BURNED);
        mapping.put((byte) 0x20, FROZEN);
        mapping.put((byte) 0x40, PARALYZED);
    }

    public static StatusCondition getStatusCondition(byte b) {
        final StatusCondition statusCondition = mapping.get(b);
        if (statusCondition == null) {
            return NONE;
        }
        return statusCondition;
    }
}
