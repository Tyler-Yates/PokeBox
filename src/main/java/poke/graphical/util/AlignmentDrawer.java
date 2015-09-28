package poke.graphical.util;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class AlignmentDrawer {
    public static void drawCentered(Graphics g, BufferedImage image, Rectangle rectangle, JFrame frame) {
        int x = (int) (rectangle.getX() + rectangle.getWidth() / 2);
        int y = (int) (rectangle.getY() + rectangle.getHeight() / 2);
        x -= image.getWidth() / 2;
        y -= image.getHeight() / 2;
        g.drawImage(image, x, y, frame);
    }

    public static void drawCenteredHorizontal(Graphics g, BufferedImage image, Rectangle rectangle, int y,
            JFrame frame) {
        int x = (int) (rectangle.getX() + rectangle.getWidth() / 2);
        x -= image.getWidth() / 2;
        g.drawImage(image, x, y, frame);
    }
}
