package poke.decode;

import poke.data.Move;
import poke.data.Pokemon;
import poke.data.PokemonBuilder;
import poke.data.Species;
import poke.data.StatusCondition;
import poke.data.Type;
import poke.util.ByteUtil;
import poke.util.StatsCalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PokemonDecoder {
    private static final int PARTY_POKEMON_LENGTH = 44;
    private static final int BOX_POKEMON_LENGTH = 33;
    private static final int MAX_BOX_SLOTS = 20;
    private static final int NAME_LENGTH = 11;

    static List<Pokemon> decodePokemonPartyList(byte[] bytes) {
        final int numPokemon = bytes[0];
        final List<Pokemon> pokemon = new ArrayList<>(numPokemon);
        final int capacity = 6;
        for (int i = 0; i < numPokemon; i++) {
            final PokemonBuilder pokemonBuilder = decodePartyPokemon(
                    ByteUtil.getBytes(bytes, capacity + 2 + i * PARTY_POKEMON_LENGTH, PARTY_POKEMON_LENGTH));

            final int trainerNameOffset = 1 + (capacity + 1) + capacity * PARTY_POKEMON_LENGTH + i * NAME_LENGTH;
            pokemonBuilder.setOriginalTrainerName(
                    CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, trainerNameOffset, NAME_LENGTH)));
            final int nicknameOffset = 1 + (capacity + 1) + capacity * PARTY_POKEMON_LENGTH + capacity * NAME_LENGTH
                    + i * NAME_LENGTH;
            pokemonBuilder.setNickname(
                    CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, nicknameOffset, NAME_LENGTH)));

            pokemon.add(pokemonBuilder.createPokemon());
        }
        return pokemon;
    }

    static List<Pokemon> decodeBoxPokemonList(byte[] bytes) {
        final int numPokemon = bytes[0];
        if (numPokemon < 0 || numPokemon > MAX_BOX_SLOTS) {
            return Collections.emptyList();
        }

        final List<Pokemon> pokemon = new ArrayList<>(numPokemon);
        final int capacity = 20;
        for (int i = 0; i < numPokemon; i++) {
            final PokemonBuilder pokemonBuilder = decodeBoxPokemon(
                    ByteUtil.getBytes(bytes, capacity + 2 + i * BOX_POKEMON_LENGTH, BOX_POKEMON_LENGTH));

            final int trainerNameOffset = 1 + (capacity + 1) + capacity * BOX_POKEMON_LENGTH + i * NAME_LENGTH;
            pokemonBuilder.setOriginalTrainerName(
                    CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, trainerNameOffset, NAME_LENGTH)));
            final int nicknameOffset = 1 + (capacity + 1) + capacity * BOX_POKEMON_LENGTH + capacity * NAME_LENGTH +
                    i * NAME_LENGTH;
            pokemonBuilder.setNickname(
                    CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, nicknameOffset, NAME_LENGTH)));

            pokemon.add(pokemonBuilder.createPokemon());
        }
        return pokemon;
    }

    static PokemonBuilder decodeBoxPokemon(byte[] bytes) {
        final PokemonBuilder builder = new PokemonBuilder();
        decodeBasicInformation(bytes, builder);
        StatsCalculator.calculateAndSetStats(builder);
        return builder;
    }

    static PokemonBuilder decodePartyPokemon(byte[] bytes) {
        final PokemonBuilder pokemonBuilder = new PokemonBuilder();
        decodeBasicInformation(bytes, pokemonBuilder);
        pokemonBuilder.setLevel(Byte.toUnsignedInt(bytes[0x21]));
        pokemonBuilder.setMaxHp(ByteUtil.getNumber(bytes, 0x22, 2));
        pokemonBuilder.setAttack(ByteUtil.getNumber(bytes, 0x24, 2));
        pokemonBuilder.setDefense(ByteUtil.getNumber(bytes, 0x26, 2));
        pokemonBuilder.setSpeed(ByteUtil.getNumber(bytes, 0x28, 2));
        pokemonBuilder.setSpecial(ByteUtil.getNumber(bytes, 0x2A, 2));
        return pokemonBuilder;
    }

    private static PokemonBuilder decodeBasicInformation(byte[] bytes, PokemonBuilder pokemonBuilder) {
        pokemonBuilder.setSpecies(Species.getSpecies(Byte.toUnsignedInt(bytes[0x00])));
        pokemonBuilder.setCurrentHp(ByteUtil.getNumber(bytes, 0x01, 2));
        pokemonBuilder.setStatusCondition(StatusCondition.getStatusCondition(bytes[0x04]));
        pokemonBuilder.setType1(Type.getType(bytes[0x05]));
        pokemonBuilder.setType2(Type.getType(bytes[0x06]));
        pokemonBuilder.setCatchRate(Byte.toUnsignedInt(bytes[0x07]));
        pokemonBuilder.setMove1(Move.getMove(Byte.toUnsignedInt(bytes[0x08])));
        pokemonBuilder.setMove2(Move.getMove(Byte.toUnsignedInt(bytes[0x09])));
        pokemonBuilder.setMove3(Move.getMove(Byte.toUnsignedInt(bytes[0x0A])));
        pokemonBuilder.setMove4(Move.getMove(Byte.toUnsignedInt(bytes[0x0B])));
        pokemonBuilder.setOriginalTrainerId(ByteUtil.getNumber(bytes, 0x0C, 2));
        pokemonBuilder.setXp(ByteUtil.getNumber(bytes, 0x0E, 3));
        pokemonBuilder.setHpEv(ByteUtil.getNumber(bytes, 0x11, 2));
        pokemonBuilder.setAttackEv(ByteUtil.getNumber(bytes, 0x13, 2));
        pokemonBuilder.setDefenseEv(ByteUtil.getNumber(bytes, 0x15, 2));
        pokemonBuilder.setSpeedEv(ByteUtil.getNumber(bytes, 0x17, 2));
        pokemonBuilder.setSpecialEv(ByteUtil.getNumber(bytes, 0x19, 2));
        final int iv = ByteUtil.getNumber(bytes, 0x1B, 2);
        pokemonBuilder.setAttackIv(IvDecoder.getAttackIv(iv));
        pokemonBuilder.setDefenseIv(IvDecoder.getDefenseIv(iv));
        pokemonBuilder.setSpeedIv(IvDecoder.getSpeedIv(iv));
        pokemonBuilder.setSpecialIv(IvDecoder.getSpecialIv(iv));
        pokemonBuilder.setHpIv(IvDecoder.getHpIv(iv));
        pokemonBuilder.setMove1ppUps(PpDecoder.numberOfPpUps(bytes[0x1D]));
        pokemonBuilder.setCurrentMove1pp(PpDecoder.currentPp(bytes[0x1D]));
        pokemonBuilder.setMove2ppUps(PpDecoder.numberOfPpUps(bytes[0x1E]));
        pokemonBuilder.setCurrentMove2pp(PpDecoder.currentPp(bytes[0x1E]));
        pokemonBuilder.setMove3ppUps(PpDecoder.numberOfPpUps(bytes[0x1F]));
        pokemonBuilder.setCurrentMove3pp(PpDecoder.currentPp(bytes[0x1F]));
        pokemonBuilder.setMove4ppUps(PpDecoder.numberOfPpUps(bytes[0x20]));
        pokemonBuilder.setCurrentMove4pp(PpDecoder.currentPp(bytes[0x20]));
        return pokemonBuilder;
    }
}
