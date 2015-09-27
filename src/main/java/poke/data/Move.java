package poke.data;

import java.util.HashMap;
import java.util.Map;

public enum Move {
    Pound, KarateChop, DoubleSlap, CometPunch, MegaPunch, PayDay, FirePunch, IcePunch, ThunderPunch, Scratch,
    ViceGrip, Guillotine, RazorWind, SwordsDance, Cut, Gust, WingAttack, Whirlwind, Fly, Bind, Slam, VineWhip, Stomp,
    DoubleKick, MegaKick, JumpKick, RollingKick, SandAttack, Headbutt, HornAttack, FuryAttack, HornDrill, Tackle,
    BodySlam, Wrap, TakeDown, Thrash, DoubleEdge, TailWhip, PoisonSting, Twineedle, PinMissile, Leer, Bite, Growl,
    Roar, Sing, Supersonic, SonicBoom, Disable, Acid, Ember, Flamethrower, Mist, WaterGun, HydroPump, Surf, IceBeam,
    Blizzard, Psybeam, BubbleBeam, AuroraBeam, HyperBeam, Peck, DrillPeck, Submission, LowKick, Counter, SeismicToss,
    Strength, Absorb, MegaDrain, LeechSeed, Growth, RazorLeaf, SolarBeam, PoisonPowder, StunSpore, SleepPowder,
    PetalDance, StringShot, DragonRage, FireSpin, ThunderShock, Thunderbolt, ThunderWave, Thunder, RockThrow,
    Earthquake, Fissure, Dig, Toxic, Confusion, Psychic, Hypnosis, Meditate, Agility, QuickAttack, Rage, Teleport,
    NightShade, Mimic, Screech, DoubleTeam, Recover, Harden, Minimize, Smokescreen, ConfuseRay, Withdraw,
    DefenseCurl, Barrier, LightScreen, Haze, Reflect, FocusEnergy, Bide, Metronome, MirrorMove, SelfDestruct,
    EggBomb, Lick, Smog, Sludge, BoneClub, FireBlast, Waterfall, Clamp, Swift, SkullBash, SpikeCannon, Constrict,
    Amnesia, Kinesis, SoftBoiled, HighJumpKick, Glare, DreamEater, PoisonGas, Barrage, LeechLife, LovelyKiss,
    SkyAttack, Transform, Bubble, DizzyPunch, Spore, Flash, Psywave, Splash, AcidArmor, Crabhammer, Explosion,
    FurySwipes, Bonemerang, Rest, RockSlide, HyperFang, Sharpen, Conversion, TriAttack, SuperFang, Slash, Substitute,
    Struggle;

    private static final Map<Integer, Move> mapping = new HashMap<>();

