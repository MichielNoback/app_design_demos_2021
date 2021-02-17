package nl.bioinf.oop.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setupGame() {
        this.game = new Game(100, 100, 10);
    }

    @Test
    void spawnPlayer_Sunny() {
        final GameCharacter gameCharacter = game.spawnPlayer("Dozer",
                                                            new Location(10, 10, 2),
                                                            new Bazooka());
        final List<GameCharacter> gameCharacters = game.getGameCharacters();
        assertEquals(1, gameCharacters.size());
        assertEquals("Dozer", gameCharacters.get(0).getName());
    }
}