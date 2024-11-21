package ynov.designpattern.creational.singleton;

public class App {
    public static void main(String[] args) {
        // Affichage de la configuration
        System.out.println('\n');
        System.out.println("mode: "+Config.getSettings("mode"));
        Config.setSettings("mode", "production");
        System.out.println("new mode: "+Config.getSettings("mode"));
    }
}
