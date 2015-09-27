package poke.data.xp;


public class Fast implements XpType {

    @Override
    public int getLevel(int xp) {
        return (int) Math.cbrt((xp * 5.0) / 4.0);
    }
}
