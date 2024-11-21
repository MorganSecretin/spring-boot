package ynov.designpattern.creational.factory;

public class App {
    public static void main(String[] args) {
        System.out.println();

        ACharacter mage = CharacterFactory.createCharacter("mage", "Gandalf");
        mage.displayCharacter();  // Affiche : Mage: Gandalf, Attack: 50, Health: 100, Skills: Fireball, Teleport
        mage.useSpecialSkills();

        // Créer un Warrior
        ACharacter warrior = CharacterFactory.createCharacter("warrior", "Conan");
        warrior.displayCharacter();  // Affiche : Warrior: Conan, Attack: 70, Health: 200, Skills: Shield Bash, Berserk
        warrior.useSpecialSkills();

        // Créer un Archer
        ACharacter archer = CharacterFactory.createCharacter("archer", "Legolas");
        archer.displayCharacter();
        archer.useSpecialSkills();
    }
}
