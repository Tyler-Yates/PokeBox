package poke.data;

public class PokemonBuilder {
    private Species species;
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
    private int currentMove1pp;
    private int currentMove2pp;
    private int currentMove3pp;
    private int currentMove4pp;
    private int move1ppUps;
    private int move2ppUps;
    private int move3ppUps;
    private int move4ppUps;
    private int level;
    private int maxHp;
    private int attack;
    private int defense;
    private int speed;
    private int special;
    private String originalTrainerName;
    private String nickname;

    public PokemonBuilder setSpecies(Species species) {
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

    public PokemonBuilder setCurrentMove1pp(int currentMove1pp) {
        this.currentMove1pp = currentMove1pp;
        return this;
    }

    public PokemonBuilder setCurrentMove2pp(int currentMove2pp) {
        this.currentMove2pp = currentMove2pp;
        return this;
    }

    public PokemonBuilder setCurrentMove3pp(int currentMove3pp) {
        this.currentMove3pp = currentMove3pp;
        return this;
    }

    public PokemonBuilder setCurrentMove4pp(int currentMove4pp) {
        this.currentMove4pp = currentMove4pp;
        return this;
    }

    public PokemonBuilder setMove1ppUps(int move1ppUps) {
        this.move1ppUps = move1ppUps;
        return this;
    }

    public PokemonBuilder setMove2ppUps(int move2ppUps) {
        this.move2ppUps = move2ppUps;
        return this;
    }

    public PokemonBuilder setMove3ppUps(int move3ppUps) {
        this.move3ppUps = move3ppUps;
        return this;
    }

    public PokemonBuilder setMove4ppUps(int move4ppUps) {
        this.move4ppUps = move4ppUps;
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

    public PokemonBuilder setOriginalTrainerName(String originalTrainerName) {
        this.originalTrainerName = originalTrainerName;
        return this;
    }

    public PokemonBuilder setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Pokemon createPokemon() {
        return new Pokemon(species, currentHp, statusCondition, type1, type2, catchRate, move1, move2, move3, move4,
                originalTrainerId, xp, hpEv, attackEv, defenseEv, speedEv, specialEv, attackIv, defenseIv, speedIv,
                specialIv, hpIv, currentMove1pp, currentMove2pp, currentMove3pp, currentMove4pp, move1ppUps, move2ppUps,
                move3ppUps, move4ppUps, level, maxHp, attack, defense, speed, special, originalTrainerName, nickname);
    }
}