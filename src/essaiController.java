import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class essaiController {

    @FXML
    private Button bo;

    @FXML
    private Button dossier;

    @FXML
    private Button patient;

    Orthophoniste orthophoniste;

    public void setOrthophoniste(Orthophoniste orthophoniste) {
        this.orthophoniste = orthophoniste;
    }

    Dossier dossierrr;

    public void setDossier(Dossier dossierr) {
        this.dossierrr = dossierr;
    }

    @FXML
    void creerBO(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page d'inscription
            FXMLLoader loader = new FXMLLoader(getClass().getResource("creerBO.fxml"));
            Parent root = loader.load();

            // Obtenir le contrôleur de la page d'inscription
            creerBoController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);
            controller.setBO(new BOpremierRDV());
            controller.setDossier(dossierrr);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) dossier.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void creerDossier(ActionEvent event) {
        dossierrr.setNumero(orthophoniste.NUMERO_DOSSIER);
        orthophoniste.NUMERO_DOSSIER = orthophoniste.NUMERO_DOSSIER + 1;
        orthophoniste.ajouterDossier(dossierrr.getNumero(), dossierrr);
        try {
            // Charger le fichier FXML de la page d'inscription
            FXMLLoader loader = new FXMLLoader(getClass().getResource("provisoire.fxml"));
            Parent root = loader.load();

            // Obtenir le contrôleur de la page d'inscription
            provisController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) dossier.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void creerPatient(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page d'inscription
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newPatient.fxml"));
            Parent root = loader.load();

            // Obtenir le contrôleur de la page d'inscription
            newPatientController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);
            controller.setDossier(dossierrr);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) dossier.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void retourPage(ActionEvent event) {
        try {
            // Charger le fichier FXML de la page de connexion
            FXMLLoader loader = new FXMLLoader(getClass().getResource("provisoire.fxml"));
            Parent root = loader.load();
            provisController controller = loader.getController();
            controller.setOrthophoniste(orthophoniste);

            // Créer une nouvelle scène avec la racine chargée depuis le fichier FXML
            Scene scene = new Scene(root);

            // Obtenir la référence de la scène actuelle à partir du bouton cliqué
            Stage stage = (Stage) dossier.getScene().getWindow();

            // Modifier la scène actuelle pour afficher la nouvelle scène
            stage.setScene(scene);
            // stage.setMaximized(true);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
