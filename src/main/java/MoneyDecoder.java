public class MoneyDecoder {

    static int getMoney(byte[] encodedMoney) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final byte b : encodedMoney) {
            final String string = Integer.toHexString(Byte.toUnsignedInt(b));
            stringBuilder.append(string);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
