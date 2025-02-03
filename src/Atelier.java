import java.util.ArrayList;

public class Atelier extends RDV {
    private final String duree = "1h";
    private ArrayList<Integer> numDossier;
    private String thematique;

    public Atelier(String heure, String date, ArrayList<Integer> numDossier, String thematique) {
        super(heure, date);
        this.numDossier = numDossier;
        this.thematique = thematique;
    }

}
