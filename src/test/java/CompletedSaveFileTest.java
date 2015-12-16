import org.junit.*;
import poke.data.*;
import poke.decode.*;

import java.io.*;
import java.net.*;
import java.util.*;

import static org.junit.Assert.*;

public class CompletedSaveFileTest {
    private static SaveFile saveFile;

    @BeforeClass
    public static void loadSaveFile() throws IOException {
        final URL resource = EmptySaveFileTest.class.getClassLoader().getResource("completed_save_file.sav");
        if (resource == null) {
            System.err.println("Cannot load save file");
        } else {
            saveFile = SaveFileReader.readSaveFile(new File(resource.getFile()));
        }
    }

    @Test
    public void testTrainerInformation() {
        final Trainer trainer = saveFile.getTrainer();
        assertEquals("YELLOW", trainer.getName());
        assertEquals("GARY", trainer.getRivalName());
        assertEquals(8, trainer.getBadges().numBadgesObtained());
        assertEquals(58848, trainer.getMoney());
        assertEquals(9999, trainer.getCasinoCoins());
    }

    @Test
    public void testPokemonInformation() {
        final PokemonList partyPokemon = saveFile.getPartyPokemon();
        final List<Pokemon> pokemonList = partyPokemon.getPokemon();
        assertEquals(5, pokemonList.size());
        assertPokemonEqual(pokemonList.get(0), Species.Zapdos, "ZAPDOS", 55, 218680, 183, 183, 112, 117, 138, 166,
                StatusCondition.NONE, "YELLOW", 31735, Move.ThunderShock, Move.DrillPeck, Move.Thunder, Move.Agility);
        assertPokemonEqual(pokemonList.get(1), Species.Articuno, "ARTICUNO", 59, 259796, 202, 202, 132, 136, 118, 164,
                StatusCondition.NONE, "YELLOW", 31735, Move.Peck, Move.IceBeam, Move.Blizzard, Move.Fly);
        assertPokemonEqual(pokemonList.get(2), Species.Charizard, "CHARIZARD", 51, 132778, 168, 168, 121, 108, 128, 117,
                StatusCondition.NONE, "YELLOW", 31735, Move.Earthquake, Move.Flamethrower, Move.Ember, Move.Cut);
    }

    private static void assertPokemonEqual(Pokemon pokemon, Species species, String nickname, int level, int xp, int hp,
                                           int maxHp, int attack, int defense, int speed, int special,
                                           StatusCondition statusCondition, String OriginalTrainerName,
                                           int OriginalTrainerId, Move move1, Move move2, Move move3, Move move4) {
        assertEquals(species, pokemon.getSpecies());
        assertEquals(nickname, pokemon.getNickname());
        assertEquals(level, pokemon.getLevel());
        assertEquals(xp, pokemon.getXp());
        assertEquals(hp, pokemon.getCurrentHp());
        assertEquals(maxHp, pokemon.getMaxHp());
        assertEquals(attack, pokemon.getAttack());
        assertEquals(defense, pokemon.getDefense());
        assertEquals(speed, pokemon.getSpeed());
        assertEquals(special, pokemon.getSpecial());
        assertEquals(statusCondition, pokemon.getStatusCondition());
        assertEquals(OriginalTrainerName, pokemon.getOriginalTrainerName());
        assertEquals(OriginalTrainerId, pokemon.getOriginalTrainerId());
        assertEquals(move1, pokemon.getMove1());
        assertEquals(move2, pokemon.getMove2());
        assertEquals(move3, pokemon.getMove3());
        assertEquals(move4, pokemon.getMove4());
    }
}
