package poke.decode;

class PpDecoder {

    public static int numberOfPpUps(byte b) {
        return Byte.toUnsignedInt((byte) (b >> 6));
    }

    public static int currentPp(byte b) {
        return Byte.toUnsignedInt((byte) (b & Byte.parseByte("00111111", 2)));
    }
}
