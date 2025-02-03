<<<<<<< HEAD
import java.io.Serializable;

public class Trouble implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    private TroubleCategorie categorie;

    public Trouble(String nom, TroubleCategorie categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    // Getters et setters

=======
public class Trouble {
    private String nom;
    private TroubleCategorie categ;

    public Trouble(String nom, TroubleCategorie categ) {
        this.nom = nom;
        this.categ = categ;
    }

>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
    public String getNom() {
        return nom;
    }

<<<<<<< HEAD
    public void setNom(String nom) {
        this.nom = nom;
    }

    public TroubleCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(TroubleCategorie categorie) {
        this.categorie = categorie;
    }
}
=======
    public TroubleCategorie getCateg() {
        return categ;
    }
}
>>>>>>> 650116fcc5fd3d945970ae3151d206b64ea48573
