package poke.data;

import java.util.List;

public class PokemonList {
    final int maxCapacity;
    private final List<Pokemon> pokemon;

    public PokemonList(List<Pokemon> pokemon, int maxCapacity) {
        this.pokemon = pokemon;
        this.maxCapacity = maxCapacity;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public int size() {
        return pokemon.size();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
