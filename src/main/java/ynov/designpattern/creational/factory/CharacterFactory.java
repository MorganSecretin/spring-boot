package ynov.designpattern.creational.factory;

public class CharacterFactory {
    public static ACharacter createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "mage":
                return new Mage(name, 100, 50);
            case "warrior":
                return new Warrior(name, 200, 30);
            case "archer":
                return new Archer(name, 150, 40);
            default:
                throw new IllegalArgumentException("Unknown character type");
        }
    }
}

