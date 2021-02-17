package nl.bioinf.oop.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    //gameWidth defines the maximum x coordinate of the game
    private double gameWidth;
    //gameDepth defines the maximum y coordinate of the game
    private double gameDepth;
    //gameHeight defines the maximum z coordinate of the game
    private double gameHeight;

    private List<GameCharacter> gameCharacters = new ArrayList<>();

    public Game(double gameWidth, double gameDepth, double gameHeight) {
        this.gameWidth = gameWidth;
        this.gameDepth = gameDepth;
        this.gameHeight = gameHeight;
    }

    public List<GameCharacter> getGameCharacters() {
        return Collections.unmodifiableList(gameCharacters);
    }

    /**
     * Spawn a player.
     *
     * This method spawns a player in the game at a preset Location, with a predefined weapon.
     * @param name player name
     * @param location spawn location
     * @param weapon initial weapon
     */
    public GameCharacter spawnPlayer(String name, Location location, AbstractWeapon weapon) {
        //name should not be null, not be empty and at least 2 characters
        //location should not be null
        //weapon should not be null

        if (name == null || location == null || weapon == null) {
            throw new IllegalArgumentException("no argument should be null");
        }

        if (name.isEmpty() || name.length() < 3) {
            throw new IllegalArgumentException("name should be at least 2 characters long");
        }

        if (! location.isWithinSpace(this.gameWidth, this.gameDepth, this.gameHeight)) {
            throw new IllegalArgumentException("Location should be between (0, 0, 0) and game(width, depth, height)");
        }

        GameCharacter gameCharacter = new GameCharacter(name, location);
        this.gameCharacters.add(gameCharacter);
        return gameCharacter;
    }

}
