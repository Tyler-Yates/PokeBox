package poke.graphical.elements;

import javafx.scene.input.MouseButton;
import poke.data.SaveFile;
import poke.graphical.GraphicalInterface;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SaveFileLocationElement extends Element {
    private static final int height = 30;

    public SaveFileLocationElement(GraphicalInterface graphicalInterface) {
        super(graphicalInterface);
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {
        final Rectangle rectangle = new Rectangle(0, 0, graphicalInterface.getFrame().getWidth(), height);
        if (rectangle.contains(x, y) && mouseButton == MouseButton.PRIMARY.ordinal()) {
            graphicalInterface.chooseSaveFile();
        }
    }

    @Override
    public void handleHover(int x, int y) {
        final Rectangle rectangle = new Rectangle(0, 0, graphicalInterface.getFrame().getWidth(), height);
        if (rectangle.contains(x, y)) {
            graphicalInterface.setTooltipElement(x, height + 20, "Left-click to load a new save file");
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        final SaveFile saveFile = graphicalInterface.getSaveFile();
        if (saveFile != null) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0, 0, frame.getWidth(), height);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 12));
            g.drawString(saveFile.getFileLocation(), 10, height - 10);
            g.setColor(Color.DARK_GRAY);
            g.drawLine(0, height, frame.getWidth(), height);
        }
    }
}
