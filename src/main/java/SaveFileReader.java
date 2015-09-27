import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;

public class SaveFileReader {

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

        final String nickname = CharacterDecoder.decodeCharacters(ByteUtil.getBytes(bytes,
                0x2598, 11));
        System.out.println(nickname);

        final int money = MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x25F3, 3));
        System.out.println("Money: " + money);

        final int casinoCoins = MoneyDecoder.getMoney(ByteUtil.getBytes(bytes, 0x2850, 2));
        System.out.println("Casino coins: " + casinoCoins);

        final List<Pokemon> party = PokemonDecoder.decodePokemonPartyList(ByteUtil.getBytes
                (bytes, 0x2F2C, 404));
        System.out.println(party.get(0));
    }
}
