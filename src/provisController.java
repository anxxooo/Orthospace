import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class provisController {
    @FXML
    private Button dossier;
    @FXML
    private Button troubles;

    @FXML
    private Button dossier1;

    @FXML
    private Button exercice;

    @FXML
    private Button modifTest;

    @FXML
    private Button modifierEx;

    @FXML
    private Button modifierQuest;

    @FXML
    private Button question;

    @FXML
    private Button test;

    @FXML
    void afficherDossier(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("findDossier.fxml"));
            Parent root = loader.load();
            findDossierController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);
            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Orthophoniste orthophoniste;

    @SuppressWarnings("static-access")
    public void setOrthophoniste(Orthophoniste orthophoniste) {
        this.orthophoniste = orthophoniste;
    }

    @FXML
    void creerExercice(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newExercice.fxml"));
            Parent root = loader.load();
            NewExerciceController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void creerQuestion(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newQuestion.fxml"));
            Parent root = loader.load();
            newQuestionController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) question.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void creerTest(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newTest.fxml"));
            Parent root = loader.load();
            NewTestController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);
            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) question.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void modifierExercice(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("modifExercice.fxml"));
            Parent root = loader.load();
            modifExerciceController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifierQuestion(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("modifQuestion.fxml"));
            Parent root = loader.load();
            modifQuestionController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modifierTest(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("modifTest.fxml"));
            Parent root = loader.load();
            modifTestController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void afficherTrouble(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("trouble.fxml"));
            Parent root = loader.load();
            troubleController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void creerDossier(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("essai.fxml"));
            Parent root = loader.load();
            essaiController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);
            controller.setDossier(new Dossier());
            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void afficherRDV(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("essai2.fxml"));
            Parent root = loader.load();
            essai2Controller controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);
            System.out.println("provis " + orthophoniste.getDossier(0).getBos().size());
            controller.setDossier(orthophoniste.getDossier(0));
            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) exercice.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
