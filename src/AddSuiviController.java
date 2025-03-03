import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class AddSuiviController implements Initializable {

    @FXML
    private DatePicker date;

    @FXML
    private Button enregistrer;

    @FXML
    private TextField heure;

    @FXML
    private TextField numdossier;

    @FXML
    private ChoiceBox<String> typeSuivi;

    private String[] types = {"En-ligne", "En-présentiel"};

    @Override
    public void initialize(URL arg0 , ResourceBundle arg1) {
        typeSuivi.getItems().addAll(types);
    }

    @FXML
    void enreg(ActionEvent event) {
        // Extract data from the fields
        String suiviDate = date.getValue().toString();
        String suiviHeure = heure.getText();
        int suiviNumDossier = Integer.parseInt(numdossier.getText());
        String suiviType = typeSuivi.getValue(); 

        // Create Suivi object
        Suivi suivi = new Suivi(suiviHeure, suiviDate, suiviNumDossier, suiviType);
        System.out.println("Suivi created: " + suivi.getRDV());
        
        // Close the window
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
