package fr.JavaRPG;

import fr.JavaRPG.gameplay.Game;
import fr.JavaRPG.personnage.Character;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.initializeGame();
        game.startGame();
    }
}
