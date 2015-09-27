package poke.decode;

import org.apache.commons.lang.StringUtils;
import poke.util.ByteUtil;

class TimeDecoder {

    static String decodeTime(byte[] bytes) {
        final String hours = StringUtils.leftPad(Integer.toString(ByteUtil.getNumber(bytes, 0, 1)), 2, "0");
        final String minutes = StringUtils.leftPad(Integer.toString(ByteUtil.getNumber(bytes, 2, 1)), 2, "0");
        final String seconds = StringUtils.leftPad(Integer.toString(ByteUtil.getNumber(bytes, 3, 1)), 2, "0");
        final String frames = Integer.toString(ByteUtil.getNumber(bytes, 4, 1));

        return "hh:mm:ss = " + String.join(":", hours, minutes, seconds) + " Frames = " + frames;
    }
}
