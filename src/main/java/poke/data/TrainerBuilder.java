package poke.data;

public class TrainerBuilder {
    private String name;
    private int money;
    private String rivalName;
    private Badges badges;
    private int id;
    private int pikachuFriendship;
    private int casinoCoins;
    private String timePlayed;

    public TrainerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TrainerBuilder setMoney(int money) {
        this.money = money;
        return this;
    }

    public TrainerBuilder setRivalName(String rivalName) {
        this.rivalName = rivalName;
        return this;
    }

    public TrainerBuilder setBadges(Badges badges) {
        this.badges = badges;
        return this;
    }

    public TrainerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public TrainerBuilder setPikachuFriendship(int pikachuFriendship) {
        this.pikachuFriendship = pikachuFriendship;
        return this;
    }

    public TrainerBuilder setCasinoCoins(int casinoCoins) {
        this.casinoCoins = casinoCoins;
        return this;
    }

    public TrainerBuilder setTimePlayed(String timePlayed) {
        this.timePlayed = timePlayed;
        return this;
    }

    public Trainer createTrainer() {
        return new Trainer(name, money, rivalName, badges, id, pikachuFriendship, casinoCoins, timePlayed);
    }
}