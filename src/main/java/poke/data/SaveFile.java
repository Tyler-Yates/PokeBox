package poke.data;

import java.util.List;

public class SaveFile {
    private final String fileLocation;
    private final Trainer trainer;
    private final List<Pokemon> partyPokemon;
    private final List<List<Pokemon>> boxes;

    public SaveFile(String fileLocation, Trainer trainer, List<Pokemon> partyPokemon, List<List<Pokemon>> boxes) {
        this.fileLocation = fileLocation;
        this.trainer = trainer;
        this.partyPokemon = partyPokemon;
        this.boxes = boxes;
    }

    private static String pokemonListToString(List<Pokemon> pokemonList) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number of pokemon: ").append(pokemonList.size()).append("\n");
        for (final Pokemon pokemon : pokemonList) {
            stringBuilder.append(pokemon.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public List<Pokemon> getPartyPokemon() {
        return partyPokemon;
    }

    public List<List<Pokemon>> getBoxes() {
        return boxes;
    }

    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Save file location: ").append(fileLocation).append("\n");
        builder.append(trainer.toString()).append("\n");
        builder.append("\n");
        builder.append("Party Pokemon: \n");
        builder.append(pokemonListToString(partyPokemon)).append("\n");
        int boxNumber = 1;
        for (final List<Pokemon> box : boxes) {
            builder.append("\nBox ").append(boxNumber).append("\n");
            builder.append(pokemonListToString(box));
            boxNumber++;
        }
        return builder.toString();
    }
}
