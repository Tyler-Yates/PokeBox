package poke.graphical.elements;

import javafx.scene.input.MouseButton;
import poke.graphical.GraphicalInterface;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class TrainerPanel extends AbstractElement {
    private final int width = 100;

    public TrainerPanel(GraphicalInterface graphicalInterface) {
        super(graphicalInterface);
    }

    @Override
    public void handleClick(int x, int y, MouseButton mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {

    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 30, width, frame.getHeight());
    }
}
