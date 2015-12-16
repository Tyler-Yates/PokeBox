package poke.decode;

import org.apache.commons.lang.StringUtils;

class MoneyDecoder {

    static int getMoney(byte[] encodedMoney) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final byte b : encodedMoney) {
            // Each byte is a binary coded decimal with two digits.
            final String string = StringUtils.leftPad(Integer.toBinaryString(b), 8, '0');
            stringBuilder.append(Integer.parseInt(string.substring(0, 4), 2));
            stringBuilder.append(Integer.parseInt(string.substring(4, 8), 2));
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
