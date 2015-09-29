package poke.data;

public class Pokemon {
    final Species species;
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
    final int attackIv;
    final int defenseIv;
    final int speedIv;
    final int specialIv;
    final int hpIv;
    final int currentMove1pp;
    final int currentMove2pp;
    final int currentMove3pp;
    final int currentMove4pp;
    final int move1ppUps;
    final int move2ppUps;
    final int move3ppUps;
    final int move4ppUps;
    final int level;
    final int maxHp;
    final int attack;
    final int defense;
    final int speed;
    final int special;
    final String originalTrainerName;
    final String nickname;

    Pokemon(Species species, int currentHp, StatusCondition statusCondition, Type type1, Type type2, int catchRate,
            Move move1, Move move2, Move move3, Move move4, int originalTrainerId, int xp, int hpEv, int attackEv,
            int defenseEv, int speedEv, int specialEv, int attackIv, int defenseIv, int speedIv, int specialIv,
            int hpIv, int currentMove1pp, int currentMove2pp, int currentMove3pp, int currentMove4pp, int move1ppUps,
            int move2ppUps, int move3ppUps, int move4ppUps, int level, int maxHp, int attack, int defense, int speed,
            int special, String originalTrainerName, String nickname) {
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
        this.attackIv = attackIv;
        this.defenseIv = defenseIv;
        this.speedIv = speedIv;
        this.specialIv = specialIv;
        this.hpIv = hpIv;
        this.currentMove1pp = currentMove1pp;
        this.currentMove2pp = currentMove2pp;
        this.currentMove3pp = currentMove3pp;
        this.currentMove4pp = currentMove4pp;
        this.move1ppUps = move1ppUps;
        this.move2ppUps = move2ppUps;
        this.move3ppUps = move3ppUps;
        this.move4ppUps = move4ppUps;
        this.level = level;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
        this.originalTrainerName = originalTrainerName;
        this.nickname = nickname;
    }

