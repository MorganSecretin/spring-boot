package ynov.solid;

import ynov.solid.s.solution.UserService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        UserService userService = new UserService();
        String username = "admin";
        String password = "Root.Root.5";
        userService.registerUser(username, ""); // Invalide
        userService.registerUser(username, password); // Succès
        userService.loginUser(username, "Root.Root.6"); // Invalide
        userService.loginUser(username, password); // Succès
    }
}
