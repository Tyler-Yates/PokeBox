package poke.graphical.elements;

import poke.data.Trainer;
import poke.graphical.GraphicalInterface;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class TrainerPanel extends AbstractElement {
    private final int width = 150;
    private final int top = 30;
    private final List<BadgeImage> badgeImages = new ArrayList<>();

    public TrainerPanel(GraphicalInterface graphicalInterface) {
        super(graphicalInterface);

        int x = 0;
        int y = 200;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                x = 25;
                y += 60;
            } else {
                x += 60;
            }
            badgeImages.add(new BadgeImage(graphicalInterface, i, x, y));
        }
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {

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

        for (final BadgeImage badgeImage : badgeImages) {
            badgeImage.draw(g, frame);
        }
    }
}

class BadgeImage extends AbstractElement {
    private final int x;
    private final int y;

    private BufferedImage bufferedImage;

    public BadgeImage(GraphicalInterface graphicalInterface, int index, int x, int y) {
        super(graphicalInterface);

        this.x = x;
        this.y = y;
        final ClassLoader classLoader = BadgeImage.class.getClassLoader();
        final URL resource = classLoader.getResource("images/badges/" + index + ".png");
        try {
            bufferedImage = ImageIO.read(new File(resource.getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void handleClick(int x, int y, int mouseButton) {

    }

    @Override
    public void handleHover(int x, int y) {

    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.drawImage(bufferedImage, x, y, frame);
    }
}
