package poke.decode;

import poke.data.Pokemon;
import poke.util.ByteUtil;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class SaveFileReader {
    private static final int NUMBER_OF_PC_BOXES = 12;
    private static final int BOX_LENGTH = 1122;

    public static void main(String[] args) throws IOException {
        final ClassLoader classLoader = SaveFileReader.class.getClassLoader();
        final URL resource = classLoader.getResource("yellow.sav");
        if (resource == null) {
            System.err.println("Cannot find file!");
            return;
        }
        final File file = new File(resource.getFile());
        readSaveFile(file);
    }

    public static void readSaveFile(File saveFile) throws IOException {
        final byte[] bytes = Files.readAllBytes(saveFile.toPath());

        final String nickname = CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes, 0x2598, 11));
        System.out.println(nickname);

        final int money = MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x25F3, 3));
        System.out.println("Money: " + money);

        final int casinoCoins = MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x2850, 2));
        System.out.println("Casino coins: " + casinoCoins);

        System.out.println("\nParty Pokemon:");
        final List<Pokemon> party = PokemonDecoder.decodePokemonPartyList(ByteUtil.getBytes(bytes, 0x2F2C, 404));
        for (final Pokemon pokemon : party) {
            System.out.println(pokemon);
        }

        final int currentBox = (bytes[0x284C] & Byte.parseByte("01111111", 2));
        for (int i = 0; i < NUMBER_OF_PC_BOXES; i++) {
            System.out.println("\nBox " + (i + 1));

            final int offset;
            // The current PC Box is written into a special spot in memory
            if (i == currentBox) {
                offset = 0x30C0;
            } else {
                offset = 0x4000 + i * BOX_LENGTH;
            }

            final List<Pokemon> box = PokemonDecoder.decodeBoxPokemonList(ByteUtil.getBytes(bytes, offset, BOX_LENGTH));
            for (final Pokemon pokemon : box) {
                System.out.println(pokemon);
            }
        }
    }
}
