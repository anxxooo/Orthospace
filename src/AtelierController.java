import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AtelierController implements Initializable {

    @FXML
    private Button bo;

    @FXML
    private Label nomprenom;

    @FXML
    private GridPane p1;

    @FXML
    private Label theme;

    @FXML
    private VBox container;

    // Example list of patients
    private List<String> patients = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        

        // Set the thematic label
        theme.setText("Atelier Thematique");

        // Example patients, replace this with your actual data source
        patients.add("Patient 1");
        patients.add("Patient 2");
        patients.add("Patient 3");
        patients.add("patient 4");
        patients.add("patient 5");
        patients.add("Patient 6");
        patients.add("Patient 7");
        patients.add("Patient 8");
        patients.add("patient 9");
        patients.add("patient 10");
        patients.add("Patient 1");
        patients.add("Patient 2");
        patients.add("Patient 3");
        patients.add("patient 4");
        patients.add("patient 5");
        patients.add("Patient 6");
        patients.add("Patient 7");
        patients.add("Patient 8");
        patients.add("patient 9");
        patients.add("patient 10");

        container.getChildren().remove(p1);

        // Add GridPane for each patient
        addPatientsToGrid();
    }

    private void addPatientsToGrid() {
        // Iterate over the patients list and create a GridPane for each
        for (int i = 0; i < patients.size(); i++) {
            String patientName = patients.get(i);

            // Clone the existing GridPane
            GridPane newGrid = createPatientGridPane(patientName, i + 1);

            // Add the new GridPane to the container
            container.getChildren().add(newGrid);
        }
    }

    private GridPane createPatientGridPane(String patientName, int index) {
        GridPane newGrid = new GridPane();
        newGrid.setHgap(p1.getHgap());
        newGrid.setVgap(p1.getVgap());
        newGrid.setPadding(p1.getPadding()); // Set padding to match original
        VBox.setMargin(newGrid, new Insets(10.0)); // Set margin to match original
        newGrid.setStyle("-fx-background-color: #ffffff;");

        // Define column constraints to match original
        for (ColumnConstraints cc : p1.getColumnConstraints()) {
            ColumnConstraints newCc = new ColumnConstraints();
            newCc.setHgrow(cc.getHgrow());
            newCc.setMaxWidth(cc.getMaxWidth());
            newCc.setMinWidth(cc.getMinWidth());
            newCc.setPrefWidth(cc.getPrefWidth());
            newGrid.getColumnConstraints().add(newCc);
        }

        // Define row constraints to match original
        for (RowConstraints rc : p1.getRowConstraints()) {
            RowConstraints newRc = new RowConstraints();
            newRc.setMinHeight(rc.getMinHeight());
            newRc.setVgrow(rc.getVgrow());
            newGrid.getRowConstraints().add(newRc);
        }

        // Create and configure Label for patient name
        Label nameValue = new Label(patientName);
        nameValue.setId("nomprenom" + index);
        GridPane.setConstraints(nameValue, 0, 0); // Set position

        // Create and configure Button for action
        Button addButton = new Button("Créer Bilan Orthophonique");
        addButton.setId("bo" + index);
        addButton.setStyle("-fx-background-color: #00CED0; -fx-background-radius: 5;");
        addButton.setTextFill(javafx.scene.paint.Color.WHITE);
        addButton.setOnAction(event -> addbo(event));
        GridPane.setConstraints(addButton, 1, 0); // Set position

        // Add components to GridPane
        newGrid.getChildren().addAll(nameValue, addButton);

        return newGrid;
    }

    @FXML
    void addbo(ActionEvent event) {
        // Handle button click event
        Button source = (Button) event.getSource();
        System.out.println("Button clicked: " + source.getId());
    }
}
