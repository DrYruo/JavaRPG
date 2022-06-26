package fr.JavaRPG.personnage;

public class Character {
    // Attributs
    private String  name;
    private int     life;

    // Constructeur
    public Character(String name) {
        this.setName(name);
        this.setLife(100);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getLife() {
        return life;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLife(int life) {
        this.life = life;
    }

    //************************************
    // Methodes

    private void takeDamage(int damage) {
        int actualLife = this.getLife();

        if (actualLife - damage <= 0){
            this.setLife(0);
        }
        else {
            this.setLife(actualLife - damage);
        }
    }

    public void tackle(Character character) {
        System.out.println(this.getName() + " attaque " + character.getName());
        character.takeDamage(30);

        if (character.getLife() == 0) {
            System.out.println("OMG ! " + this.getName() + " vient d'envoyer " + character.getName() + " dans l'autre monde !");
        }
        else {
            System.out.println("Quelle violence ! " + character.getName() + " perd 30 pts de vie !");
        }
    }

    public void heal() {
        int actualLife = this.getLife();

        this.setLife(actualLife + 50);
        if (this.getLife() >= 100){
            this.setLife(100);
        }
    }
}
