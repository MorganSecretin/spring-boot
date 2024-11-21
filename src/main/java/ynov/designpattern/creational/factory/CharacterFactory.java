package ynov.designpattern.creational.factory;

public class CharacterFactory {
    public static ACharacter createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "mage":
                return new Mage(name);
            case "warrior":
                return new Warrior(name);
            case "archer":
                return new Archer(name);
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}

