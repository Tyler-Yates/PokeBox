package poke.decode;

import org.apache.commons.lang.StringUtils;

class MoneyDecoder {

    static int getMoney(byte[] encodedMoney) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final byte b : encodedMoney) {
            /*
             Each byte is a binary coded decimal with two digits. Each byte contains two digits:
                The first four bits correspond to the first digit
                The last four bits correspond to the second digit

             For example: 00110000 corresponds to 30
              */
            final String string = StringUtils.leftPad(Integer.toBinaryString(Byte.toUnsignedInt(b)), 8, '0');
            stringBuilder.append(Integer.parseInt(string.substring(0, 4), 2));
            stringBuilder.append(Integer.parseInt(string.substring(4, 8), 2));
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
