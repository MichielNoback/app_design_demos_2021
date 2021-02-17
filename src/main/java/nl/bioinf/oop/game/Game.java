package nl.bioinf.oop.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    //gameWidth defines the maximum x coordinate of the game
    private double gameWidth;
    //gameDepth defines the maximum y coordinate of the game
    private double gameDepth;
    //gameHeight defines the maximum z coordinate of the game
    private double gameHeight;

    private List<GameCharacter> gameCharacters = new ArrayList<>();

    /**
     * Spawn a player.
     *
     * This method spawns a player in the game at a preset Location, with a predefined weapon.
     * @param name player name
     * @param location spawn location
     * @param weapon initial weapon
     */
    public GameCharacter spawnPlayer(String name, Location location, AbstractWeapon weapon) {
        throw new UnsupportedOperationException("not implemented yet");
    }

}
