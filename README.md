# PokéBox
PokéBox is a Java application for viewing pokemon contained in emulator save files. Currently the program is only targeted at generation I save files (Red, Blue, and Yellow), but later generations may be added in the future.

## Running the Program
To graphically view a save file, run the `main()` method of the `PokeBox` class under the `poke.graphical` package. Since this project uses Maven to manage dependencies you can run:
```
mvn install
mvn exec:java -Dexec.mainClass="poke.graphical.PokeBox"
```
The program will then prompt you to select the save file you want to view. Additionally, you can pass the full filepath of the save file to the program as the first argument to avoid having to choose the file.

## Controls
### Loading a Save File
Press the 'L' key to load a save file into PokéBox. If you already have a save file loaded, you will see its full filepath at the top of the program. You can also click this filepath to load a save file.

### Navigating
Once the save file is loaded you will be able to see all of the Pokémon in your save file. PokéBox uses a view for each group of Pokémon in your save file. There are thirteen groups of Pokémon in a save file: one party and twelve PC boxes. Up to six Pokémon can be in the party and up to twenty Pokémon can be in each PC box.

The view order is: Party, PC Box 1, PC Box 2, ..., PC Box 12. Use the right arrow key to look at the next view in the sequence. If you are looking at the Party view, pressing the right arrow key will take you to the PC Box 1 view. Use the left arrow key to look at the previous view in the sequence. If you are looking at the PC Box 12 view, pressing the left arrow key will take you to the PC Box 11 view. Navigation supports wrapping, so if you are looking at the Party view, pressing the left arrow key will tak you to the PC Box 12 view.

### Viewing Pokémon Information
To view detailed information about a Pokémon, hover over it with your mouse. The details will be shown on the right side of the screen. 

## Compatibility
PokéBox has been tested to work with [VBA-M](http://vba-m.com/) save files. If you are using another emulator the save files may not be read correctly. Create an issue and attach your save file to assist with debugging.

## Screenshots
![Party View](/screenshots/party_view.png?raw=true "Party View")
![Box View](/screenshots/box_view.png?raw=true "Box View")

## Bonus
Don't want to play through the entire game? Head over to [src/test/resources](https://github.com/Tyler-Yates/PokeBox/tree/master/src/test/resources) to download a completed [Pokémon Yellow](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_Yellow_Version) game save. The save has all badges, all three [legendary birds](http://bulbapedia.bulbagarden.net/wiki/Legendary_birds), and [Mewtwo](http://bulbapedia.bulbagarden.net/wiki/Mewtwo_%28Pok%C3%A9mon%29).

## Origin
PokéBox started as a hackathon project for [HackTX](http://hacktx.com/) 2015 by [Tyler Yates](https://github.com/Tyler-Yates).

## Notice
The copyright for the Pokémon franchise is owned by [The Pokémon Company](http://www.pokemon.com/us/).
