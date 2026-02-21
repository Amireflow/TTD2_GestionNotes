package sn.etudiant.l2gl.app.model;

public class MathUtils {

    // Calcule la moyenne d'un tableau de notes
    public static double moyenne(double[] valeurs) {
        if (valeurs == null || valeurs.length == 0) {
            throw new IllegalArgumentException("Le tableau de valeurs ne peut pas être null ou vide.");
        }
        double somme = 0;
        for (double v : valeurs) {
            somme += v;
        }
        return somme / valeurs.length;
    }

    // Calcule la moyenne pondérée d'un tableau de Notes
    public static double moyennePonderee(Note[] notes) {
        if (notes == null || notes.length == 0) {
            throw new IllegalArgumentException("Le tableau de notes ne peut pas être null ou vide.");
        }
        double totalPoints = 0;
        double totalCoeff = 0;
        for (Note n : notes) {
            totalPoints += n.points();
            totalCoeff += n.getModule().getCoefficient();
        }
        return totalPoints / totalCoeff;
    }
}
