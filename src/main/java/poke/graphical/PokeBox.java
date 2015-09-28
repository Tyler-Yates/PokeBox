package poke.graphical;

import java.io.File;
import java.io.IOException;

public class PokeBox {
    private static GraphicalInterface graphicalInterface;

    public static void main(String[] args) throws IOException {
        graphicalInterface = new GraphicalInterface();
        graphicalInterface.initElements();
        if (args.length == 1) {
            graphicalInterface.loadSaveFile(new File(args[0]));
        }
    }

    static void repaint() {
        graphicalInterface.repaint();
    }
}