    static {
        mapping.put(1, Pound);
        mapping.put(2, KarateChop);
        mapping.put(3, DoubleSlap);
        mapping.put(4, CometPunch);
        mapping.put(5, MegaPunch);
        mapping.put(6, PayDay);
        mapping.put(7, FirePunch);
        mapping.put(8, IcePunch);
        mapping.put(9, ThunderPunch);
        mapping.put(10, Scratch);
        mapping.put(11, ViceGrip);
        mapping.put(12, Guillotine);
        mapping.put(13, RazorWind);
        mapping.put(14, SwordsDance);
        mapping.put(15, Cut);
        mapping.put(16, Gust);
        mapping.put(17, WingAttack);
        mapping.put(18, Whirlwind);
        mapping.put(19, Fly);
        mapping.put(20, Bind);
        mapping.put(21, Slam);
        mapping.put(22, VineWhip);
        mapping.put(23, Stomp);
        mapping.put(24, DoubleKick);
        mapping.put(25, MegaKick);
        mapping.put(26, JumpKick);
        mapping.put(27, RollingKick);
        mapping.put(28, SandAttack);
        mapping.put(29, Headbutt);
        mapping.put(30, HornAttack);
        mapping.put(31, FuryAttack);
        mapping.put(32, HornDrill);
        mapping.put(33, Tackle);
        mapping.put(34, BodySlam);
        mapping.put(35, Wrap);
        mapping.put(36, TakeDown);
        mapping.put(37, Thrash);
        mapping.put(38, DoubleEdge);
        mapping.put(39, TailWhip);
        mapping.put(40, PoisonSting);
        mapping.put(41, Twineedle);
        mapping.put(42, PinMissile);
        mapping.put(43, Leer);
        mapping.put(44, Bite);
        mapping.put(45, Growl);
        mapping.put(46, Roar);
        mapping.put(47, Sing);
        mapping.put(48, Supersonic);
        mapping.put(49, SonicBoom);
        mapping.put(50, Disable);
        mapping.put(51, Acid);
        mapping.put(52, Ember);
        mapping.put(53, Flamethrower);
        mapping.put(54, Mist);
        mapping.put(55, WaterGun);
        mapping.put(56, HydroPump);
        mapping.put(57, Surf);
        mapping.put(58, IceBeam);
        mapping.put(59, Blizzard);
        mapping.put(60, Psybeam);
        mapping.put(61, BubbleBeam);
        mapping.put(62, AuroraBeam);
        mapping.put(63, HyperBeam);
        mapping.put(64, Peck);
        mapping.put(65, DrillPeck);
        mapping.put(66, Submission);
        mapping.put(67, LowKick);
        mapping.put(68, Counter);
        mapping.put(69, SeismicToss);
        mapping.put(70, Strength);
        mapping.put(71, Absorb);
        mapping.put(72, MegaDrain);
        mapping.put(73, LeechSeed);
        mapping.put(74, Growth);
        mapping.put(75, RazorLeaf);
        mapping.put(76, SolarBeam);
        mapping.put(77, PoisonPowder);
        mapping.put(78, StunSpore);
        mapping.put(79, SleepPowder);
        mapping.put(80, PetalDance);
        mapping.put(81, StringShot);
        mapping.put(82, DragonRage);
        mapping.put(83, FireSpin);
        mapping.put(84, ThunderShock);
        mapping.put(85, Thunderbolt);
        mapping.put(86, ThunderWave);
        mapping.put(87, Thunder);
        mapping.put(88, RockThrow);
        mapping.put(89, Earthquake);
        mapping.put(90, Fissure);
        mapping.put(91, Dig);
        mapping.put(92, Toxic);
        mapping.put(93, Confusion);
        mapping.put(94, Psychic);
        mapping.put(95, Hypnosis);
        mapping.put(96, Meditate);
        mapping.put(97, Agility);
        mapping.put(98, QuickAttack);
        mapping.put(99, Rage);
        mapping.put(100, Teleport);
        mapping.put(101, NightShade);
        mapping.put(102, Mimic);
        mapping.put(103, Screech);
        mapping.put(104, DoubleTeam);
        mapping.put(105, Recover);
        mapping.put(106, Harden);
        mapping.put(107, Minimize);
        mapping.put(108, Smokescreen);
        mapping.put(109, ConfuseRay);
        mapping.put(110, Withdraw);
        mapping.put(111, DefenseCurl);
        mapping.put(112, Barrier);
        mapping.put(113, LightScreen);
        mapping.put(114, Haze);
        mapping.put(115, Reflect);
        mapping.put(116, FocusEnergy);
        mapping.put(117, Bide);
        mapping.put(118, Metronome);
        mapping.put(119, MirrorMove);
        mapping.put(120, SelfDestruct);
        mapping.put(121, EggBomb);
        mapping.put(122, Lick);
        mapping.put(123, Smog);
        mapping.put(124, Sludge);
        mapping.put(125, BoneClub);
        mapping.put(126, FireBlast);
        mapping.put(127, Waterfall);
        mapping.put(128, Clamp);
        mapping.put(129, Swift);
        mapping.put(130, SkullBash);
        mapping.put(131, SpikeCannon);
        mapping.put(132, Constrict);
        mapping.put(133, Amnesia);
        mapping.put(134, Kinesis);
        mapping.put(135, SoftBoiled);
        mapping.put(136, HighJumpKick);
        mapping.put(137, Glare);
        mapping.put(138, DreamEater);
        mapping.put(139, PoisonGas);
        mapping.put(140, Barrage);
        mapping.put(141, LeechLife);
        mapping.put(142, LovelyKiss);
        mapping.put(143, SkyAttack);
        mapping.put(144, Transform);
        mapping.put(145, Bubble);
        mapping.put(146, DizzyPunch);
        mapping.put(147, Spore);
        mapping.put(148, Flash);
        mapping.put(149, Psywave);
        mapping.put(150, Splash);
        mapping.put(151, AcidArmor);
        mapping.put(152, Crabhammer);
        mapping.put(153, Explosion);
        mapping.put(154, FurySwipes);
        mapping.put(155, Bonemerang);
        mapping.put(156, Rest);
        mapping.put(157, RockSlide);
        mapping.put(158, HyperFang);
        mapping.put(159, Sharpen);
        mapping.put(160, Conversion);
        mapping.put(161, TriAttack);
        mapping.put(162, SuperFang);
        mapping.put(163, Slash);
        mapping.put(164, Substitute);
        mapping.put(165, Struggle);
    }

    public static Move getMove(int b) {
        final Move move = mapping.get(b);
        if (move == null) {
            return Struggle;
        }
        return move;
    }
}
