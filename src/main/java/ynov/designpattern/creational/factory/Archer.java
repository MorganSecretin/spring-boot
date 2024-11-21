package ynov.designpattern.creational.factory;

public class Archer extends ACharacter {
    public Archer(String name) {
        super(name, 50, 5, new String[]{"Arrow", "Bow"});
    }

    @Override
    public void displayCharacter() {
        System.out.print("Archer :");
        super.displayCharacter();
    }
}
