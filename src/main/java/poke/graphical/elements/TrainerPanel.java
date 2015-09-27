package poke.graphical.elements;

import javafx.scene.input.MouseButton;
import poke.data.Trainer;
import poke.graphical.GraphicalInterface;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.text.NumberFormat;

public class TrainerPanel extends AbstractElement {
    private final int width = 150;
    private final int top = 30;

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
        g.fillRect(0, top, width, frame.getHeight());

        g.setColor(Color.WHITE);
        final Trainer trainer = graphicalInterface.getSaveFile().getTrainer();
        g.drawString("Trainer: " + trainer.getName(), 10, top + 20);
        g.drawString("ID: " + trainer.getId(), 10, top + 80);
        g.drawString("Money: $" + NumberFormat.getInstance().format(trainer.getMoney()), 10, top + 100);
        g.drawString("Casino Coins: " + NumberFormat.getInstance().format(trainer.getCasinoCoins()), 10, top + 120);
        g.drawString("Time Played: " + trainer.getTimePlayed().split("=")[1].trim().split(" ")[0], 10, top + 140);
        g.drawString("Rival: " + trainer.getRivalName(), 10, top + 160);
    }
}
