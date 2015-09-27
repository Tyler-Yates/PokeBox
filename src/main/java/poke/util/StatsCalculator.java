package poke.util;

import poke.data.PokemonBuilder;
import poke.data.Stats;

public class StatsCalculator {

    public static void calculateAndSetStats(PokemonBuilder pokemonBuilder) {
        pokemonBuilder.setLevel(calculateLevel(pokemonBuilder));
        pokemonBuilder.setMaxHp(calculateMaxHp(pokemonBuilder));
        pokemonBuilder.setAttack(calculateAttack(pokemonBuilder));
        pokemonBuilder.setDefense(calculateDefense(pokemonBuilder));
        pokemonBuilder.setSpeed(calculateSpeed(pokemonBuilder));
        pokemonBuilder.setSpecial(calculateSpecial(pokemonBuilder));
    }

    private static int calculateLevel(PokemonBuilder builder) {
        final int xp = builder.getXp();
        return XpTypes.getXpType(builder.getSpecies()).getLevel(xp);
    }

    private static int calculateMaxHp(PokemonBuilder builder) {
        final Stats baseStats = BaseStats.getBaseStats(builder.getSpecies());
        return calculateHpStat(baseStats.getHp(), builder.getHpIv(), builder.getHpEv(), builder.getLevel());
    }

    private static int calculateAttack(PokemonBuilder builder) {
        final Stats baseStats = BaseStats.getBaseStats(builder.getSpecies());
        return calculateNonHpStat(baseStats.getAttack(), builder.getAttackIv(), builder.getAttackEv(),
                builder.getLevel());
    }

    private static int calculateDefense(PokemonBuilder builder) {
        final Stats baseStats = BaseStats.getBaseStats(builder.getSpecies());
        return calculateNonHpStat(baseStats.getDefense(), builder.getDefenseIv(), builder.getDefenseEv(),
                builder.getLevel());
    }

    private static int calculateSpeed(PokemonBuilder builder) {
        final Stats baseStats = BaseStats.getBaseStats(builder.getSpecies());
        return calculateNonHpStat(baseStats.getSpeed(), builder.getSpeedIv(), builder.getSpeedEv(), builder.getLevel());
    }

    private static int calculateSpecial(PokemonBuilder builder) {
        final Stats baseStats = BaseStats.getBaseStats(builder.getSpecies());
        return calculateNonHpStat(baseStats.getSpecial(), builder.getSpecialIv(), builder.getSpecialEv(),
                builder.getLevel());
    }

    private static int calculateHpStat(int base, int iv, int ev, int level) {
        return calculateFirstPart(base, iv, ev, level) + level + 10;
    }

    private static int calculateNonHpStat(int base, int iv, int ev, int level) {
        final int numerator = ((base + iv) * 2 + calculateEvPart(ev)) * level;
        return calculateFirstPart(base, iv, ev, level) + 5;
    }

    private static int calculateFirstPart(int base, int iv, int ev, int level) {
        final int numerator = ((base + iv) * 2 + calculateEvPart(ev)) * level;
        return (int) Math.floor(numerator / 100.0);
    }

    private static int calculateEvPart(int ev) {
        return (int) Math.floor(Math.ceil(Math.sqrt(ev)) / 4.0);
    }
}
