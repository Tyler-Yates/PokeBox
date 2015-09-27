package poke.graphical;

import poke.data.SaveFile;
import poke.decode.SaveFileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.io.IOException;

public class GraphicalInterface extends JPanel implements KeyListener {
    private static final double VERSION = 0.1;
    public static JFrame frame;
    private SaveFile saveFile = null;

    /**
     * Initializes the JFrame
     */
    public GraphicalInterface() {
        frame = new JFrame("PokeBox v" + VERSION);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        //frame.addMouseMotionListener(this);
        //frame.addMouseListener(this);
        frame.addKeyListener(this);
        frame.add(this);
    }

    public static void main(String[] args) {
        new GraphicalInterface();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (saveFile == null) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            drawStringCentered("Press 'L' to load a save file", g);
        } else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 12));
            g.drawString(saveFile.getFileLocation(), 10, 20);
        }
    }

    private void drawStringCentered(String s, Graphics g) {
        // Find the size of string s in font f in the current Graphics context g.
        FontMetrics fm = g.getFontMetrics(g.getFont());
        Rectangle2D rect = fm.getStringBounds(s, g);

        int textHeight = (int) (rect.getHeight());
        int textWidth = (int) (rect.getWidth());
        int panelHeight = this.getHeight();
        int panelWidth = this.getWidth();

        // Center text horizontally and vertically
        int x = (panelWidth - textWidth) / 2;
        int y = (panelHeight - textHeight) / 2 + fm.getAscent();

        g.drawString(s, x, y);  // Draw the string.
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (Character.toUpperCase(e.getKeyChar()) == 'L') {
            final JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Save files", "sav"));
            int returnVal = fileChooser.showOpenDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    System.out.print("Loading save file...");
                    saveFile = SaveFileReader.readSaveFile(fileChooser.getSelectedFile());
                    System.out.println("Done!\n");
                    System.out.println(saveFile.toString());
                    repaint();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                System.out.println("Failed!\nAborted opening file");
            }
        }
    }
}
