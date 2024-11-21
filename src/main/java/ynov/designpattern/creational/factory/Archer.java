package ynov.designpattern.creational.factory;

public class Archer extends ACharacter {
    public Archer(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void displayCharacter() {
        System.out.print("Archer :");
        super.displayCharacter();
    }

    @Override
    public void useSpecialSkills() {
        System.out.println("Archer special skill: Arrow rain");
    }
}
