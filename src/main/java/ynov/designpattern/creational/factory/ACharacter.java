package ynov.designpattern.creational.factory;

public abstract class ACharacter {
    private String name;
    private int health;
    private int attack;

    public ACharacter(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    
    public abstract void useSpecialSkills();

    public void displayCharacter() {
        System.out.println(name + ", Attack: " + attack + ", Health: " + health);
    }
}
