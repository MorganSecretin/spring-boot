package ynov.designpattern.creational.factory;

public class Warrior extends ACharacter {
    public Warrior(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void displayCharacter() {
        System.out.print("Warrior :");
        super.displayCharacter();
    }

    @Override
    public void useSpecialSkills() {
        System.out.println("Warrior special skill: Shield");
    }
}
