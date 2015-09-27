package poke.decode;

import poke.data.Badges;
import poke.data.Trainer;
import poke.data.TrainerBuilder;
import poke.util.ByteUtil;

class TrainerDecoder {

    static Trainer decodeTrainer(byte[] bytes) {
        final TrainerBuilder trainerBuilder = new TrainerBuilder();
        trainerBuilder.setName(CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, 0x2598, 11)));
        trainerBuilder.setMoney(MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x25F3, 3)));
        trainerBuilder.setRivalName(CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, 0x25F6, 11)));
        trainerBuilder.setBadges(new Badges(bytes[0x2602]));
        trainerBuilder.setId(ByteUtil.getNumber(bytes, 0x2605, 2));
        trainerBuilder.setPikachuFriendship(Byte.toUnsignedInt(bytes[0x271C]));
        trainerBuilder.setCasinoCoins(MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x2850, 2)));
        trainerBuilder.setTimePlayed(TimeDecoder.decodeTime(ByteUtil.getBytes(bytes, 0x2CED, 5)));

        return trainerBuilder.createTrainer();
    }
}
