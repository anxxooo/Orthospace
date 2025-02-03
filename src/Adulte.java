
public class Adulte extends Patient {
    private String diplome;
    private String profession;

    // Constructeur
<<<<<<< HEAD
    public Adulte(String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String adresse,
            String numeroTel, String diplome, String profession) {
=======

    public Adulte(String nom, String prenom) {
        super(nom, prenom);
    }
    
    public Adulte(String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String adresse,
             String numeroTel,String diplome, String profession) {
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
        super(nom, prenom, dateDeNaissance, lieuDeNaissance, adresse, numeroTel);
        this.diplome = diplome;
        this.profession = profession;
    }

    // Getters
    public String getDiplome() {
        return diplome;
    }

    public String getProfession() {
        return profession;
    }

    // Setters
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
