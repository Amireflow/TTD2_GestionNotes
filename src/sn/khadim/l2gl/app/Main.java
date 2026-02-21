package sn.etudiant.l2gl.app;

import sn.etudiant.l2gl.app.model.Etudiant;
import sn.etudiant.l2gl.app.model.Module;
import sn.etudiant.l2gl.app.model.Note;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== TD2 OK - Java fonctionne ===\n");

        // -----------------------------------------------
        // Question 2 : POO niveau 1 - classe Etudiant (v1)
        // -----------------------------------------------
        System.out.println("--- Q2 : Affichage des étudiants ---");
        Etudiant e1 = new Etudiant("2026-001", "Awa");
        Etudiant e2 = new Etudiant("2026-002", "Moussa");
        e1.afficher();
        e2.afficher();

        // -----------------------------------------------
        // Question 3 : Encapsulation + validations
        // -----------------------------------------------
        System.out.println("\n--- Q3 : Test cas invalide (matricule vide) ---");
        try {
            Etudiant eInvalide = new Etudiant("", "Test");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception attendue : " + ex.getMessage());
        }

        // -----------------------------------------------
        // Question 4 : Constructeur surchargé
        // -----------------------------------------------
        System.out.println("\n--- Q4 : Constructeurs surchargés ---");
        Etudiant e3 = new Etudiant("2026-003", "Fatou");  // 2 paramètres
        Etudiant e4 = new Etudiant("2026-004");           // 1 paramètre
        System.out.println(e3);
        System.out.println(e4);

        // -----------------------------------------------
        // Question 5 : Classe Module
        // -----------------------------------------------
        System.out.println("\n--- Q5 : Modules ---");
        Module m1 = new Module("JAVA", "Programmation Java", 2.0);
        Module m2 = new Module("BD", "Bases de données"); // coeff par défaut 1.0
        System.out.println(m1);
        System.out.println(m2);

        // Test module invalide
        try {
            Module mInvalide = new Module("", "Test", 1.0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception attendue : " + ex.getMessage());
        }

        // -----------------------------------------------
        // Question 6 : Classe Note + méthode points()
        // -----------------------------------------------
        System.out.println("\n--- Q6 : Notes ---");
        Note n1 = new Note(e1, m1, 17.5);
        System.out.println("Note valide : " + n1);
        System.out.println("Points (coeff) : " + n1.points());

        // Note invalide
        try {
            Note nInvalide = new Note(e1, m1, 25);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception attendue : " + ex.getMessage());
        }

        // -----------------------------------------------
        // Question 7 : toString() sur tous les objets
        // -----------------------------------------------
        System.out.println("\n--- Q7 : toString() ---");
        System.out.println(e1);
        System.out.println(m1);
        System.out.println(n1);

        // -----------------------------------------------
        // Question 8 : static + bilan final
        // -----------------------------------------------
        System.out.println("\n--- Q8 : Bilan final ---");
        int nbEtudiants = Etudiant.getCompteur();
        double derniereNote = n1.getValeur();
        double points = n1.points();
        System.out.println("BILAN TD2: Etudiants créés: " + nbEtudiants
                + " Dernière note: " + derniereNote + "/20"
                + " Points (coeff): " + points);
    }
}
