package sn.etudiant.l2gl.app.model;

public class Note {

    private Etudiant etudiant;
    private Module module;
    private double valeur;

    // Constructeur
    public Note(Etudiant e, Module m, double valeur) {
        if (e == null) {
            throw new IllegalArgumentException("L'étudiant ne peut pas être null.");
        }
        if (m == null) {
            throw new IllegalArgumentException("Le module ne peut pas être null.");
        }
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 20. Valeur reçue : " + valeur);
        }
        this.etudiant = e;
        this.module = m;
        this.valeur = valeur;
    }

    // Getters
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Module getModule() {
        return module;
    }

    public double getValeur() {
        return valeur;
    }

    // Setter uniquement pour valeur
    public void setValeur(double valeur) {
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 20. Valeur reçue : " + valeur);
        }
        this.valeur = valeur;
    }

    // Méthode métier
    public double points() {
        return valeur * module.getCoefficient();
    }

    @Override
    public String toString() {
        return "Note{etudiant=" + etudiant.getMatricule()
                + ", module=" + module.getCode()
                + ", valeur=" + valeur
                + ", points=" + points() + "}";
    }
}
