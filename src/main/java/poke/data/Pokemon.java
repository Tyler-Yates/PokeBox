package poke.data;

public class Pokemon {
    final int species;
    final int currentHp;
    final StatusCondition statusCondition;
    final Type type1;
    final Type type2;
    final int catchRate;
    final Move move1;
    final Move move2;
    final Move move3;
    final Move move4;
    final int originalTrainerId;
    final int xp;
    final int hpEv;
    final int attackEv;
    final int defenseEv;
    final int speedEv;
    final int specialEv;
    final int iv;
    final int move1pp;
    final int move2pp;
    final int move3pp;
    final int move4pp;
    final int level;
    final int maxHp;
    final int attack;
    final int defense;
    final int speed;
    final int special;

    Pokemon(int species, int currentHp, StatusCondition statusCondition, Type type1, Type type2, int catchRate,
            Move move1, Move move2, Move move3, Move move4, int
            originalTrainerId, int xp, int hpEv, int attackEv, int defenseEv, int speedEv, int
            specialEv, int iv, int move1pp, int move2pp, int move3pp, int move4pp, int level, int
            maxHp, int attack, int defense, int speed, int special) {
        this.species = species;
        this.currentHp = currentHp;
        this.statusCondition = statusCondition;
        this.type1 = type1;
        this.type2 = type2;
        this.catchRate = catchRate;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
        this.originalTrainerId = originalTrainerId;
        this.xp = xp;
        this.hpEv = hpEv;
        this.attackEv = attackEv;
        this.defenseEv = defenseEv;
        this.speedEv = speedEv;
        this.specialEv = specialEv;
        this.iv = iv;
        this.move1pp = move1pp;
        this.move2pp = move2pp;
        this.move3pp = move3pp;
        this.move4pp = move4pp;
        this.level = level;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
    }

    public int getSpecies() {
        return species;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public StatusCondition getStatusCondition() {
        return statusCondition;
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public int getCatchRate() {
        return catchRate;
    }

    public Move getMove1() {
        return move1;
    }

    public Move getMove2() {
        return move2;
    }

    public Move getMove3() {
        return move3;
    }

    public Move getMove4() {
        return move4;
    }

    public int getOriginalTrainerId() {
        return originalTrainerId;
    }

    public int getXp() {
        return xp;
    }

    public int getHpEv() {
        return hpEv;
    }

    public int getAttackEv() {
        return attackEv;
    }

    public int getDefenseEv() {
        return defenseEv;
    }

    public int getSpeedEv() {
        return speedEv;
    }

    public int getSpecialEv() {
        return specialEv;
    }

    public int getIv() {
        return iv;
    }

    public int getMove1pp() {
        return move1pp;
    }

    public int getMove2pp() {
        return move2pp;
    }

    public int getMove3pp() {
        return move3pp;
    }

    public int getMove4pp() {
        return move4pp;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "species=" + species +
                ", currentHp=" + currentHp +
                ", statusCondition=" + statusCondition +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", catchRate=" + catchRate +
                ", move1=" + Move.getMoveName(move1) +
                ", move2=" + Move.getMoveName(move2) +
                ", move3=" + Move.getMoveName(move3) +
                ", move4=" + Move.getMoveName(move4) +
                ", originalTrainerId=" + originalTrainerId +
                ", xp=" + xp +
                ", hpEv=" + hpEv +
                ", attackEv=" + attackEv +
                ", defenseEv=" + defenseEv +
                ", speedEv=" + speedEv +
                ", specialEv=" + specialEv +
                ", iv=" + iv +
                ", move1pp=" + move1pp +
                ", move2pp=" + move2pp +
                ", move3pp=" + move3pp +
                ", move4pp=" + move4pp +
                ", level=" + level +
                ", maxHp=" + maxHp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", special=" + special +
                '}';
    }
}
