package poke.graphical;

import poke.data.Pokemon;
import poke.data.PokemonList;
import poke.data.SaveFile;
import poke.decode.SaveFileReader;
import poke.graphical.elements.Element;
import poke.graphical.elements.PokemonListElement;
import poke.graphical.elements.PokemonPanel;
import poke.graphical.elements.TooltipElement;
import poke.graphical.elements.TrainerPanel;

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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphicalInterface extends JPanel implements KeyListener, MouseListener, MouseMotionListener {
    private static final double VERSION = 0.1;
    public static JFrame frame;
    private final List<Element> elements = new ArrayList<>();
    private SaveFile saveFile = null;

    private Map<Integer, String> pokemonListIndexToName = new HashMap<>();
    private int currentPokemonList = 0;
    private Pokemon currentPokemon = null;
    private TooltipElement tooltipElement = null;

    private int mouseX;
    private int mouseY;

    /**
     * Initializes the JFrame
     */
    public GraphicalInterface() {
        frame = new JFrame("PokeBox v" + VERSION);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        frame.addKeyListener(this);
        frame.add(this);
    }

    void initButtons() {
        elements.clear();
        elements.add(new TrainerPanel(this));
        elements.add(new PokemonPanel(this));
        if (saveFile != null) {
            pokemonListIndexToName.clear();
            addNewPokemonList(saveFile.getPartyPokemon(), "Party");
            for (int i = 0; i < saveFile.getBoxes().size(); i++) {
                addNewPokemonList(saveFile.getBoxes().get(i), "Box " + (i + 1));
            }
        }
    }

    private void addNewPokemonList(PokemonList pokemonList, String name) {
        elements.add(new PokemonListElement(this, pokemonList, name));
        pokemonListIndexToName.put(pokemonListIndexToName.size(), name);
    }

    public SaveFile getSaveFile() {
        return saveFile;
    }

    public String getCurrentPokemonList() {
        return pokemonListIndexToName.get(currentPokemonList);
    }

    public Pokemon getCurrentPokemon() {
        return currentPokemon;
    }

    public void setCurrentPokemon(Pokemon pokemon) {
        this.currentPokemon = pokemon;
    }

    public void setTooltipElement(int x, int y, String text) {
        this.tooltipElement = new TooltipElement(x, y, text);
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

            for (final Element element : elements) {
                element.draw(g, frame);
            }
            if (tooltipElement != null) {
                tooltipElement.draw(g, frame);
            }
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
                    loadSaveFile(fileChooser.getSelectedFile());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                System.out.println("Failed!\nAborted opening file");
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && currentPokemonList > 0) {
            changePokemonList(-1);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && currentPokemonList < 12) {
            changePokemonList(1);
        }
    }

    void changePokemonList(int amount) {
        currentPokemonList += amount;
        setCurrentPokemon(null);
        for (final Element element : elements) {
            element.handleHover(mouseX, mouseY);
        }
        repaint();
    }

    void loadSaveFile(File file) throws IOException {
        System.out.print("Loading save file...");
        saveFile = SaveFileReader.readSaveFile(file);
        System.out.println("Done!\n");
        System.out.println(saveFile.toString());
        initButtons();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (final Element element : elements) {
            element.handleClick(getX(e), getY(e), e.getButton());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (final Element element : elements) {
            element.handleClick(getX(e), getY(e), e.getButton());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        final TooltipElement originalTooltip = tooltipElement;
        tooltipElement = null;
        final Pokemon originalPokemon = getCurrentPokemon();
        setCurrentPokemon(null);
        for (final Element element : elements) {
            element.handleHover(getX(e), getY(e));
        }

        if (originalPokemon != getCurrentPokemon() || originalTooltip != tooltipElement) {
            repaint();
        }
    }

    private int getX(MouseEvent e) {
        mouseX = e.getX() - frame.getInsets().left;
        return mouseX;
    }

    private int getY(MouseEvent e) {
        mouseY = e.getY() - frame.getInsets().top;
        return mouseY;
    }
}
