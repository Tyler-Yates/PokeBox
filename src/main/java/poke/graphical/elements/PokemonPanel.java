package poke.graphical.elements;

import poke.data.Pokemon;
import poke.graphical.GraphicalInterface;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class PokemonPanel extends AbstractElement {
    private static final int width = 150;
    private static final int top = 30;

    public PokemonPanel(GraphicalInterface graphicalInterface) {
        super(graphicalInterface);
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {

    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        final int left = frame.getWidth() - width;
        g.setColor(Color.DARK_GRAY);
        g.fillRect(left, 30, width, frame.getHeight());

        final int textX = left + 10;
        final Pokemon pokemon = graphicalInterface.getCurrentPokemon();
        if (pokemon == null) {
            return;
        }
        g.setColor(Color.WHITE);
        g.drawString(pokemon.getNickname(), textX, top + 20);
    }
}
