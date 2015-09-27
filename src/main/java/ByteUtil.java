import java.util.Arrays;

final class ByteUtil {

    static byte[] getBytes(byte[] bytes, int offset, int size) {
        return Arrays.copyOfRange(bytes, offset, offset + size);
    }
}
