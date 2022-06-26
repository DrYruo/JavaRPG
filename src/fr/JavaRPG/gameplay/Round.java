package fr.JavaRPG.gameplay;

import fr.JavaRPG.personnage.Character;
import fr.JavaRPG.utils.InputUtils;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

abstract class Round {
    InputUtils input = new InputUtils();

    public void startRound(ArrayList<Character> characters){
        for (Character character : characters) {
            System.out.println("\n" + character.getName() + " a toi de jouer :");
            displayCharacterOptions();
            int choice = input.getInputIntegerOptions(1,2);
            System.out.println(choice);
            if (choice == 1)
            {
                Character opponent = getOpponent1vs1(character, characters);
                character.tackle(opponent);
                if (opponent.getLife() == 0)
                {
                    characters.remove(opponent);
                }
            }
            else if (choice == 2)
            {
                character.heal();
                System.out.println(character.getName() + " se soigne, vive les popo !");
            }
        }
    }


    private Character getOpponent1vs1(Character character, ArrayList<Character> characters)
    {
        for (Character characterOfList : characters) {
            if (!Objects.equals(characterOfList.getName(), character.getName())){
                return characterOfList;
            }
        }
        return null;
    }

    // DISPLAY
    private void displayCharacterOptions(){
        System.out.println("Que veux-tu faire ?\n[1] Attaquer\n[2] Soin");
    }
}
