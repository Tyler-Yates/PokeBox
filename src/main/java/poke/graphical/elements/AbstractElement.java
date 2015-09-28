package poke.graphical.elements;

import poke.graphical.GraphicalInterface;

import javax.swing.JFrame;
import java.awt.Graphics;

public abstract class AbstractElement {
    protected final GraphicalInterface graphicalInterface;

    public AbstractElement(GraphicalInterface graphicalInterface) {
        this.graphicalInterface = graphicalInterface;
    }

    public abstract void handleClick(int x, int y, int mouseButton);

    public abstract void handleHover(int x, int y);

    public abstract void draw(Graphics g, JFrame frame);
}
