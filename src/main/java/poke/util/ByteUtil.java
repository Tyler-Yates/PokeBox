package poke.util;

import java.util.Arrays;

public class ByteUtil {

    public static byte[] getBytes(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, offset + size);
    }

    public static int getNumber(byte[] bytes, int offset, int numBytes) {
        int num = 0;
        for (int i = 0; i < numBytes; i++) {
            num <<= 8;
            num |= Byte.toUnsignedInt(bytes[offset + i]);
        }
        return num;
    }
}
