import java.util.HashMap;

public class AnamneseAdulte extends Anamnese {
<<<<<<< HEAD
    private HashMap<QuestionAnamneseAdulte, String> questions;

    public AnamneseAdulte(HashMap<QuestionAnamneseAdulte, String> questions) {
        this.questions = questions;
    }

    public HashMap<QuestionAnamneseAdulte, String> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<QuestionAnamneseAdulte, String> questions) {
        this.questions = questions;
    }
=======
    private QstEnfatCategorie qstAdulteCateg;
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573

    public AnamneseAdulte(QstEnfatCategorie qstAdulteCateg) {
        super();
        this.qstAdulteCateg = qstAdulteCateg;
    }
}
