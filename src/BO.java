<<<<<<< HEAD
import java.io.Serializable;
import java.util.ArrayList;

public class BO implements Serializable {
    private ArrayList<EpreuveClinique> epreuvesCliniques;
    private Diagnostic diagnostic;
    private String projetTherapeutique;

    public BO() {
        epreuvesCliniques = new ArrayList<>();
        diagnostic = new Diagnostic();
    }

    public ArrayList<EpreuveClinique> getEpreuvesCliniques() {
        return epreuvesCliniques;
    }

    public void setEpreuvesCliniques(ArrayList<EpreuveClinique> epreuvesCliniques) {
        this.epreuvesCliniques = epreuvesCliniques;
    }

    public void addEpreuveClinique(EpreuveClinique epreuveClinique) {
        epreuvesCliniques.add(epreuveClinique);
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getProjetTherapeutique() {
        return projetTherapeutique;
    }

    public void setProjetTherapeutique(String projetTherapeutique) {
        this.projetTherapeutique = projetTherapeutique;
    }
}
=======
public class BO {
    private EpreuveClinique[] epreuvescliniques;
    private Diagnostic diagno;
    private String prjtherapeu;

    public void ajouterEC(EpreuveClinique ec) {
        // Add logic to add EC
    }

    public void setPrjTherapeu(String prjtherapeu) {
        this.prjtherapeu = prjtherapeu;
    }

    public void ajouterDiag(Diagnostic diag) {
        this.diagno = diag;
    }
}
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
