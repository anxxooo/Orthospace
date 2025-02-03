import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class AddConsultationController implements Initializable{

    @FXML
    private TextField age;

    @FXML
    private DatePicker date;

    @FXML
    private Button enregistrer;

    @FXML
    private TextField heure;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private ChoiceBox<String> typeConsultation;

    private String[] types = {"En-ligne", "En-présentiel"};

    @Override
    public void initialize(URL arg0 , ResourceBundle arg1) {
        typeConsultation.getItems().addAll(types);
    }

    @FXML
    void enreg(ActionEvent event) throws IOException {
        // Extract data from the fields
        String patientNom = nom.getText();
        String patientPrenom = prenom.getText();
        int patientAge = Integer.parseInt(age.getText());
        String consultationDate = date.getValue().toString();
        String consultationHeure = heure.getText();

        // Get the selected item from the menu button
        // Get the selected item from the choice box
        String consultationType = typeConsultation.getValue();

        // Create Consultation object
        Consultation consultation = new Consultation(consultationHeure, consultationDate, patientNom, patientPrenom, patientAge);

        System.out.println("Consultation created: " + consultation.getRDV());
        System.out.println("Patient: " + consultation.getPatient().getNom() + " " + consultation.getPatient().getPrenom());
        System.out.println("Patient age: " + patientAge);
        System.out.println("Type of Consultation: " + consultationType);

        

            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddPatient.fxml"));
            Parent root = loader.load();
            
            // Access the controller of the loaded FXML file if needed
            // AddRDVController addRDVController = loader.getController();
            
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root));
            stage1.show();

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
