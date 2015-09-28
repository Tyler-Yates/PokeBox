package poke.graphical.elements;

import poke.data.Badges;
import poke.data.SaveFile;
import poke.data.Trainer;
import poke.graphical.GraphicalInterface;
import poke.util.ImageLoader;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import static poke.graphical.util.NumberFormatter.formatNumber;

public class TrainerPanel extends Element {
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
        for (final BadgeImage badgeImage : badgeImages) {
            if (badgeImage.isVisible()) {
                badgeImage.handleHover(x, y);
            }
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, top, width, frame.getHeight());

        g.setColor(Color.WHITE);
        final Trainer trainer = graphicalInterface.getSaveFile().getTrainer();
        g.drawString("Trainer: " + trainer.getName(), 10, top + 20);
        g.drawString("ID: " + trainer.getId(), 10, top + 80);
        g.drawString("Money: $" + formatNumber(trainer.getMoney()), 10, top + 100);
        g.drawString("Casino Coins: " + formatNumber(trainer.getCasinoCoins()), 10, top + 120);
        g.drawString("Time Played: " + trainer.getTimePlayed().split("=")[1].trim().split(" ")[0], 10, top + 140);
        g.drawString("Rival: " + trainer.getRivalName(), 10, top + 160);

        for (final BadgeImage badgeImage : badgeImages) {
            if (badgeImage.isVisible()) {
                badgeImage.draw(g, frame);
            }
        }
    }

    @Override
    public boolean isVisible() {
        return true;
    }
}

class BadgeImage extends Element {
    private final int x;
    private final int y;
    private final int index;

    private BufferedImage bufferedImage;
    private Rectangle rectangle;

    public BadgeImage(GraphicalInterface graphicalInterface, int index, int x, int y) {
        super(graphicalInterface);
        this.x = x;
        this.y = y;
        this.index = index;

        bufferedImage = ImageLoader.loadImageForBadge(index);
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
            graphicalInterface.setTooltipElement(x, y, Badges.getBadgeName(index) + " Badge");
        }
    }

    @Override
    public void draw(Graphics g, JFrame frame) {
        g.drawImage(bufferedImage, x, y, frame);
    }

    @Override
    public boolean isVisible() {
        final SaveFile saveFile = graphicalInterface.getSaveFile();
        return saveFile != null && saveFile.getTrainer().getBadges().hasBadge(index);
    }
}
