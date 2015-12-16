package poke.util;

import org.apache.commons.lang.StringUtils;
import poke.data.Pokemon;
import poke.data.StatusCondition;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ImageLoader {
    private static final Map<String, BufferedImage> cache = new HashMap<>();

    /**
     * Loads and returns the given image from the resources folder. The image name should contain the extension.
     * <p>
     * E.g. loadImage("pokemon/001.png") will find the image "resources/images/pokemon/001.png"
     *
     * @param name the name of the image relative to resources/images with extension
     *
     * @return the image or {@code null} if the image could not be found
     */
    private static BufferedImage loadImage(String name) {
        final BufferedImage bufferedImage = cache.get(name);
        if (bufferedImage != null) {
            return bufferedImage;
        }

        final ClassLoader classLoader = ImageLoader.class.getClassLoader();
        final URL resource = classLoader.getResource("images/" + name);
        if (resource == null) {
            return null;
        }
        try {
            final BufferedImage image = ImageIO.read(new File(resource.getFile()));
            cache.put(name, image);
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage getImageForPokemon(Pokemon pokemon) {
        final int pokeIndex = PokedexIndex.getPokedexIndex(pokemon.getSpecies());
        final String imageName = StringUtils.leftPad(Integer.toString(pokeIndex), 3, "0");
        return loadImage("pokemon/" + imageName + ".png");
    }

    public static BufferedImage loadImageForBadge(int index) {
        final String imageName = "badges/" + index + ".png";
        return loadImage(imageName);
    }

    public static BufferedImage loadImageForStatusCondition(StatusCondition statusCondition) {
        final StringBuilder imageName = new StringBuilder("status/");
        switch (statusCondition) {
            case BURNED:
                imageName.append("burn");
                break;
            case FROZEN:
                imageName.append("frozen");
                break;
            case PARALYZED:
                imageName.append("paralyzed");
                break;
            case POISONED:
                imageName.append("poisoned");
                break;
            case ASLEEP:
                imageName.append("sleep");
                break;
            default:
                return null;
        }
        return loadImage(imageName.append(".png").toString());
    }
}
