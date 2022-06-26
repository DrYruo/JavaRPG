package fr.JavaRPG.utils;

import java.util.Scanner;

public class InputUtils {
    Scanner input = new Scanner(System.in);

    public String getInputString(){
        return this.input.next();
    }

    public int getInputIntegerOptions(int min, int max)
    {
        while (true)
        {
            try {
                int input = this.input.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
                else throw new Exception("Erreur : Saisie invalide, veuillez faire un choix entre " + min + " et " + max);
            } catch (Exception e) {
                String mauvaisChoix = this.input.next();
                System.out.println("Erreur : Saisie invalide, veuillez saisir un entier : ");
                continue;
            }
        }
    }
}
