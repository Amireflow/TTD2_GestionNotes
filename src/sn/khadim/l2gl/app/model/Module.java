package sn.etudiant.l2gl.app.model;

public class Module {

    private String code;
    private String libelle;
    private double coefficient;

    // Constructeur complet
    public Module(String code, String libelle, double coefficient) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Le code ne peut pas être null ou vide.");
        }
        if (libelle == null || libelle.isBlank()) {
            throw new IllegalArgumentException("Le libellé ne peut pas être null ou vide.");
        }
        if (coefficient <= 0) {
            throw new IllegalArgumentException("Le coefficient doit être supérieur à 0.");
        }
        this.code = code;
        this.libelle = libelle;
        this.coefficient = coefficient;
    }

    // Constructeur surchargé (coefficient par défaut = 1.0)
    public Module(String code, String libelle) {
        this(code, libelle, 1.0);
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public String toString() {
        return "Module{code=" + code + ", libelle=" + libelle + ", coefficient=" + coefficient + "}";
    }
}
