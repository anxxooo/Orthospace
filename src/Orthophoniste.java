
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

<<<<<<< HEAD
public class Orthophoniste implements Serializable {
    private static final long serialVersionUID = 1L;
    public int NUMERO_DOSSIER = 0;
=======
// import org.apache.poi.ss.usermodel.*;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import java.io.FileOutputStream;
public class Orthophoniste {
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroTelephone;
    private String email;
    private String motDePasse;
    private HashMap<String, Question> questions;
    private HashMap<String, Exercice> exercices;
    private HashMap<String, TestQuestionnaire> questionnaires;
    private HashMap<String, TestExercice> testsExercices;
<<<<<<< HEAD
    private TreeMap<Integer, Dossier> dossiers;
=======
    private static TreeMap<Integer, Dossier> dossiers;
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573

    // Constructeur
    public Orthophoniste(String nom, String prenom, String adresse, String numeroTelephone, String email,
            String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.motDePasse = motDePasse;
        this.questions = new HashMap<>();
        this.exercices = new HashMap<>();
        this.questionnaires = new HashMap<>();
        this.testsExercices = new HashMap<>();
        this.dossiers = new TreeMap<>();
    }

    // Méthode pour ajouter une question
    public boolean ajouterQuestion(String cle, Question question) {
        if (questions.containsKey(cle)) {
            return false; // La clé existe déjà
        } else {
            questions.put(cle, question);
            return true; // Question ajoutée avec succès
        }
    }

    // Méthode pour remplacer une question existante
    public void remplacerQuestion(String cle, Question question) {
        questions.put(cle, question);
    }

    // Méthode pour supprimer une question
    public void supprimerQuestion(String cle) {
        questions.remove(cle);
    }

    // Méthode pour ajouter un exercice
    public boolean ajouterExercice(String cle, Exercice exercice) {
        if (exercices.containsKey(cle)) {
            return false; // La clé existe déjà
        } else {
            exercices.put(cle, exercice);
            return true; // Exercice ajouté avec succès
        }
    }

    // Méthode pour remplacer un exercice existant
    public void remplacerExercice(String cle, Exercice exercice) {
        exercices.put(cle, exercice);
    }

    // Méthode pour supprimer un exercice
    public void supprimerExercice(String cle) {
        exercices.remove(cle);
    }

    public boolean ajouterQuestionnaire(String cle, TestQuestionnaire questionnaire) {
        if (questionnaires.containsKey(cle)) {
            // Prompt the user to replace if the key already exists
            return false;
        } else {
            questionnaires.put(cle, questionnaire);
            return true;
        }
    }

    public boolean ajouterTestExercice(String cle, TestExercice testExercice) {
        if (testsExercices.containsKey(cle)) {
            return false;
        } else {
            testsExercices.put(cle, testExercice);
            return true;
        }
    }

    public void remplacerTest(String cle, Test test) {
        if (test instanceof TestExercice) {
            testsExercices.remove(cle);
            testsExercices.put(test.getNom(), (TestExercice) test);
        } else if (test instanceof TestQuestionnaire) {
            questionnaires.remove(cle);
            questionnaires.put(test.getNom(), (TestQuestionnaire) test);
        }
    }

    // Méthode pour ajouter un dossier
    public void ajouterDossier(int cle, Dossier dossier) {
        dossiers.put(cle, dossier);
    }

    // Méthode pour supprimer un dossier
    public void supprimerDossier(int cle) {
        dossiers.remove(cle);
    }

    public int afficherDossiers() {
        // numero avec nom prenom ?
        return 0; // numero du dossier a consulter
    }

    public void consulterDossier(int numero) {

    }

<<<<<<< HEAD
=======
    // Méthode pour afficher la liste des patients souffrant d'un trouble
    // particulier
    // public void afficherPatientsParTrouble(TroubleCategorie categorie) {
    // Map<Patient, Boolean> patientsTrouble = new HashMap<>();
    // for (Dossier dossier : dossiers.values()) {
    // for (BO bo : dossier.getBos()) {
    // for (Diagnostic diagnostic : bo.getDiagnostics()) {
    // for (Trouble trouble : diagnostic.getTroubles()) {
    // if (trouble.getCategorie() == categorie) {
    // patientsTrouble.put(dossier.getPatient(), true);
    // break;
    // }
    // }
    // }
    // }
    // }
    // System.out.println("Liste des patients souffrant du trouble " +
    // categorie.name() + ":");
    // for (Patient patient : patientsTrouble.keySet()) {
    // System.out.println(patient.getNom() + " " + patient.getPrenom());
    // }
    // }

    // Méthode pour afficher le pourcentage de patients par trouble
    public void afficherPourcentagePatientsParTrouble() {
        // Map<TroubleCategorie, Integer> nombrePatientsParTrouble = new HashMap<>();
        // int totalPatients = 0;
        // for (Dossier dossier : dossiers.values()) {
        // for (BO bo : dossier.getBos()) {
        // for (Diagnostic diagnostic : bo.getDiagnostics()) {
        // for (Trouble trouble : diagnostic.getTroubles()) {
        // TroubleCategorie categorie = trouble.getCategorie();
        // nombrePatientsParTrouble.put(categorie,
        // nombrePatientsParTrouble.getOrDefault(categorie, 0) + 1);
        // totalPatients++;
        // }
        // }
        // }
        // }
        // System.out.println("Pourcentage de patients par trouble:");
        // for (Map.Entry<TroubleCategorie, Integer> entry :
        // nombrePatientsParTrouble.entrySet()) {
        // double pourcentage = (double) entry.getValue() / totalPatients * 100;
        // System.out.println(entry.getKey().name() + ": " + pourcentage + "%");
        // }
    }

