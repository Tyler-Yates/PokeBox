package poke.data;

import java.util.HashMap;
import java.util.Map;

public enum Type {
    NORMAL, FIRE, WATER, ELECTRIC, GRASS, ICE, FIGHTING, POISON, GROUND, FLYING, PSYCHIC, BUG, ROCK, GHOST, DRAGON;

    private static final Map<Byte, Type> mapping = new HashMap<>();

    static {
        mapping.put((byte) 0x00, NORMAL);
        mapping.put((byte) 0x01, FIGHTING);
        mapping.put((byte) 0x02, FLYING);
        mapping.put((byte) 0x03, POISON);
        mapping.put((byte) 0x04, GROUND);
        mapping.put((byte) 0x05, ROCK);
        mapping.put((byte) 0x07, BUG);
        mapping.put((byte) 0x08, GHOST);
        mapping.put((byte) 0x14, FIRE);
        mapping.put((byte) 0x15, WATER);
        mapping.put((byte) 0x16, GRASS);
        mapping.put((byte) 0x17, ELECTRIC);
        mapping.put((byte) 0x18, PSYCHIC);
        mapping.put((byte) 0x19, ICE);
        mapping.put((byte) 0x1A, DRAGON);
    }

    public static Type getType(byte b) {
        final Type type = mapping.get(b);
        if (type == null) {
            return NORMAL;
        }
        return type;
    }
}
