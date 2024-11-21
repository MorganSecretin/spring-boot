package ynov.designpattern.creational.factory;

public abstract class ACharacter {
    private String name;
    private int health;
    private int attack;
    private String[] specialSkills;

    public ACharacter(String name, int health, int attack, String[] specialSkills) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.specialSkills = specialSkills;
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
    
    public void useSpecialSkills() {
        for (String skill : specialSkills) {
            System.out.println(skill);
        }
    }

    public void displayCharacter() {
        System.out.println(name + ", Attack: " + attack + ", Health: " + health + ", Skills: " + String.join(", ", specialSkills));
    }
}
