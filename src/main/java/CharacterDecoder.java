import java.util.HashMap;
import java.util.Map;

class CharacterDecoder {
    private static final Map<Byte, Character> decoding = new HashMap<>();
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
    }

    private static void addDecoding(char ch) {
        decoding.put(currentByte, ch);
        currentByte++;
    }

    static String decodeCharacter(byte encodedCharacter) {
        final Character decodedCharacter = decoding.get(encodedCharacter);
        if (decodedCharacter == null) {
            return " ";
        }
        return decodedCharacter.toString();
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
