package poke.graphical.elements;

import javax.swing.JFrame;
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

    public void draw(Graphics g, JFrame frame) {
        g.setColor(new Color(255, 229, 154));
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        final int width = g.getFontMetrics().stringWidth(text) + 10;
        final int height = 20;

        int drawX = x;
        if (x + width >= frame.getWidth() - frame.getInsets().left * 2) {
            drawX = frame.getWidth() - width - frame.getInsets().left * 2;
        }

        g.fillRect(drawX, y - height, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(drawX, y - height, width, height);
        g.drawString(text, drawX + 5, y - 5);
    }
}
