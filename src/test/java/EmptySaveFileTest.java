import org.junit.BeforeClass;
import org.junit.Test;
import poke.data.PokemonList;
import poke.data.SaveFile;
import poke.data.Trainer;
import poke.decode.SaveFileReader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class EmptySaveFileTest {
    private static SaveFile saveFile;

    @BeforeClass
    public static void loadSaveFile() throws IOException {
        final URL resource = EmptySaveFileTest.class.getClassLoader().getResource("empty_save_file.sav");
        if (resource == null) {
            System.err.println("Cannot load save file");
        } else {
            saveFile = SaveFileReader.readSaveFile(new File(resource.getFile()));
        }
    }

    @Test
    public void testTrainerInformation() {
        final Trainer trainer = saveFile.getTrainer();
        assertEquals("ASH", trainer.getName());
        assertEquals("GARY", trainer.getRivalName());
        assertEquals(0, trainer.getBadges().numBadgesObtained());
        assertEquals(3000, trainer.getMoney());
        assertEquals(0, trainer.getCasinoCoins());
    }

    @Test
    public void testPokemonInformation() {
        final PokemonList partyPokemon = saveFile.getPartyPokemon();
        assertEquals(0, partyPokemon.size());
        for (final PokemonList box : saveFile.getBoxes()) {
            assertEquals(0, box.size());
        }
    }
}
