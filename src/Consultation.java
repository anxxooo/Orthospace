public class Consultation extends RDV {
    private String duree;
    static private Patient patient;
    private BOpremierRDV bo;

    public Consultation(String heure, String date, String nom, String prenom, int age) {
        super(heure, date);
        if (age >= 18) {
            this.duree = "1h30";
            this.patient = new Adulte(nom, prenom);
        } else {
            this.duree = "2h30";
            this.patient = new Enfant(nom, prenom);
        }
        this.bo = new BOpremierRDV();
    }

    static public Patient getPatient() {
        return patient;
    }
}
