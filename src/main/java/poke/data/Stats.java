package poke.data;

public class Stats {
    private final int hp;
    private final int attack;
    private final int defense;
    private final int speed;
    private final int special;

    public Stats(int hp, int attack, int defense, int speed, int special) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
    }

    public int getHp() {
        return hp;
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
}
