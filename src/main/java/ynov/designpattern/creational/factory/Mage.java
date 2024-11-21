package ynov.designpattern.creational.factory;

public class Mage extends ACharacter {
    public Mage(String name) {
        super(name, 50, 50, new String[]{"Staff", "Magic"});
    }

    @Override
    public void displayCharacter() {
        System.out.print("Mage :");
        super.displayCharacter();
    }
}
