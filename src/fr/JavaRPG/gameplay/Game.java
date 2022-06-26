package fr.JavaRPG.gameplay;

import fr.JavaRPG.personnage.Character;
import fr.JavaRPG.utils.InputUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Game extends Round {
    ArrayList<Character> characters;
    ArrayList<Round> rounds;
    InputUtils input = new InputUtils();

    public Game() {
        this.characters = new ArrayList<>();
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    //**************************************
    // Methods

    public void initializeGame()
    {
        System.out.println("\nBienvenue dans l'arene ! Ici tout les coups sont permis et vous le savez !\nQuels seront nos deux combatants du jour ?\n");

        System.out.println("Combatant numero 1 quel est ton nom ?");
        String name1 = input.getInputString();
        Character fighter1 = new Character(name1);
        System.out.println(fighter1.getName() + " ? Mouai bof mais ca passe...\n");
        this.getCharacters().add(fighter1);

        System.out.println("Combatant numero 2 quel est ton nom ?");
        String name2 = input.getInputString();
        Character fighter2 = new Character(name2);
        System.out.println(fighter2.getName() + " ? Ok pas fou mais pourquoi pas !\n");
        this.getCharacters().add(fighter2);


        System.out.println(fighter1.getName() + " et " + fighter2.getName() + " tenez vous pret, le combat commence !!!");
    }

    public void startGame(){
        while (this.getCharacters().size() > 1)
        {
            startRound(this.getCharacters());
        }
        System.out.println("VICTOIRE de " + this.getCharacters().get(0));
    }
}
