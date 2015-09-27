package poke.data.xp;

public class MediumFast implements XpType {

    @Override
    public int getLevel(int xp) {
        return (int) Math.cbrt(xp);
    }
}
