package poke.graphical.util;

import java.text.NumberFormat;

public class NumberFormatter {
    public static String formatNumber(int num) {
        return NumberFormat.getInstance().format(num);
    }
}
