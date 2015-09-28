package poke.graphical.elements;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TooltipElement {
    private final int x;
    private final int y;
    private final String text;

    public TooltipElement(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(255, 229, 154));
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        final int width = g.getFontMetrics().stringWidth(text) + 10;
        final int height = 20;
        g.fillRect(x, y - height, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y - height, width, height);
        g.drawString(text, x + 5, y - 5);
    }
}
