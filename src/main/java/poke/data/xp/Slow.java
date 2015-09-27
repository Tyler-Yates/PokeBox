package poke.data.xp;

public class Slow implements XpType {

    @Override
    public int getLevel(int xp) {
        return (int) Math.cbrt((xp * 4.0) / 5.0);
    }
}
