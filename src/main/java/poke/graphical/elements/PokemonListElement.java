package poke.graphical.elements;

import javafx.scene.input.MouseButton;
import poke.data.Pokemon;
import poke.data.PokemonBuilder;
import poke.data.PokemonList;
import poke.data.Species;
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

public class PokemonListElement extends Element {
    private static final int separation = 80;
    private static final int left = 200;
    private static final int top = 70;

    private final PokemonList pokemonList;
    private final String name;
    private final List<PokemonElement> pokemonElements = new ArrayList<>();

    public PokemonListElement(GraphicalInterface graphicalInterface, PokemonList pokemonList, String name) {
        super(graphicalInterface);
        this.pokemonList = pokemonList;
        this.name = name;

        handleScreenResize();
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {
        graphicalInterface.resetSelectedPokemon();
        for (final PokemonElement pokemonElement : pokemonElements) {
            if (pokemonElement.isVisible()) {
                pokemonElement.handleClick(x, y, mouseButton);
            }
        }
    }

    @Override
    public void handleHover(int x, int y) {
        for (final PokemonElement pokemonElement : pokemonElements) {
            if (pokemonElement.isVisible()) {
                pokemonElement.handleHover(x, y);
            }
        }
    }

    @Override
    public void handleScreenResize() {
        pokemonElements.clear();

        final int maxX = Math.max(graphicalInterface.getFrame().getWidth() - left - 50 - 60, left + 50);
        int column = 0;
        int x = left;
        int y = 10;
        for (int i = 0; i < pokemonList.getMaxCapacity(); i++) {
            if (column % 5 == 0) {
                x = left;
                y += separation;
                column = 0;
            } else {
                x += separation;
            }

            if (x >= maxX) {
                x = left;
                y += separation;
                column = 0;
            }

            if (i < pokemonList.size()) {
                pokemonElements.add(new PokemonElement(graphicalInterface, x, y, pokemonList.getPokemon().get(i)));
            } else {
                pokemonElements.add(new EmptyPokemonElement(graphicalInterface, x, y));
            }

            column++;
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        g.drawString(name, left, top);

        for (final PokemonElement pokemonElement : pokemonElements) {
            if (pokemonElement.isVisible()) {
                pokemonElement.draw(g, frame);
            }
        }
    }

    @Override
    public boolean isVisible() {
        return name.equals(graphicalInterface.getCurrentPokemonList());
    }
}

class PokemonElement extends Element {
    protected final int x;
    protected final int y;
    protected final Pokemon pokemon;

    private BufferedImage bufferedImage;
    private Rectangle rectangle;

    private boolean hover = false;

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
        if (rectangle != null && rectangle.contains(x, y) && mouseButton == MouseButton.PRIMARY.ordinal()) {
            graphicalInterface.setCurrentSelectedPokemon(pokemon);
        }
    }

    @Override
    public void handleHover(int x, int y) {
        hover = false;
        if (rectangle != null && rectangle.contains(x, y)) {
            graphicalInterface.setCurrentMousedOverPokemon(pokemon);
            hover = true;
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        if (bufferedImage != null) {
            g.drawImage(bufferedImage, x, y, frame);
            if (pokemon == graphicalInterface.getCurrentSelectedPokemon()) {
                g.setColor(Color.RED);
                g.drawRect(x - 1, y - 1, bufferedImage.getWidth() + 2, bufferedImage.getHeight() + 2);
                g.drawRect(x, y, bufferedImage.getWidth(), bufferedImage.getHeight());
            } else if (hover) {
                g.setColor(Color.BLACK);
                g.drawRect(x, y, bufferedImage.getWidth(), bufferedImage.getHeight());
            }
        }
    }

    @Override
    public boolean isVisible() {
        return true;
    }
}

class EmptyPokemonElement extends PokemonElement {
    private boolean hover = false;
    private BufferedImage baseImage;
    private Rectangle rectangle;

    public EmptyPokemonElement(GraphicalInterface graphicalInterface, int x, int y) {
        super(graphicalInterface, x, y, new PokemonBuilder().setSpecies(Species.Abra).createPokemon());

        baseImage = ImageLoader.getImageForPokemon(pokemon);
        if (baseImage != null) {
            rectangle = new Rectangle(x, y, baseImage.getWidth(), baseImage.getHeight());
        }
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {
        hover = rectangle != null && rectangle.contains(x, y);
        graphicalInterface.repaint();
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        if (hover) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(Color.LIGHT_GRAY);
        }
        g.drawRect(x, y, baseImage.getWidth(), baseImage.getHeight());
    }

    @Override
    public boolean isVisible() {
        return true;
    }
}
