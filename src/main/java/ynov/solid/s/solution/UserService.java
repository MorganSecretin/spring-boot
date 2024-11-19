package ynov.solid.s.solution;

public class UserService {
    private Bdd bdd = new Bdd();
    private UserValidation userValidation = new UserValidation();

    public void registerUser(String username, String password) {
        // Valider le nom d'utilisateur et le mot de passe
        if (userValidation.validateUsername(username) && userValidation.validatePassword(password)) {
            bdd.user = new User(username, password);
            // Enregistrer l'utilisateur dans la base de données
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }

    public void loginUser(String username, String password) {
        // Valider le nom d'utilisateur et le mot de passe
        if (userValidation.validateUsername(username) && userValidation.validatePassword(password) &&
                bdd.user.getUsername().equals(username) && bdd.user.getPassword().equals(password)) {
            // Authentifier l'utilisateur
            System.out.println("Utilisateur connecté avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
