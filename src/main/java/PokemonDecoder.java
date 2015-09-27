import java.util.ArrayList;
import java.util.List;

class PokemonDecoder {
    private static final int PARTY_POKEMON_LENGTH = 44;

    static List<Pokemon> decodePokemonPartyList(byte[] bytes) {
        final int numPokemon = bytes[0];
        final List<Pokemon> pokemon = new ArrayList<>(numPokemon);
        for (int i = 0; i < numPokemon; i++) {
            pokemon.add(decodePokemon(ByteUtil.getBytes(bytes, 1 + i * PARTY_POKEMON_LENGTH,
                    PARTY_POKEMON_LENGTH)));
        }
        return pokemon;
    }

    static Pokemon decodePokemon(byte[] bytes) {
        final PokemonBuilder pokemonBuilder = new PokemonBuilder();
        System.out.println(Integer.toHexString(Byte.toUnsignedInt(bytes[1])));
        System.out.println(Integer.toHexString(Byte.toUnsignedInt(bytes[2])));
        pokemonBuilder.setSpecies(bytes[0x0]);
        pokemonBuilder.setCurrentHp(getNumber(bytes, 0x1, 2));

        return pokemonBuilder.createPokemon();
    }

    private static int getNumber(byte[] bytes, int offset, int numBytes) {
        int num = 0;
        for (int i = 0; i < numBytes; i++) {
            num <<= 8;
            num += bytes[offset + i];
        }
        return num;
    }
}
