package poke.data;

public class Trainer {
    private final String name;
    private final int money;
    private final String rivalName;
    private final Badges badges;
    private final int id;
    private final int pikachuFriendship;
    private final int casinoCoins;
    private final String timePlayed;

    public Trainer(String name, int money, String rivalName, Badges badges, int id, int pikachuFriendship,
            int casinoCoins, String timePlayed) {
        this.name = name;
        this.money = money;
        this.rivalName = rivalName;
        this.badges = badges;
        this.id = id;
        this.pikachuFriendship = pikachuFriendship;
        this.casinoCoins = casinoCoins;
        this.timePlayed = timePlayed;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getRivalName() {
        return rivalName;
    }

    public Badges getBadges() {
        return badges;
    }

    public int getId() {
        return id;
    }

    public int getPikachuFriendship() {
        return pikachuFriendship;
    }

    public int getCasinoCoins() {
        return casinoCoins;
    }

    public String getTimePlayed() {
        return timePlayed;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", rivalName='" + rivalName + '\'' +
                ", badges=" + badges +
                ", id=" + id +
                ", pikachuFriendship=" + pikachuFriendship +
                ", casinoCoins=" + casinoCoins +
                ", timePlayed=" + timePlayed +
                '}';
    }
}
