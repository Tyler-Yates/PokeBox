package poke.graphical.elements;

import javafx.scene.input.MouseButton;
import org.apache.commons.lang.StringUtils;
import poke.data.Pokemon;
import poke.data.Species;
import poke.graphical.GraphicalInterface;
import poke.util.PokedexIndex;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
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
            pokemonElements.add(new PokemonElement(graphicalInterface, x, y, pokemonList.get(i).getSpecies()));
        }
    }

    @Override
    public void handleClick(int x, int y, MouseButton mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {

    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 32));
        g.drawString(name, left, top);

        for (final PokemonElement pokemonElement : pokemonElements) {
            pokemonElement.draw(g, frame);
        }
    }
}

class PokemonElement extends AbstractElement {
    private final int x;
    private final int y;
    private final Species species;

    private BufferedImage bufferedImage;

    public PokemonElement(GraphicalInterface graphicalInterface, int x, int y, Species species) {
        super(graphicalInterface);
        this.x = x;
        this.y = y;
        this.species = species;

        final ClassLoader classLoader = BadgeImage.class.getClassLoader();
        final int pokedexIndex = PokedexIndex.getPokedexIndex(species);
        final String imageName = StringUtils.leftPad(Integer.toString(pokedexIndex), 3, "0");
        final URL resource = classLoader.getResource("images/pokemon/" + imageName + ".png");
        try {
            bufferedImage = ImageIO.read(new File(resource.getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void handleClick(int x, int y, MouseButton mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {

    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        System.out.println("drawing image");
        g.drawImage(bufferedImage, x, y, frame);
    }
}
