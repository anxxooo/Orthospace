import java.util.HashMap;

public class AnamneseEnfant extends Anamnese {
<<<<<<< HEAD
    private HashMap<QuestionAnamneseEnfant, String> questions;

    public AnamneseEnfant(HashMap<QuestionAnamneseEnfant, String> questions) {
        this.questions = questions;
    }
    public HashMap<QuestionAnamneseEnfant, String> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<QuestionAnamneseEnfant, String> questions) {
        this.questions = questions;
    }
=======
    private QstAdulteCategorie qstEnfantCateg;
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573

    public AnamneseEnfant(QstAdulteCategorie qstEnfantCateg) {
        super();
        this.qstEnfantCateg = qstEnfantCateg;
    }
}
