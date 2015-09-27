package poke.util;

import poke.data.Species;
import poke.data.xp.Fast;
import poke.data.xp.MediumFast;
import poke.data.xp.MediumSlow;
import poke.data.xp.Slow;
import poke.data.xp.XpType;

import java.util.HashMap;
import java.util.Map;

public class XpTypes {
    private static final Map<Species, XpType> mapping = new HashMap<>();

    static {
        mapping.put(Species.Bulbasaur, new MediumSlow());
        mapping.put(Species.Ivysaur, new MediumSlow());
        mapping.put(Species.Venusaur, new MediumSlow());
        mapping.put(Species.Charmander, new MediumSlow());
        mapping.put(Species.Charmeleon, new MediumSlow());
        mapping.put(Species.Charizard, new MediumSlow());
        mapping.put(Species.Squirtle, new MediumSlow());
        mapping.put(Species.Wartortle, new MediumSlow());
        mapping.put(Species.Blastoise, new MediumSlow());
        mapping.put(Species.Caterpie, new MediumFast());
        mapping.put(Species.Metapod, new MediumFast());
        mapping.put(Species.Butterfree, new MediumFast());
        mapping.put(Species.Weedle, new MediumFast());
        mapping.put(Species.Kakuna, new MediumFast());
        mapping.put(Species.Beedrill, new MediumFast());
        mapping.put(Species.Pidgey, new MediumSlow());
        mapping.put(Species.Pidgeotto, new MediumSlow());
        mapping.put(Species.Pidgeot, new MediumSlow());
        mapping.put(Species.Rattata, new MediumFast());
        mapping.put(Species.Raticate, new MediumFast());
        mapping.put(Species.Spearow, new MediumFast());
        mapping.put(Species.Fearow, new MediumFast());
        mapping.put(Species.Ekans, new MediumFast());
        mapping.put(Species.Arbok, new MediumFast());
        mapping.put(Species.Pikachu, new MediumFast());
        mapping.put(Species.Raichu, new MediumFast());
        mapping.put(Species.Sandshrew, new MediumFast());
        mapping.put(Species.Sandslash, new MediumFast());
        mapping.put(Species.NidoranFemale, new MediumSlow());
        mapping.put(Species.Nidorina, new MediumSlow());
        mapping.put(Species.Nidoqueen, new MediumSlow());
        mapping.put(Species.NidoranMale, new MediumSlow());
        mapping.put(Species.Nidorino, new MediumSlow());
        mapping.put(Species.Nidoking, new MediumSlow());
        mapping.put(Species.Clefairy, new Fast());
        mapping.put(Species.Clefable, new Fast());
        mapping.put(Species.Vulpix, new MediumFast());
        mapping.put(Species.Ninetales, new MediumFast());
        mapping.put(Species.Jigglypuff, new Fast());
        mapping.put(Species.Wigglytuff, new Fast());
        mapping.put(Species.Zubat, new MediumFast());
        mapping.put(Species.Golbat, new MediumFast());
        mapping.put(Species.Oddish, new MediumSlow());
        mapping.put(Species.Gloom, new MediumSlow());
        mapping.put(Species.Vileplume, new MediumSlow());
        mapping.put(Species.Paras, new MediumFast());
        mapping.put(Species.Parasect, new MediumFast());
        mapping.put(Species.Venonat, new MediumFast());
        mapping.put(Species.Venomoth, new MediumFast());
        mapping.put(Species.Diglett, new MediumFast());
        mapping.put(Species.Dugtrio, new MediumFast());
        mapping.put(Species.Meowth, new MediumFast());
        mapping.put(Species.Persian, new MediumFast());
        mapping.put(Species.Psyduck, new MediumFast());
        mapping.put(Species.Golduck, new MediumFast());
        mapping.put(Species.Mankey, new MediumFast());
        mapping.put(Species.Primeape, new MediumFast());
        mapping.put(Species.Growlithe, new Slow());
        mapping.put(Species.Arcanine, new Slow());
        mapping.put(Species.Poliwag, new MediumSlow());
        mapping.put(Species.Poliwhirl, new MediumSlow());
        mapping.put(Species.Poliwrath, new MediumSlow());
        mapping.put(Species.Abra, new MediumSlow());
        mapping.put(Species.Kadabra, new MediumSlow());
        mapping.put(Species.Alakazam, new MediumSlow());
        mapping.put(Species.Machop, new MediumSlow());
        mapping.put(Species.Machoke, new MediumSlow());
        mapping.put(Species.Machamp, new MediumSlow());
        mapping.put(Species.Bellsprout, new MediumSlow());
        mapping.put(Species.Weepinbell, new MediumSlow());
        mapping.put(Species.Victreebel, new MediumSlow());
        mapping.put(Species.Tentacool, new Slow());
        mapping.put(Species.Tentacruel, new Slow());
        mapping.put(Species.Geodude, new MediumSlow());
        mapping.put(Species.Graveler, new MediumSlow());
        mapping.put(Species.Golem, new MediumSlow());
        mapping.put(Species.Ponyta, new MediumFast());
        mapping.put(Species.Rapidash, new MediumFast());
        mapping.put(Species.Slowpoke, new MediumFast());
        mapping.put(Species.Slowbro, new MediumFast());
        mapping.put(Species.Magnemite, new MediumFast());
        mapping.put(Species.Magneton, new MediumFast());
        mapping.put(Species.Farfetchd, new MediumFast());
        mapping.put(Species.Doduo, new MediumFast());
        mapping.put(Species.Dodrio, new MediumFast());
        mapping.put(Species.Seel, new MediumFast());
        mapping.put(Species.Dewgong, new MediumFast());
        mapping.put(Species.Grimer, new MediumFast());
        mapping.put(Species.Muk, new MediumFast());
        mapping.put(Species.Shellder, new Slow());
        mapping.put(Species.Cloyster, new Slow());
        mapping.put(Species.Gastly, new MediumSlow());
        mapping.put(Species.Haunter, new MediumSlow());
        mapping.put(Species.Gengar, new MediumSlow());
        mapping.put(Species.Onix, new MediumFast());
        mapping.put(Species.Drowzee, new MediumFast());
        mapping.put(Species.Hypno, new MediumFast());
        mapping.put(Species.Krabby, new MediumFast());
        mapping.put(Species.Kingler, new MediumFast());
        mapping.put(Species.Voltorb, new MediumFast());
        mapping.put(Species.Electrode, new MediumFast());
        mapping.put(Species.Exeggcute, new Slow());
        mapping.put(Species.Exeggutor, new Slow());
        mapping.put(Species.Cubone, new MediumFast());
        mapping.put(Species.Marowak, new MediumFast());
        mapping.put(Species.Hitmonlee, new MediumFast());
        mapping.put(Species.Hitmonchan, new MediumFast());
        mapping.put(Species.Lickitung, new MediumFast());
        mapping.put(Species.Koffing, new MediumFast());
        mapping.put(Species.Weezing, new MediumFast());
        mapping.put(Species.Rhyhorn, new Slow());
        mapping.put(Species.Rhydon, new Slow());
        mapping.put(Species.Chansey, new Fast());
        mapping.put(Species.Tangela, new MediumFast());
        mapping.put(Species.Kangaskhan, new MediumFast());
        mapping.put(Species.Horsea, new MediumFast());
        mapping.put(Species.Seadra, new MediumFast());
        mapping.put(Species.Goldeen, new MediumFast());
        mapping.put(Species.Seaking, new MediumFast());
        mapping.put(Species.Staryu, new Slow());
        mapping.put(Species.Starmie, new Slow());
        mapping.put(Species.MrMime, new MediumFast());
        mapping.put(Species.Scyther, new MediumFast());
        mapping.put(Species.Jynx, new MediumFast());
        mapping.put(Species.Electabuzz, new MediumFast());
        mapping.put(Species.Magmar, new MediumFast());
        mapping.put(Species.Pinsir, new Slow());
        mapping.put(Species.Tauros, new Slow());
        mapping.put(Species.Magikarp, new Slow());
        mapping.put(Species.Gyarados, new Slow());
        mapping.put(Species.Lapras, new Slow());
        mapping.put(Species.Ditto, new MediumFast());
        mapping.put(Species.Eevee, new MediumFast());
        mapping.put(Species.Vaporeon, new MediumFast());
        mapping.put(Species.Jolteon, new MediumFast());
        mapping.put(Species.Flareon, new MediumFast());
        mapping.put(Species.Porygon, new MediumFast());
        mapping.put(Species.Omanyte, new MediumFast());
        mapping.put(Species.Omastar, new MediumFast());
        mapping.put(Species.Kabuto, new MediumFast());
        mapping.put(Species.Kabutops, new MediumFast());
        mapping.put(Species.Aerodactyl, new Slow());
        mapping.put(Species.Snorlax, new Slow());
        mapping.put(Species.Articuno, new Slow());
        mapping.put(Species.Zapdos, new Slow());
        mapping.put(Species.Moltres, new Slow());
        mapping.put(Species.Dratini, new Slow());
        mapping.put(Species.Dragonair, new Slow());
        mapping.put(Species.Dragonite, new Slow());
        mapping.put(Species.Mewtwo, new Slow());
        mapping.put(Species.Mew, new MediumSlow());
    }

    public static XpType getXpType(Species species) {
        final XpType xpType = mapping.get(species);
        if (xpType == null) {
            return new Slow();
        }
        return xpType;
    }
}