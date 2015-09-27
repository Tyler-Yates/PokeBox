package poke.decode;

import org.apache.commons.lang.StringUtils;

public class IvDecoder {

    static int getAttackIv(int iv) {
        return (iv & Integer.parseInt("1111000000000000", 2)) >> 12;
    }

    static int getDefenseIv(int iv) {
        return (iv & Integer.parseInt("0000111100000000", 2)) >> 8;
    }

    static int getSpeedIv(int iv) {
        return (iv & Integer.parseInt("0000000011110000", 2)) >> 4;
    }

    static int getSpecialIv(int iv) {
        return iv & Integer.parseInt("0000000000001111", 2);
    }

    static int getHpIv(int iv) {
        final String binary = StringUtils.leftPad(Integer.toBinaryString(iv), 16, "0");
        return Integer.parseInt("" + binary.charAt(3) + binary.charAt(7) + binary.charAt(11) + binary.charAt(15), 2);
    }
}
