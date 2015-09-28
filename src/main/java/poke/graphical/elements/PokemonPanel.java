package poke.graphical.elements;

import poke.data.Pokemon;
import poke.data.Species;
import poke.graphical.GraphicalInterface;
import poke.util.ImageLoader;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import static poke.graphical.util.NumberFormatter.formatNumber;

public class PokemonPanel extends Element {
    private static final int width = 200;
    private static final int top = 30;

    public PokemonPanel(GraphicalInterface graphicalInterface) {
        super(graphicalInterface);
    }

    private static Color getHpColor(int currentHp, int maxHp) {
        double percent = 1.0 * currentHp / maxHp;
        if (percent <= 0.33) {
            return Color.RED;
        } else if (percent <= 0.66) {
            return Color.ORANGE;
        }
        return Color.GREEN;
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
        int y = top + 20;
        g.drawString(pokemon.getNickname(), textX, y);
        y += 40;
        g.drawString("Species: " + Species.getName(pokemon.getSpecies()), textX, y);
        y += 20;
        final BufferedImage image = ImageLoader.getImageForPokemon(pokemon);
        g.drawImage(image, textX, top + 80, frame);
        y += image.getHeight() + 20;
        g.drawString("Level: " + pokemon.getLevel(), textX, y);
        y += 20;
        g.drawString("XP: " + formatNumber(pokemon.getXp()), textX, y);
        y += 20;
        drawHealthBarAndStatusCondition(g, textX, y, pokemon, frame);
        y += 20;
        g.drawString("HP: " + pokemon.getCurrentHp() + "/" + pokemon.getMaxHp(), textX, y);
        y += 30;
        g.setColor(Color.WHITE);
        g.drawString("Attack: " + pokemon.getAttack(), textX, y);
        y += 20;
        g.drawString("Defense: " + pokemon.getDefense(), textX, y);
        y += 20;
        g.drawString("Speed: " + pokemon.getSpeed(), textX, y);
        y += 20;
        g.drawString("Special: " + pokemon.getSpecial(), textX, y);
        y += 40;
        g.drawString("Original Trainer: " + pokemon.getOriginalTrainerName(), textX, y);
        y += 20;
        g.drawString("Original Trainer ID: " + pokemon.getOriginalTrainerId(), textX, y);
    }

    private void drawHealthBarAndStatusCondition(Graphics g, int x, int y, Pokemon pokemon, JFrame frame) {
        final int bottom = y + 4;
        final int width = 100;
        g.drawLine(x, y, x, bottom);
        g.drawLine(x, bottom, x + width, bottom);
        g.drawLine(x + width, bottom, x + width, y);
        final int maxWidth = width - 3;
        final double percent = Math.min(1.0, 1.0 * pokemon.getCurrentHp() / pokemon.getMaxHp());
        g.setColor(getHpColor(pokemon.getCurrentHp(), pokemon.getMaxHp()));
        g.fillRect(x + 2, y, (int) (maxWidth * percent), 3);

        final BufferedImage statusConditionImage = ImageLoader.loadImageForStatusCondition(
                pokemon.getStatusCondition());
        if (statusConditionImage != null) {
            g.drawImage(statusConditionImage, x + maxWidth - statusConditionImage.getWidth(), bottom + 6, frame);
        }
    }
}
