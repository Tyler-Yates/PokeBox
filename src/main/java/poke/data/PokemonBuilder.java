package poke.data;

public class PokemonBuilder {
    private int species;
    private int currentHp;
    private StatusCondition statusCondition;
    private Type type1;
    private Type type2;
    private int catchRate;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;
    private int originalTrainerId;
    private int xp;
    private int hpEv;
    private int attackEv;
    private int defenseEv;
    private int speedEv;
    private int specialEv;
    private int attackIv;
    private int defenseIv;
    private int speedIv;
    private int specialIv;
    private int hpIv;
    private int move1pp;
    private int move2pp;
    private int move3pp;
    private int move4pp;
    private int level;
    private int maxHp;
    private int attack;
    private int defense;
    private int speed;
    private int special;

    public PokemonBuilder setSpecies(int species) {
        this.species = species;
        return this;
    }

    public PokemonBuilder setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        return this;
    }

    public PokemonBuilder setStatusCondition(StatusCondition statusCondition) {
        this.statusCondition = statusCondition;
        return this;
    }

    public PokemonBuilder setType1(Type type1) {
        this.type1 = type1;
        return this;
    }

    public PokemonBuilder setType2(Type type2) {
        this.type2 = type2;
        return this;
    }

    public PokemonBuilder setCatchRate(int catchRate) {
        this.catchRate = catchRate;
        return this;
    }

    public PokemonBuilder setMove1(Move move1) {
        this.move1 = move1;
        return this;
    }

    public PokemonBuilder setMove2(Move move2) {
        this.move2 = move2;
        return this;
    }

    public PokemonBuilder setMove3(Move move3) {
        this.move3 = move3;
        return this;
    }

    public PokemonBuilder setMove4(Move move4) {
        this.move4 = move4;
        return this;
    }

    public PokemonBuilder setOriginalTrainerId(int originalTrainerId) {
        this.originalTrainerId = originalTrainerId;
        return this;
    }

    public PokemonBuilder setXp(int xp) {
        this.xp = xp;
        return this;
    }

    public PokemonBuilder setHpEv(int hpEv) {
        this.hpEv = hpEv;
        return this;
    }

    public PokemonBuilder setAttackEv(int attackEv) {
        this.attackEv = attackEv;
        return this;
    }

    public PokemonBuilder setDefenseEv(int defenseEv) {
        this.defenseEv = defenseEv;
        return this;
    }

    public PokemonBuilder setSpeedEv(int speedEv) {
        this.speedEv = speedEv;
        return this;
    }

    public PokemonBuilder setSpecialEv(int specialEv) {
        this.specialEv = specialEv;
        return this;
    }

    public PokemonBuilder setAttackIv(int attackIv) {
        this.attackIv = attackIv;
        return this;
    }

    public PokemonBuilder setDefenseIv(int defenseIv) {
        this.defenseIv = defenseIv;
        return this;
    }

    public PokemonBuilder setSpeedIv(int speedIv) {
        this.speedIv = speedIv;
        return this;
    }

    public PokemonBuilder setSpecialIv(int specialIv) {
        this.specialIv = specialIv;
        return this;
    }

    public PokemonBuilder setHpIv(int hpIv) {
        this.hpIv = hpIv;
        return this;
    }

    public PokemonBuilder setMove1pp(int move1pp) {
        this.move1pp = move1pp;
        return this;
    }

    public PokemonBuilder setMove2pp(int move2pp) {
        this.move2pp = move2pp;
        return this;
    }

    public PokemonBuilder setMove3pp(int move3pp) {
        this.move3pp = move3pp;
        return this;
    }

    public PokemonBuilder setMove4pp(int move4pp) {
        this.move4pp = move4pp;
        return this;
    }

    public PokemonBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public PokemonBuilder setMaxHp(int maxHp) {
        this.maxHp = maxHp;
        return this;
    }

    public PokemonBuilder setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public PokemonBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    public PokemonBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public PokemonBuilder setSpecial(int special) {
        this.special = special;
        return this;
    }

    public Pokemon createPokemon() {
        return new Pokemon(species, currentHp, statusCondition, type1, type2, catchRate, move1, move2, move3, move4,
                originalTrainerId, xp, hpEv, attackEv, defenseEv, speedEv, specialEv, attackIv, defenseIv, speedIv,
                specialIv, hpIv, move1pp, move2pp, move3pp, move4pp, level, maxHp, attack, defense, speed, special);
    }
}