    public Species getSpecies() {
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

    public int getAttackIv() {
        return attackIv;
    }

    public int getDefenseIv() {
        return defenseIv;
    }

    public int getSpeedIv() {
        return speedIv;
    }

    public int getSpecialIv() {
        return specialIv;
    }

    public int getHpIv() {
        return hpIv;
    }

    public int getCurrentMove1pp() {
        return currentMove1pp;
    }

    public int getCurrentMove2pp() {
        return currentMove2pp;
    }

    public int getCurrentMove3pp() {
        return currentMove3pp;
    }

    public int getCurrentMove4pp() {
        return currentMove4pp;
    }

    public int getMove1ppUps() {
        return move1ppUps;
    }

    public int getMove2ppUps() {
        return move2ppUps;
    }

    public int getMove3ppUps() {
        return move3ppUps;
    }

    public int getMove4ppUps() {
        return move4ppUps;
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

    public String getOriginalTrainerName() {
        return originalTrainerName;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "species=" + Species.getName(species) +
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
                ", attackIv=" + attackIv +
                ", defenseIv=" + defenseIv +
                ", speedIv=" + speedIv +
                ", specialIv=" + specialIv +
                ", hpIv=" + hpIv +
                ", currentMove1pp=" + currentMove1pp +
                ", currentMove2pp=" + currentMove2pp +
                ", currentMove3pp=" + currentMove3pp +
                ", currentMove4pp=" + currentMove4pp +
                ", move1ppUps=" + move1ppUps +
                ", move2ppUps=" + move2ppUps +
                ", move3ppUps=" + move3ppUps +
                ", move4ppUps=" + move4ppUps +
                ", level=" + level +
                ", maxHp=" + maxHp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", special=" + special +
                ", originalTrainerName=" + originalTrainerName +
                ", nickname=" + nickname +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Pokemon pokemon = (Pokemon) o;

        if (currentHp != pokemon.currentHp) {
            return false;
        }
        if (catchRate != pokemon.catchRate) {
            return false;
        }
        if (originalTrainerId != pokemon.originalTrainerId) {
            return false;
        }
        if (xp != pokemon.xp) {
            return false;
        }
        if (hpEv != pokemon.hpEv) {
            return false;
        }
        if (attackEv != pokemon.attackEv) {
            return false;
        }
        if (defenseEv != pokemon.defenseEv) {
            return false;
        }
        if (speedEv != pokemon.speedEv) {
            return false;
        }
        if (specialEv != pokemon.specialEv) {
            return false;
        }
        if (attackIv != pokemon.attackIv) {
            return false;
        }
        if (defenseIv != pokemon.defenseIv) {
            return false;
        }
        if (speedIv != pokemon.speedIv) {
            return false;
        }
        if (specialIv != pokemon.specialIv) {
            return false;
        }
        if (hpIv != pokemon.hpIv) {
            return false;
        }
        if (currentMove1pp != pokemon.currentMove1pp) {
            return false;
        }
        if (currentMove2pp != pokemon.currentMove2pp) {
            return false;
        }
        if (currentMove3pp != pokemon.currentMove3pp) {
            return false;
        }
        if (currentMove4pp != pokemon.currentMove4pp) {
            return false;
        }
        if (move1ppUps != pokemon.move1ppUps) {
            return false;
        }
        if (move2ppUps != pokemon.move2ppUps) {
            return false;
        }
        if (move3ppUps != pokemon.move3ppUps) {
            return false;
        }
        if (move4ppUps != pokemon.move4ppUps) {
            return false;
        }
        if (level != pokemon.level) {
            return false;
        }
        if (maxHp != pokemon.maxHp) {
            return false;
        }
        if (attack != pokemon.attack) {
            return false;
        }
        if (defense != pokemon.defense) {
            return false;
        }
        if (speed != pokemon.speed) {
            return false;
        }
        if (special != pokemon.special) {
            return false;
        }
        if (species != pokemon.species) {
            return false;
        }
        if (statusCondition != pokemon.statusCondition) {
            return false;
        }
        if (type1 != pokemon.type1) {
            return false;
        }
        if (type2 != pokemon.type2) {
            return false;
        }
        if (move1 != pokemon.move1) {
            return false;
        }
        if (move2 != pokemon.move2) {
            return false;
        }
        if (move3 != pokemon.move3) {
            return false;
        }
        if (move4 != pokemon.move4) {
            return false;
        }
        if (originalTrainerName != null ? !originalTrainerName.equals(pokemon
                .originalTrainerName) : pokemon.originalTrainerName != null) {
            return false;
        }
        return !(nickname != null ? !nickname.equals(pokemon.nickname) : pokemon.nickname != null);

    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + currentHp;
        result = 31 * result + (statusCondition != null ? statusCondition.hashCode() : 0);
        result = 31 * result + (type1 != null ? type1.hashCode() : 0);
        result = 31 * result + (type2 != null ? type2.hashCode() : 0);
        result = 31 * result + catchRate;
        result = 31 * result + (move1 != null ? move1.hashCode() : 0);
        result = 31 * result + (move2 != null ? move2.hashCode() : 0);
        result = 31 * result + (move3 != null ? move3.hashCode() : 0);
        result = 31 * result + (move4 != null ? move4.hashCode() : 0);
        result = 31 * result + originalTrainerId;
        result = 31 * result + xp;
        result = 31 * result + hpEv;
        result = 31 * result + attackEv;
        result = 31 * result + defenseEv;
        result = 31 * result + speedEv;
        result = 31 * result + specialEv;
        result = 31 * result + attackIv;
        result = 31 * result + defenseIv;
        result = 31 * result + speedIv;
        result = 31 * result + specialIv;
        result = 31 * result + hpIv;
        result = 31 * result + currentMove1pp;
        result = 31 * result + currentMove2pp;
        result = 31 * result + currentMove3pp;
        result = 31 * result + currentMove4pp;
        result = 31 * result + move1ppUps;
        result = 31 * result + move2ppUps;
        result = 31 * result + move3ppUps;
        result = 31 * result + move4ppUps;
        result = 31 * result + level;
        result = 31 * result + maxHp;
        result = 31 * result + attack;
        result = 31 * result + defense;
        result = 31 * result + speed;
        result = 31 * result + special;
        result = 31 * result + (originalTrainerName != null ? originalTrainerName.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        return result;
    }
}
