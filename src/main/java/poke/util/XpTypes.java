package poke.util;

import poke.data.Species;
import poke.data.xp.XpType;

import java.util.HashMap;
import java.util.Map;

public class XpTypes {
    private static final Map<Species, XpType> mapping = new HashMap<>();

    static {
        mapping.put(Species.Bulbasaur, XpType.getMediumSlowXpType());
        mapping.put(Species.Ivysaur, XpType.getMediumSlowXpType());
        mapping.put(Species.Venusaur, XpType.getMediumSlowXpType());
        mapping.put(Species.Charmander, XpType.getMediumSlowXpType());
        mapping.put(Species.Charmeleon, XpType.getMediumSlowXpType());
        mapping.put(Species.Charizard, XpType.getMediumSlowXpType());
        mapping.put(Species.Squirtle, XpType.getMediumSlowXpType());
        mapping.put(Species.Wartortle, XpType.getMediumSlowXpType());
        mapping.put(Species.Blastoise, XpType.getMediumSlowXpType());
        mapping.put(Species.Caterpie, XpType.getMediumFastXpType());
        mapping.put(Species.Metapod, XpType.getMediumFastXpType());
        mapping.put(Species.Butterfree, XpType.getMediumFastXpType());
        mapping.put(Species.Weedle, XpType.getMediumFastXpType());
        mapping.put(Species.Kakuna, XpType.getMediumFastXpType());
        mapping.put(Species.Beedrill, XpType.getMediumFastXpType());
        mapping.put(Species.Pidgey, XpType.getMediumSlowXpType());
        mapping.put(Species.Pidgeotto, XpType.getMediumSlowXpType());
        mapping.put(Species.Pidgeot, XpType.getMediumSlowXpType());
        mapping.put(Species.Rattata, XpType.getMediumFastXpType());
        mapping.put(Species.Raticate, XpType.getMediumFastXpType());
        mapping.put(Species.Spearow, XpType.getMediumFastXpType());
        mapping.put(Species.Fearow, XpType.getMediumFastXpType());
        mapping.put(Species.Ekans, XpType.getMediumFastXpType());
        mapping.put(Species.Arbok, XpType.getMediumFastXpType());
        mapping.put(Species.Pikachu, XpType.getMediumFastXpType());
        mapping.put(Species.Raichu, XpType.getMediumFastXpType());
        mapping.put(Species.Sandshrew, XpType.getMediumFastXpType());
        mapping.put(Species.Sandslash, XpType.getMediumFastXpType());
        mapping.put(Species.NidoranFemale, XpType.getMediumSlowXpType());
        mapping.put(Species.Nidorina, XpType.getMediumSlowXpType());
        mapping.put(Species.Nidoqueen, XpType.getMediumSlowXpType());
        mapping.put(Species.NidoranMale, XpType.getMediumSlowXpType());
        mapping.put(Species.Nidorino, XpType.getMediumSlowXpType());
        mapping.put(Species.Nidoking, XpType.getMediumSlowXpType());
        mapping.put(Species.Clefairy, XpType.getFastXpType());
        mapping.put(Species.Clefable, XpType.getFastXpType());
        mapping.put(Species.Vulpix, XpType.getMediumFastXpType());
        mapping.put(Species.Ninetales, XpType.getMediumFastXpType());
        mapping.put(Species.Jigglypuff, XpType.getFastXpType());
        mapping.put(Species.Wigglytuff, XpType.getFastXpType());
        mapping.put(Species.Zubat, XpType.getMediumFastXpType());
        mapping.put(Species.Golbat, XpType.getMediumFastXpType());
        mapping.put(Species.Oddish, XpType.getMediumSlowXpType());
        mapping.put(Species.Gloom, XpType.getMediumSlowXpType());
        mapping.put(Species.Vileplume, XpType.getMediumSlowXpType());
        mapping.put(Species.Paras, XpType.getMediumFastXpType());
        mapping.put(Species.Parasect, XpType.getMediumFastXpType());
        mapping.put(Species.Venonat, XpType.getMediumFastXpType());
        mapping.put(Species.Venomoth, XpType.getMediumFastXpType());
        mapping.put(Species.Diglett, XpType.getMediumFastXpType());
        mapping.put(Species.Dugtrio, XpType.getMediumFastXpType());
        mapping.put(Species.Meowth, XpType.getMediumFastXpType());
        mapping.put(Species.Persian, XpType.getMediumFastXpType());
        mapping.put(Species.Psyduck, XpType.getMediumFastXpType());
        mapping.put(Species.Golduck, XpType.getMediumFastXpType());
        mapping.put(Species.Mankey, XpType.getMediumFastXpType());
        mapping.put(Species.Primeape, XpType.getMediumFastXpType());
        mapping.put(Species.Growlithe, XpType.getSlowXpType());
        mapping.put(Species.Arcanine, XpType.getSlowXpType());
        mapping.put(Species.Poliwag, XpType.getMediumSlowXpType());
        mapping.put(Species.Poliwhirl, XpType.getMediumSlowXpType());
        mapping.put(Species.Poliwrath, XpType.getMediumSlowXpType());
        mapping.put(Species.Abra, XpType.getMediumSlowXpType());
        mapping.put(Species.Kadabra, XpType.getMediumSlowXpType());
        mapping.put(Species.Alakazam, XpType.getMediumSlowXpType());
        mapping.put(Species.Machop, XpType.getMediumSlowXpType());
        mapping.put(Species.Machoke, XpType.getMediumSlowXpType());
        mapping.put(Species.Machamp, XpType.getMediumSlowXpType());
        mapping.put(Species.Bellsprout, XpType.getMediumSlowXpType());
        mapping.put(Species.Weepinbell, XpType.getMediumSlowXpType());
        mapping.put(Species.Victreebel, XpType.getMediumSlowXpType());
        mapping.put(Species.Tentacool, XpType.getSlowXpType());
        mapping.put(Species.Tentacruel, XpType.getSlowXpType());
        mapping.put(Species.Geodude, XpType.getMediumSlowXpType());
        mapping.put(Species.Graveler, XpType.getMediumSlowXpType());
        mapping.put(Species.Golem, XpType.getMediumSlowXpType());
        mapping.put(Species.Ponyta, XpType.getMediumFastXpType());
        mapping.put(Species.Rapidash, XpType.getMediumFastXpType());
        mapping.put(Species.Slowpoke, XpType.getMediumFastXpType());
        mapping.put(Species.Slowbro, XpType.getMediumFastXpType());
        mapping.put(Species.Magnemite, XpType.getMediumFastXpType());
        mapping.put(Species.Magneton, XpType.getMediumFastXpType());
        mapping.put(Species.Farfetchd, XpType.getMediumFastXpType());
        mapping.put(Species.Doduo, XpType.getMediumFastXpType());
        mapping.put(Species.Dodrio, XpType.getMediumFastXpType());
        mapping.put(Species.Seel, XpType.getMediumFastXpType());
        mapping.put(Species.Dewgong, XpType.getMediumFastXpType());
        mapping.put(Species.Grimer, XpType.getMediumFastXpType());
        mapping.put(Species.Muk, XpType.getMediumFastXpType());
        mapping.put(Species.Shellder, XpType.getSlowXpType());
        mapping.put(Species.Cloyster, XpType.getSlowXpType());
        mapping.put(Species.Gastly, XpType.getMediumSlowXpType());
        mapping.put(Species.Haunter, XpType.getMediumSlowXpType());
        mapping.put(Species.Gengar, XpType.getMediumSlowXpType());
        mapping.put(Species.Onix, XpType.getMediumFastXpType());
        mapping.put(Species.Drowzee, XpType.getMediumFastXpType());
        mapping.put(Species.Hypno, XpType.getMediumFastXpType());
        mapping.put(Species.Krabby, XpType.getMediumFastXpType());
        mapping.put(Species.Kingler, XpType.getMediumFastXpType());
        mapping.put(Species.Voltorb, XpType.getMediumFastXpType());
        mapping.put(Species.Electrode, XpType.getMediumFastXpType());
        mapping.put(Species.Exeggcute, XpType.getSlowXpType());
        mapping.put(Species.Exeggutor, XpType.getSlowXpType());
        mapping.put(Species.Cubone, XpType.getMediumFastXpType());
        mapping.put(Species.Marowak, XpType.getMediumFastXpType());
        mapping.put(Species.Hitmonlee, XpType.getMediumFastXpType());
        mapping.put(Species.Hitmonchan, XpType.getMediumFastXpType());
        mapping.put(Species.Lickitung, XpType.getMediumFastXpType());
        mapping.put(Species.Koffing, XpType.getMediumFastXpType());
        mapping.put(Species.Weezing, XpType.getMediumFastXpType());
        mapping.put(Species.Rhyhorn, XpType.getSlowXpType());
        mapping.put(Species.Rhydon, XpType.getSlowXpType());
        mapping.put(Species.Chansey, XpType.getFastXpType());
        mapping.put(Species.Tangela, XpType.getMediumFastXpType());
        mapping.put(Species.Kangaskhan, XpType.getMediumFastXpType());
        mapping.put(Species.Horsea, XpType.getMediumFastXpType());
        mapping.put(Species.Seadra, XpType.getMediumFastXpType());
        mapping.put(Species.Goldeen, XpType.getMediumFastXpType());
        mapping.put(Species.Seaking, XpType.getMediumFastXpType());
        mapping.put(Species.Staryu, XpType.getSlowXpType());
        mapping.put(Species.Starmie, XpType.getSlowXpType());
        mapping.put(Species.MrMime, XpType.getMediumFastXpType());
        mapping.put(Species.Scyther, XpType.getMediumFastXpType());
        mapping.put(Species.Jynx, XpType.getMediumFastXpType());
        mapping.put(Species.Electabuzz, XpType.getMediumFastXpType());
        mapping.put(Species.Magmar, XpType.getMediumFastXpType());
        mapping.put(Species.Pinsir, XpType.getSlowXpType());
        mapping.put(Species.Tauros, XpType.getSlowXpType());
        mapping.put(Species.Magikarp, XpType.getSlowXpType());
        mapping.put(Species.Gyarados, XpType.getSlowXpType());
        mapping.put(Species.Lapras, XpType.getSlowXpType());
        mapping.put(Species.Ditto, XpType.getMediumFastXpType());
        mapping.put(Species.Eevee, XpType.getMediumFastXpType());
        mapping.put(Species.Vaporeon, XpType.getMediumFastXpType());
        mapping.put(Species.Jolteon, XpType.getMediumFastXpType());
        mapping.put(Species.Flareon, XpType.getMediumFastXpType());
        mapping.put(Species.Porygon, XpType.getMediumFastXpType());
        mapping.put(Species.Omanyte, XpType.getMediumFastXpType());
        mapping.put(Species.Omastar, XpType.getMediumFastXpType());
        mapping.put(Species.Kabuto, XpType.getMediumFastXpType());
        mapping.put(Species.Kabutops, XpType.getMediumFastXpType());
        mapping.put(Species.Aerodactyl, XpType.getSlowXpType());
        mapping.put(Species.Snorlax, XpType.getSlowXpType());
        mapping.put(Species.Articuno, XpType.getSlowXpType());
        mapping.put(Species.Zapdos, XpType.getSlowXpType());
        mapping.put(Species.Moltres, XpType.getSlowXpType());
        mapping.put(Species.Dratini, XpType.getSlowXpType());
        mapping.put(Species.Dragonair, XpType.getSlowXpType());
        mapping.put(Species.Dragonite, XpType.getSlowXpType());
        mapping.put(Species.Mewtwo, XpType.getSlowXpType());
        mapping.put(Species.Mew, XpType.getMediumSlowXpType());
    }

    public static XpType getXpType(Species species) {
        final XpType xpType = mapping.get(species);
        if (xpType == null) {
            return XpType.getSlowXpType();
        }
        return xpType;
    }
}
