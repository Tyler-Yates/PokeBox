package poke.decode;

import java.util.HashMap;
import java.util.Map;

class CharacterDecoder {
    private static final Map<Byte, String> decoding = new HashMap<>();
    private static final byte STRING_TERMINATOR = 0x50;
    private static byte currentByte = (byte) 0x80;

    static {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            addDecoding(ch);
        }
        addDecoding('(');
        addDecoding(')');
        addDecoding(':');
        addDecoding(';');
        addDecoding('[');
        addDecoding(']');
        for (char ch = 'a'; ch <= 'z'; ch++) {
            addDecoding(ch);
        }
        addDecoding('é');
        addDecoding("'d");
        addDecoding("'l");
        addDecoding("'s");
        addDecoding("'t");
        addDecoding("'v");

        decoding.put((byte) 0xE0, "'");
        decoding.put((byte) 0xE1, "PK");
        decoding.put((byte) 0xE2, "MN");
        decoding.put((byte) 0xE3, "-");
        decoding.put((byte) 0xE4, "'r");
        decoding.put((byte) 0xE5, "'m");
        decoding.put((byte) 0xE6, "?");
        decoding.put((byte) 0xE7, "!");
        decoding.put((byte) 0xE8, ".");

        decoding.put((byte) 0xEF, "?");
        decoding.put((byte) 0xF5, "?");
    }

    private static void addDecoding(char ch) {
        decoding.put(currentByte, Character.toString(ch));
        currentByte++;
    }

    private static void addDecoding(String s) {
        decoding.put(currentByte, s);
        currentByte++;
    }

    static String decodeCharacter(byte encodedCharacter) {
        final String decodedCharacter = decoding.get(encodedCharacter);
        if (decodedCharacter == null) {
            return " ";
        }
        return decodedCharacter;
    }

    static String decodeCharacters(byte[] encodedCharacters) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final byte b : encodedCharacters) {
            if (b == STRING_TERMINATOR) {
                return stringBuilder.toString();
            } else {
                stringBuilder.append(decodeCharacter(b));
            }
        }
        return stringBuilder.toString();
    }
}
