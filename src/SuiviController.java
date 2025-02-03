import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class SuiviController implements Initializable{

    @FXML
    private Button bo;

    @FXML
    private Label date;

    @FXML
    private Label heure;

    @FXML
    private Label nom;

    @FXML
    private Label numdossier;

    @FXML
    private Label prenom;

    int numDossier;

    Suivi suivi = new Suivi("10:00", "2021-05-20", 1, "Suivi");

    @Override
    public void initialize (URL arg0 , ResourceBundle arg1){
        date.setText(suivi.getDate());
        heure.setText(suivi.getHeure());
        nom.setText(Orthophoniste.getPatient(numDossier).getNom());
        prenom.setText(Orthophoniste.getPatient(numDossier).getPrenom());
        numdossier.setText(Integer.toString(numDossier));
    }

    @FXML
    void addbo(ActionEvent event) {

    }

}
