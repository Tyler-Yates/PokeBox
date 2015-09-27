package poke.decode;

import poke.data.Pokemon;
import poke.data.PokemonBuilder;
import poke.util.ByteUtil;

import java.util.ArrayList;
import java.util.List;

class PokemonDecoder {
    private static final int PARTY_POKEMON_LENGTH = 44;

    static List<Pokemon> decodePokemonPartyList(byte[] bytes) {
        final int numPokemon = bytes[0];
        final List<Pokemon> pokemon = new ArrayList<>(numPokemon);
        for (int i = 0; i < numPokemon; i++) {
            pokemon.add(decodePokemon(ByteUtil.getBytes(bytes, 8 + i * PARTY_POKEMON_LENGTH, PARTY_POKEMON_LENGTH)));
        }
        return pokemon;
    }

    static Pokemon decodePokemon(byte[] bytes) {
        final PokemonBuilder pokemonBuilder = new PokemonBuilder();
        pokemonBuilder.setSpecies(bytes[0x0]);
        pokemonBuilder.setCurrentHp(ByteUtil.getNumber(bytes, 0x1, 2));
        pokemonBuilder.setLevel(Byte.toUnsignedInt(bytes[0x21]));

        return pokemonBuilder.createPokemon();
    }
}
