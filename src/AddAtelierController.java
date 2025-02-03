import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.util.Iterator;

public class AddAtelierController implements Initializable {

    @FXML
    private Button addbutton;

    @FXML
    private DatePicker date;

    @FXML
    private Button enregistrer;

    @FXML
    private TextField heure;

    @FXML
    private TextField numdossier;

    @FXML
    private TextField thematique;

    @FXML
    private GridPane g1;

    @FXML
    private GridPane g2;
    
    @FXML
    private ChoiceBox<String> typeAtelier;

    @FXML
    private VBox container; // Container to hold dynamic fields

    private final String[] types = {"En-ligne", "En-présentiel"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        typeAtelier.getItems().addAll(types);
    }

    @FXML
    void addnum(ActionEvent event) {
        // Add a new numdossier field and addbutton in a new grid
        addNumDossierField();

        // Hide the previous addbutton
        ((Button) event.getSource()).setVisible(false);
    }

    @FXML
    void enreg(ActionEvent event) {
        // Extract data from the fields
        String atelierDate = date.getValue().toString();
        String atelierHeure = heure.getText();
        String atelierThematique = thematique.getText();

        ArrayList<Integer> atelierNumDossierList = new ArrayList<>();

        // Collect numdossier from all fields
        for (Node node : container.getChildren()) {
            if (node instanceof GridPane && node != g1 && node != g2) {
                GridPane gridPane = (GridPane) node;
                for (Node field : gridPane.getChildren()) {
                    if (field instanceof TextField) {
                        String numDossierText = ((TextField) field).getText();
                        if (!numDossierText.isEmpty()) {
                            int numDossier = Integer.parseInt(numDossierText);
                            atelierNumDossierList.add(numDossier);
                        }
                    }
                }
            }
        }

        // Create Atelier object
        Atelier atelier = new Atelier(atelierHeure, atelierDate, atelierNumDossierList, atelierThematique);
        System.out.println("Atelier created: " + atelier.getRDV());

        // Print the numDossier list
        Iterator<Integer> it = atelierNumDossierList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Close the window
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    private void addNumDossierField() {
        // Create a new GridPane
        GridPane newGrid = new GridPane();
        newGrid.setHgap(10); // Horizontal gap between children
        newGrid.setVgap(10); // Vertical gap between children

        // Create a new TextField for numdossier
        TextField newNumDossier = new TextField();
        newNumDossier.setPromptText("Numéro de dossier");
        newNumDossier.setStyle("-fx-background-color: FAFAFA;");

        // Set the preferred width of the new TextField to match the previous one
        newNumDossier.setPrefWidth(numdossier.getPrefWidth() + 62);

        // Create a new add button
        Button newAddButton = new Button("+");
        newAddButton.setStyle("-fx-background-color: #00CED0; -fx-background-radius: 20;");
        newAddButton.setTextFill(javafx.scene.paint.Color.WHITE);
        newAddButton.setOnAction(this::addnum);

        // Add the TextField and Button to the GridPane
        newGrid.add(newNumDossier, 0, 0);
        newGrid.add(newAddButton, 1, 0);

        // Insert the new grid above the enregistrer button
        int enregistrerIndex = container.getChildren().indexOf(enregistrer);
        VBox.setMargin(newGrid, new Insets(10, 10, 0, 10)); // top, right, bottom, left
        container.getChildren().add(enregistrerIndex, newGrid);
    }
}
