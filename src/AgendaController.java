import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AgendaController {

    @FXML
    private Button RDV;

    @FXML
    private ScrollPane c0, c1, c2, c3, c4, c5, c6;

    @FXML
    private VBox c10, c11, c12, c13, c14, c15, c16;

    @FXML
    private Label d10, d11, d12, d13, d14, d15, d16;

    @FXML
    private Text date;

    @FXML
    private BorderPane date_container;

    @FXML
    private Button next, previous;

    private LocalDate startOfWeek;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    

    private Agenda agenda; // Assuming this is the main agenda object

    public AgendaController() {
        startOfWeek = LocalDate.now().with(DayOfWeek.SUNDAY);
        agenda = new Agenda(); // Initialize the agenda, this might come from somewhere else
    }

    @FXML
    private void initialize() {
        updateWeek();
    }

    @FXML
    void addRDV(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddRDV.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void nextWeek(ActionEvent event) {
        startOfWeek = startOfWeek.plusWeeks(1);
        date.setText(startOfWeek.format(dateFormatter) + " - " + startOfWeek.plusDays(6).format(dateFormatter));
        updateWeek();
    }

    @FXML
    void previousWeek(ActionEvent event) {
        startOfWeek = startOfWeek.minusWeeks(1);
        date.setText(startOfWeek.format(dateFormatter) + " - " + startOfWeek.plusDays(6).format(dateFormatter));
        updateWeek();        
    }

    private void updateWeek() {
        ArrayList<Label> dates = new ArrayList<>();
        ArrayList<VBox> containers = new ArrayList<>();
        dates.add(d10); dates.add(d11); dates.add(d12); dates.add(d13); dates.add(d14); dates.add(d15); dates.add(d16);
        containers.add(c10); containers.add(c11); containers.add(c12); containers.add(c13); containers.add(c14); containers.add(c15); containers.add(c16);
        
        date.setText(startOfWeek.format(dateFormatter) + " - " + startOfWeek.plusDays(6).format(dateFormatter));
        LocalDate currentDate = startOfWeek;

        for (int i = 0; i < 7; i++) {
            String month = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE).toLowerCase();
            month = month.substring(0, 1).toUpperCase() + month.substring(1);
            String dayOfMonth = currentDate.format(DateTimeFormatter.ofPattern("dd"));
            dates.get(i).setText(dayOfMonth + ". " + month);
            containers.get(i).getChildren().clear();

            Jour jour = getJourByDate(currentDate.toString());
            if (jour != null && jour.hasRDVs()) {
                containers.get(i).setVisible(true);
                for (RDV rdv : jour.getRDVs()) {
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("miniRDV.fxml"));
                        Parent miniRDV = loader.load();
                        miniRDVController controller = loader.getController();
                        controller.setRDVDetails(rdv.getHeure(), rdv.getFin()); // Adjust this to your RDV details
                        containers.get(i).getChildren().add(miniRDV);
                        VBox.setMargin(miniRDV, new Insets(6, 0, 6, 4));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                containers.get(i).setVisible(false);
            }
            currentDate = currentDate.plusDays(1);
        }
    }

    private Jour getJourByDate(String date) {
        for (Jour jour : agenda.getJours()) {
            if (jour.getDate().equals(date)) {
                return jour;
            }
        }
        return null;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
