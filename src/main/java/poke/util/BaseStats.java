package poke.util;

import poke.data.Species;
import poke.data.Stats;

import java.util.HashMap;
import java.util.Map;

public class BaseStats {
    private static final Map<Species, Stats> baseHp = new HashMap<>();

    static {
        baseHp.put(Species.Bulbasaur, new Stats(45, 49, 49, 45, 65));
        baseHp.put(Species.Ivysaur, new Stats(60, 62, 63, 60, 80));
        baseHp.put(Species.Venusaur, new Stats(80, 82, 83, 80, 100));
        baseHp.put(Species.Charmander, new Stats(39, 52, 43, 65, 50));
        baseHp.put(Species.Charmeleon, new Stats(58, 64, 58, 80, 65));
        baseHp.put(Species.Charizard, new Stats(78, 84, 78, 100, 85));
        baseHp.put(Species.Squirtle, new Stats(44, 48, 65, 43, 50));
        baseHp.put(Species.Wartortle, new Stats(59, 63, 80, 58, 65));
        baseHp.put(Species.Blastoise, new Stats(79, 83, 100, 78, 85));
        baseHp.put(Species.Caterpie, new Stats(45, 30, 35, 45, 20));
        baseHp.put(Species.Metapod, new Stats(50, 20, 55, 30, 25));
        baseHp.put(Species.Butterfree, new Stats(60, 45, 50, 70, 80));
        baseHp.put(Species.Weedle, new Stats(40, 35, 30, 50, 20));
        baseHp.put(Species.Kakuna, new Stats(45, 25, 50, 35, 25));
        baseHp.put(Species.Beedrill, new Stats(65, 80, 40, 75, 45));
        baseHp.put(Species.Pidgey, new Stats(40, 45, 40, 56, 35));
        baseHp.put(Species.Pidgeotto, new Stats(63, 60, 55, 71, 50));
        baseHp.put(Species.Pidgeot, new Stats(83, 80, 75, 91, 70));
        baseHp.put(Species.Rattata, new Stats(30, 56, 35, 72, 25));
        baseHp.put(Species.Raticate, new Stats(55, 81, 60, 97, 50));
        baseHp.put(Species.Spearow, new Stats(40, 60, 30, 70, 31));
        baseHp.put(Species.Fearow, new Stats(65, 90, 65, 100, 61));
        baseHp.put(Species.Ekans, new Stats(35, 60, 44, 55, 40));
        baseHp.put(Species.Arbok, new Stats(60, 85, 69, 80, 65));
        baseHp.put(Species.Pikachu, new Stats(35, 55, 30, 90, 50));
        baseHp.put(Species.Raichu, new Stats(60, 90, 55, 100, 90));
        baseHp.put(Species.Sandshrew, new Stats(50, 75, 85, 40, 30));
        baseHp.put(Species.Sandslash, new Stats(75, 100, 110, 65, 55));
        baseHp.put(Species.NidoranFemale, new Stats(55, 47, 52, 41, 40));
        baseHp.put(Species.Nidorina, new Stats(70, 62, 67, 56, 55));
        baseHp.put(Species.Nidoqueen, new Stats(90, 82, 87, 76, 75));
        baseHp.put(Species.NidoranMale, new Stats(46, 57, 40, 50, 40));
        baseHp.put(Species.Nidorino, new Stats(61, 72, 57, 65, 55));
        baseHp.put(Species.Nidoking, new Stats(81, 92, 77, 85, 75));
        baseHp.put(Species.Clefairy, new Stats(70, 45, 48, 35, 60));
        baseHp.put(Species.Clefable, new Stats(95, 70, 73, 60, 85));
        baseHp.put(Species.Vulpix, new Stats(38, 41, 40, 65, 65));
        baseHp.put(Species.Ninetales, new Stats(73, 76, 75, 100, 100));
        baseHp.put(Species.Jigglypuff, new Stats(115, 45, 20, 20, 25));
        baseHp.put(Species.Wigglytuff, new Stats(140, 70, 45, 45, 50));
        baseHp.put(Species.Zubat, new Stats(40, 45, 35, 55, 40));
        baseHp.put(Species.Golbat, new Stats(75, 80, 70, 90, 75));
        baseHp.put(Species.Oddish, new Stats(45, 50, 55, 30, 75));
        baseHp.put(Species.Gloom, new Stats(60, 65, 70, 40, 85));
        baseHp.put(Species.Vileplume, new Stats(75, 80, 85, 50, 100));
        baseHp.put(Species.Paras, new Stats(35, 70, 55, 25, 55));
        baseHp.put(Species.Parasect, new Stats(60, 95, 80, 30, 80));
        baseHp.put(Species.Venonat, new Stats(60, 55, 50, 45, 40));
        baseHp.put(Species.Venomoth, new Stats(70, 65, 60, 90, 90));
        baseHp.put(Species.Diglett, new Stats(10, 55, 25, 95, 45));
        baseHp.put(Species.Dugtrio, new Stats(35, 80, 50, 120, 70));
        baseHp.put(Species.Meowth, new Stats(40, 45, 35, 90, 40));
        baseHp.put(Species.Persian, new Stats(65, 70, 60, 115, 65));
        baseHp.put(Species.Psyduck, new Stats(50, 52, 48, 55, 50));
        baseHp.put(Species.Golduck, new Stats(80, 82, 78, 85, 80));
        baseHp.put(Species.Mankey, new Stats(40, 80, 35, 70, 35));
        baseHp.put(Species.Primeape, new Stats(65, 105, 60, 95, 60));
        baseHp.put(Species.Growlithe, new Stats(55, 70, 45, 60, 50));
        baseHp.put(Species.Arcanine, new Stats(90, 110, 80, 95, 80));
        baseHp.put(Species.Poliwag, new Stats(40, 50, 40, 90, 40));
        baseHp.put(Species.Poliwhirl, new Stats(65, 65, 65, 90, 50));
        baseHp.put(Species.Poliwrath, new Stats(90, 85, 95, 70, 70));
        baseHp.put(Species.Abra, new Stats(25, 20, 15, 90, 105));
        baseHp.put(Species.Kadabra, new Stats(40, 35, 30, 105, 120));
        baseHp.put(Species.Alakazam, new Stats(55, 50, 45, 120, 135));
        baseHp.put(Species.Machop, new Stats(70, 80, 50, 35, 35));
        baseHp.put(Species.Machoke, new Stats(80, 100, 70, 45, 50));
        baseHp.put(Species.Machamp, new Stats(90, 130, 80, 55, 65));
        baseHp.put(Species.Bellsprout, new Stats(50, 75, 35, 40, 70));
        baseHp.put(Species.Weepinbell, new Stats(65, 90, 50, 55, 85));
        baseHp.put(Species.Victreebel, new Stats(80, 105, 65, 70, 100));
        baseHp.put(Species.Tentacool, new Stats(40, 40, 35, 70, 100));
        baseHp.put(Species.Tentacruel, new Stats(80, 70, 65, 100, 120));
        baseHp.put(Species.Geodude, new Stats(40, 80, 100, 20, 30));
        baseHp.put(Species.Graveler, new Stats(55, 95, 115, 35, 45));
        baseHp.put(Species.Golem, new Stats(80, 110, 130, 45, 55));
        baseHp.put(Species.Ponyta, new Stats(50, 85, 55, 90, 65));
        baseHp.put(Species.Rapidash, new Stats(65, 100, 70, 105, 80));
        baseHp.put(Species.Slowpoke, new Stats(90, 65, 65, 15, 40));
        baseHp.put(Species.Slowbro, new Stats(95, 75, 110, 30, 80));
        baseHp.put(Species.Magnemite, new Stats(25, 35, 70, 45, 95));
        baseHp.put(Species.Magneton, new Stats(50, 60, 95, 70, 120));
        baseHp.put(Species.Farfetchd, new Stats(52, 65, 55, 60, 58));
        baseHp.put(Species.Doduo, new Stats(35, 85, 45, 75, 35));
        baseHp.put(Species.Dodrio, new Stats(60, 110, 70, 100, 60));
        baseHp.put(Species.Seel, new Stats(65, 45, 55, 45, 70));
        baseHp.put(Species.Dewgong, new Stats(90, 70, 80, 70, 95));
        baseHp.put(Species.Grimer, new Stats(80, 80, 50, 25, 40));
        baseHp.put(Species.Muk, new Stats(105, 105, 75, 50, 65));
        baseHp.put(Species.Shellder, new Stats(30, 65, 100, 40, 45));
        baseHp.put(Species.Cloyster, new Stats(50, 95, 180, 70, 85));
        baseHp.put(Species.Gastly, new Stats(30, 35, 30, 80, 100));
        baseHp.put(Species.Haunter, new Stats(45, 50, 45, 95, 115));
        baseHp.put(Species.Gengar, new Stats(60, 65, 60, 110, 130));
        baseHp.put(Species.Onix, new Stats(35, 45, 160, 70, 30));
        baseHp.put(Species.Drowzee, new Stats(60, 48, 45, 42, 90));
        baseHp.put(Species.Hypno, new Stats(85, 73, 70, 67, 115));
        baseHp.put(Species.Krabby, new Stats(30, 105, 90, 50, 25));
        baseHp.put(Species.Kingler, new Stats(55, 130, 115, 75, 50));
        baseHp.put(Species.Voltorb, new Stats(40, 30, 50, 100, 55));
        baseHp.put(Species.Electrode, new Stats(60, 50, 70, 140, 80));
        baseHp.put(Species.Exeggcute, new Stats(60, 40, 80, 40, 60));
        baseHp.put(Species.Exeggutor, new Stats(95, 95, 85, 55, 125));
        baseHp.put(Species.Cubone, new Stats(50, 50, 95, 35, 40));
        baseHp.put(Species.Marowak, new Stats(60, 80, 110, 45, 50));
        baseHp.put(Species.Hitmonlee, new Stats(50, 120, 53, 87, 35));
        baseHp.put(Species.Hitmonchan, new Stats(50, 105, 79, 76, 35));
        baseHp.put(Species.Lickitung, new Stats(90, 55, 75, 30, 60));
        baseHp.put(Species.Koffing, new Stats(40, 65, 95, 35, 60));
        baseHp.put(Species.Weezing, new Stats(65, 90, 120, 60, 85));
        baseHp.put(Species.Rhyhorn, new Stats(80, 85, 95, 25, 30));
        baseHp.put(Species.Rhydon, new Stats(105, 130, 120, 40, 45));
        baseHp.put(Species.Chansey, new Stats(250, 5, 5, 50, 105));
        baseHp.put(Species.Tangela, new Stats(65, 55, 115, 60, 100));
        baseHp.put(Species.Kangaskhan, new Stats(105, 95, 80, 90, 40));
        baseHp.put(Species.Horsea, new Stats(30, 40, 70, 60, 70));
        baseHp.put(Species.Seadra, new Stats(55, 65, 95, 85, 95));
        baseHp.put(Species.Goldeen, new Stats(45, 67, 60, 63, 50));
        baseHp.put(Species.Seaking, new Stats(80, 92, 65, 68, 80));
        baseHp.put(Species.Staryu, new Stats(30, 45, 55, 85, 70));
        baseHp.put(Species.Starmie, new Stats(60, 75, 85, 115, 100));
        baseHp.put(Species.MrMime, new Stats(40, 45, 65, 90, 100));
        baseHp.put(Species.Scyther, new Stats(70, 110, 80, 105, 55));
        baseHp.put(Species.Jynx, new Stats(65, 50, 35, 95, 95));
        baseHp.put(Species.Electabuzz, new Stats(65, 83, 57, 105, 85));
        baseHp.put(Species.Magmar, new Stats(65, 95, 57, 93, 85));
        baseHp.put(Species.Pinsir, new Stats(65, 125, 100, 85, 55));
        baseHp.put(Species.Tauros, new Stats(75, 100, 95, 110, 70));
        baseHp.put(Species.Magikarp, new Stats(20, 10, 55, 80, 20));
        baseHp.put(Species.Gyarados, new Stats(95, 125, 79, 81, 100));
        baseHp.put(Species.Lapras, new Stats(130, 85, 80, 60, 95));
        baseHp.put(Species.Ditto, new Stats(48, 48, 48, 48, 48));
        baseHp.put(Species.Eevee, new Stats(55, 55, 50, 55, 65));
        baseHp.put(Species.Vaporeon, new Stats(130, 65, 60, 65, 110));
        baseHp.put(Species.Jolteon, new Stats(65, 65, 60, 130, 110));
        baseHp.put(Species.Flareon, new Stats(65, 130, 60, 65, 110));
        baseHp.put(Species.Porygon, new Stats(65, 60, 70, 40, 75));
        baseHp.put(Species.Omanyte, new Stats(35, 40, 100, 35, 90));
        baseHp.put(Species.Omastar, new Stats(70, 60, 125, 55, 115));
        baseHp.put(Species.Kabuto, new Stats(30, 80, 90, 55, 45));
        baseHp.put(Species.Kabutops, new Stats(60, 115, 105, 80, 70));
        baseHp.put(Species.Aerodactyl, new Stats(80, 105, 65, 130, 60));
        baseHp.put(Species.Snorlax, new Stats(160, 110, 65, 30, 65));
        baseHp.put(Species.Articuno, new Stats(90, 85, 100, 85, 125));
        baseHp.put(Species.Zapdos, new Stats(90, 90, 85, 100, 125));
        baseHp.put(Species.Moltres, new Stats(90, 100, 90, 90, 125));
        baseHp.put(Species.Dratini, new Stats(41, 64, 45, 50, 50));
        baseHp.put(Species.Dragonair, new Stats(61, 84, 65, 70, 70));
        baseHp.put(Species.Dragonite, new Stats(91, 134, 95, 80, 100));
        baseHp.put(Species.Mewtwo, new Stats(106, 110, 90, 130, 154));
        baseHp.put(Species.Mew, new Stats(100, 100, 100, 100, 100));
    }

    public static Stats getBaseStats(Species species) {
        return baseHp.get(species);
    }
}
