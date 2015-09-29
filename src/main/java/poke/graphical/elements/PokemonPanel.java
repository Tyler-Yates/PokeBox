package poke.graphical.elements;

import poke.data.Move;
import poke.data.Pokemon;
import poke.data.Species;
import poke.data.Type;
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
        final Pokemon pokemon = getPokemon();
        if (pokemon == null) {
            return;
        }
        g.setColor(Color.WHITE);
        int y = top + 20;
        g.drawString(pokemon.getNickname(), textX, y);
        y += 40;
        g.drawString("Species: " + Species.getName(pokemon.getSpecies()), textX, y);
        y += 20;
        final Type type1 = pokemon.getType1();
        final Type type2 = pokemon.getType2();
        if (type1.equals(type2)) {
            g.drawString("" + pokemon.getType1(), textX, y);
        } else {
            g.drawString(pokemon.getType1() + " / " + pokemon.getType2(), textX, y);
        }
        y += 20;
        final BufferedImage image = ImageLoader.getImageForPokemon(pokemon);
        g.drawImage(image, textX, y, frame);
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
        y += 40;
        y += drawMove(g, textX, y, 1, pokemon.getMove1(), pokemon.getCurrentMove1pp(), pokemon.getMove1ppUps());
        y += drawMove(g, textX, y, 2, pokemon.getMove2(), pokemon.getCurrentMove2pp(), pokemon.getMove2ppUps());
        y += drawMove(g, textX, y, 3, pokemon.getMove3(), pokemon.getCurrentMove3pp(), pokemon.getMove3ppUps());
        y += drawMove(g, textX, y, 4, pokemon.getMove4(), pokemon.getCurrentMove4pp(), pokemon.getMove4ppUps());
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    private Pokemon getPokemon() {
        final Pokemon selectedPokemon = graphicalInterface.getCurrentSelectedPokemon();
        if (selectedPokemon == null) {
            return graphicalInterface.getCurrentPokemon();
        }
        return selectedPokemon;
    }

    private int drawMove(Graphics g, int x, int y, int index, Move move, int currentPp, int ppUps) {
        final String moveName = Move.getMoveName(move);
        if (moveName.equals(Move.getMoveName(Move.Struggle))) {
            return 0;
        }
        g.drawString("Move " + index + ": " + Move.getMoveName(move), x, y);
        g.drawString("    PP: " + currentPp + "/" + (Move.getBasePp(move) + ppUps * 3), x, y + 20);
        return 50;
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
