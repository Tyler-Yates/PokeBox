package poke.graphical.elements;

import poke.data.Pokemon;
import poke.graphical.GraphicalInterface;
import poke.util.ImageLoader;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class PokemonListElement extends AbstractElement {
    private static final int separation = 80;
    private static final int left = 200;
    private static final int top = 70;

    private final List<Pokemon> pokemonList;
    private final String name;
    private final List<PokemonElement> pokemonElements = new ArrayList<>();

    public PokemonListElement(GraphicalInterface graphicalInterface, List<Pokemon> pokemonList, String name) {
        super(graphicalInterface);
        this.pokemonList = pokemonList;
        this.name = name;

        int x = left;
        int y = 10;
        for (int i = 0; i < pokemonList.size(); i++) {
            if (i % 5 == 0) {
                x = left;
                y += separation;
            } else {
                x += separation;
            }
            pokemonElements.add(new PokemonElement(graphicalInterface, x, y, pokemonList.get(i)));
        }
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {
        if (!isVisible()) {
            return;
        }

        for (final PokemonElement pokemonElement : pokemonElements) {
            pokemonElement.handleClick(x, y, mouseButton);
        }
    }

    @Override
    public void handleHover(int x, int y) {
        if (!isVisible()) {
            return;
        }

        for (final PokemonElement pokemonElement : pokemonElements) {
            pokemonElement.handleHover(x, y);
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        if (!isVisible()) {
            return;
        }

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        g.drawString(name, left, top);

        for (final PokemonElement pokemonElement : pokemonElements) {
            pokemonElement.draw(g, frame);
        }
    }

    private boolean isVisible() {
        return name.equals(graphicalInterface.getCurrentPokemonList());
    }
}

class PokemonElement extends AbstractElement {
    private final int x;
    private final int y;
    private final Pokemon pokemon;

    private BufferedImage bufferedImage;
    private Rectangle rectangle;

    public PokemonElement(GraphicalInterface graphicalInterface, int x, int y, Pokemon pokemon) {
        super(graphicalInterface);
        this.x = x;
        this.y = y;
        this.pokemon = pokemon;

        bufferedImage = ImageLoader.getImageForPokemon(pokemon);
        if (bufferedImage != null) {
            rectangle = new Rectangle(x, y, bufferedImage.getWidth(), bufferedImage.getHeight());
        }
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {
        if (rectangle != null && rectangle.contains(x, y)) {
            graphicalInterface.setCurrentPokemon(pokemon);
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        if (bufferedImage != null) {
            g.drawImage(bufferedImage, x, y, frame);
        }
    }
}
