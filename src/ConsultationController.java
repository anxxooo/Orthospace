import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class ConsultationController implements Initializable{

    @FXML
    private Label age;

    @FXML
    private Button bo;

    @FXML
    private Label date;

    @FXML
    private Button dm;

    @FXML
    private Label heure;

    @FXML
    private Label nom;

    @FXML
    private Label prenom;

    int numDossier;

    Consultation consultation = new Consultation("10:00", "2021-05-20", "touat", "malak",20);

    @Override
    public void initialize (URL arg0 , ResourceBundle arg1){
        date.setText(consultation.getDate());
        heure.setText(consultation.getHeure());
        nom.setText("touat");
        prenom.setText("malak");
        age.setText("20");
        //numdossier.setText(Integer.toString(numDossier));
    }

    @FXML
    void addbo(ActionEvent event) {

    }

    @FXML
    void creerdossiermedical(ActionEvent event) {

    }

}
