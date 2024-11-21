package ynov.designpattern.creational.factory;

public class Mage extends ACharacter {
    public Mage(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void displayCharacter() {
        System.out.print("Mage :");
        super.displayCharacter();
    }

    @Override
    public void useSpecialSkills() {
        System.out.println("Fireball, Teleport");
    }
}
