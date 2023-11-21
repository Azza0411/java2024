package main;

import entities.Employe;
import entities.SocieteArrayList;

public class EntrepriseManagement
{
    public static void main(String[] args)
    {

        SocieteArrayList societe = new SocieteArrayList();

        Employe E1 = new Employe(1, "Azza", "Hamdi", "Info", 3);
        Employe E2 = new Employe(2, "Sonia", "Laflouf", "Maths", 2);
        Employe E3 = new Employe(3, "Nadia", "Boughattas", "Maths", 1);

        societe.ajouterEmploye(E1);
        societe.ajouterEmploye(E2);
        societe.ajouterEmploye(E3);

        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche d'un employé par nom
        String A = "Azza";
        String B = "Foulena";

        if (societe.rechercherEmploye(A))
        {
            System.out.println("L'employé portant le nom " + A + " a été trouvé.");
        }
        else
        {
            System.out.println("Aucun employé porta le nom " + A + " n'a été trouvé.");
        }

        if (societe.rechercherEmploye(B))
        {
            System.out.println("L'employé portant le nom " + B + " a été trouvé.");
        }
        else
        {
            System.out.println("Aucun employé porta le nom " + B + " n'a été trouvé.");
        }



        // Suppression d'un employé
        societe.supprimerEmploye(E1);

        // Affichage mis à jour des employés
        System.out.println("\nLes employés après suppression :");
        societe.displayEmploye();

        // Tri des employés par ID
        societe.trierEmployeParId();

        // Affichage des employés triés par ID
        System.out.println("\nTri des employés par ID :");
        societe.displayEmploye();

        // Tri des employés par nom, département et grade
        societe.trierEmployeParNomDepartementEtGrade();

        // Affichage des employés triés par nom, département et grade
        System.out.println("\nLTri des employés par nom, département et grade :");
        societe.displayEmploye();
    }


}