    public static void genererCourbesEvolution(FicheSuivi ficheSuivi, String cheminFichier) throws IOException {
        // try (Workbook workbook = new XSSFWorkbook()) {
        // Sheet sheet = workbook.createSheet("CourbesEvolution");
        // int rowNum = 0;
        // Row row = sheet.createRow(rowNum++);
        // row.createCell(0).setCellValue("Objectif");
        // row.createCell(1).setCellValue("% Atteint");

        // for (Objectif objectif : ficheSuivi.getObjectifs()) {
        // row = sheet.createRow(rowNum++);
        // row.createCell(0).setCellValue(objectif.getDescription());
        // row.createCell(1).setCellValue(objectif.getPourcentageAtteint());
        // }

        // // Ajout du pourcentage global à la dernière ligne
        // row = sheet.createRow(rowNum++);
        // row.createCell(0).setCellValue("Pourcentage global");
        // row.createCell(1).setCellValue(ficheSuivi.getPourcentage());

        // // Sauvegarde du fichier Excel
        // try (FileOutputStream fileOut = new FileOutputStream(cheminFichier)) {
        // workbook.write(fileOut);
        // }
        // }
    }

>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    // Setter et getter pour questions
    public HashMap<String, Question> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<String, Question> questions) {
        this.questions = questions;
    }

    // Setter et getter pour exercices
    public HashMap<String, Exercice> getExercices() {
        return exercices;
    }

    public void setExercices(HashMap<String, Exercice> exercices) {
        this.exercices = exercices;
    }

    // Setter et getter pour questionnaires
    public HashMap<String, TestQuestionnaire> getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(HashMap<String, TestQuestionnaire> questionnaires) {
        this.questionnaires = questionnaires;
    }

    // Setter et getter pour testsExercices
    public HashMap<String, TestExercice> getTestsExercices() {
        return testsExercices;
    }

    public void setTestsExercices(HashMap<String, TestExercice> testsExercices) {
        this.testsExercices = testsExercices;
    }

    public TreeMap<Integer, Dossier> getDossiers() {
        return dossiers;
    }

    // Méthode pour retourner une question pour une clé donnée
    public Question getQuestion(String cle) {
        return questions.get(cle);
    }

    // Méthode pour retourner un exercice pour une clé donnée
    public Exercice getExercice(String cle) {
        return exercices.get(cle);
    }

    // Méthode pour retourner un questionnaire pour une clé donnée
    public TestQuestionnaire getQuestionnaire(String cle) {
        return questionnaires.get(cle);
    }

    // Méthode pour retourner un test d'exercice pour une clé donnée
    public TestExercice getTestExercice(String cle) {
        return testsExercices.get(cle);
    }

    // Méthode pour retourner un dossier pour une clé donnée
    public Dossier getDossier(int cle) {
        return dossiers.get(cle);
    }

    public void ajouterTest(Test test) {
        if (test instanceof TestQuestionnaire) {
            questionnaires.put(test.getNom(), (TestQuestionnaire) test);
        } else if (test instanceof TestExercice) {
            testsExercices.put(test.getNom(), (TestExercice) test);
        }
    }

    public void supprimerTest(String nom) {
        if (questionnaires.containsKey(nom)) {
            questionnaires.remove(nom);
        } else if (testsExercices.containsKey(nom)) {
            testsExercices.remove(nom);
        } else {
            System.out.println("Le test avec le nom " + nom + " n'existe pas.");
        }
    }

    public HashMap<String, Test> getTests() {
        HashMap<String, Test> allTests = new HashMap<>();
        allTests.putAll(questionnaires);
        allTests.putAll(testsExercices);
        return allTests;
    }

    public Test getTest(String Nom) {
        for (TestQuestionnaire test : questionnaires.values()) {
            if (test.getNom().equals(Nom)) {
                return test;
            }
        }
        for (TestExercice test : testsExercices.values()) {
            if (test.getNom().equals(Nom)) {
                return test;
            }
        }
        return null;
    }

<<<<<<< HEAD
    public HashMap<TroubleCategorie, ArrayList<Patient>> patientsParTroubles() {
        HashMap<TroubleCategorie, ArrayList<Patient>> patientsParTrouble = new HashMap<>();

        // Initialisation de la map des troubles par catégorie
        for (TroubleCategorie categorie : TroubleCategorie.values()) {
            patientsParTrouble.put(categorie, new ArrayList<>());
        }

        // Parcours des dossiers
        for (Dossier dossier : dossiers.values()) {
            // Récupération de la liste des BO
            ArrayList<BO> bos = dossier.getBos();

            // Parcours des BO
            for (BO bo : bos) {
                // Récupération du diagnostic
                Diagnostic diagnostic = bo.getDiagnostic();

                // Récupération des troubles du diagnostic
                ArrayList<Trouble> troubles = diagnostic.getTroubles();

                // Parcours des troubles
                for (Trouble trouble : troubles) {
                    // Ajout du patient au trouble correspondant
                    patientsParTrouble.get(trouble.getCategorie()).add(dossier.getPatient());
                }
            }
        }
        return patientsParTrouble;
=======
    static public Patient getPatient(int numDossier) {
        return dossiers.get(numDossier).getPatient();
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
    }
}
