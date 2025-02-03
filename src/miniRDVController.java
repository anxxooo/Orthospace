import javafx.fxml.FXML;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class miniRDVController {

    @FXML
    private Label debut;

    @FXML
    private Label fin;

    @FXML
    private ButtonBar minirdv;

    @FXML
    void showRDV(MouseEvent event) {
        System.out.println("Show RDV details");
    }

    public void setRDVDetails(String startTime, String endTime) {
        debut.setText("De : " + startTime);
        fin.setText("À : " + endTime);
    }
}
