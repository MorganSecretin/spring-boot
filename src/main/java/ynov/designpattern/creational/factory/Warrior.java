package ynov.designpattern.creational.factory;

public class Warrior extends ACharacter {
    public Warrior(String name) {
        super(name, 100, 10, new String[]{"Sword", "Shield"});
    }

    @Override
    public void displayCharacter() {
        System.out.print("Warrior :");
        super.displayCharacter();
    }
}
