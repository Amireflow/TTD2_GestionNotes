package sn.etudiant.l2gl.app.model;

public class Etudiant {

    private static int compteur = 0;

    private String matricule;
    private String nom;

    // Constructeur complet
    public Etudiant(String matricule, String nom) {
        if (matricule == null || matricule.isBlank()) {
            throw new IllegalArgumentException("Le matricule ne peut pas être null ou vide.");
        }
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        this.matricule = matricule;
        this.nom = nom;
        compteur++;
    }

    // Constructeur surchargé (1 paramètre)
    public Etudiant(String matricule) {
        this(matricule, "Inconnu");
    }

    // Getters
    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    // Setter uniquement pour nom
    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        this.nom = nom;
    }

    // Compteur statique
    public static int getCompteur() {
        return compteur;
    }

    // Méthode afficher (version 1)
    public void afficher() {
        System.out.println(matricule + " - " + nom);
    }

    @Override
    public String toString() {
        return "Etudiant{matricule=" + matricule + ", nom=" + nom + "}";
    }
}
