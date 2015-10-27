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
Once the save file is loaded you will be presented with a view of all of the Pokémon in your party. PokéBox uses a view for each group of Pokémon in your save file: Party, PC Box 1, PC Box 2, ... , PC Box 12. Use the right arrow key to look at the next view in the sequence. If you are looking at the Party view, pressing the right arrow key will take you to the PC Box 1 view. Use the left arrow key to look at the previous view in the sequence. If you are looking at the PC Box 12 view, pressing the left arrow key will take you to the PC Box 11 view. Navigation supports wrapping, so if you are looking at the Party view, pressing the left arrow key will tak you to the PC Box 12 view.

### Viewing Pokémon Information
To view detailed information about a Pokémon, hover over it with your mouse. The details will be shown on the right side of the screen. 

## Compatibility
PokéBox has been tested to work with [VBA-M](http://vba-m.com/) save files. If you are using another emulator the save files may not be read correctly. Create an issue and attach your save file to assist with debugging.

## Screenshots
![Party View](/screenshots/party_view.png?raw=true "Party View")
![Box View](/screenshots/box_view.png?raw=true "Box View")

## Origin
PokéBox started as a hackathon project for [HackTX](http://hacktx.com/) 2015 by [Tyler Yates](https://github.com/Tyler-Yates).

## Notice
The copyright for the Pokémon franchise is owned by [The Pokémon Company](http://www.pokemon.com/us/).
