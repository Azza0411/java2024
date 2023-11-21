package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>
{
    private ArrayList<Employe> listeEmployes;

    // Constructeur
    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    // Méthodes de l'interface IGestion
    @Override
    public void ajouterEmploye(Employe E) {
        listeEmployes.add(E);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe E) {
        return listeEmployes.contains(E);
    }

    @Override
    public void supprimerEmploye(Employe E) {
        listeEmployes.remove(E);
    }

    @Override
    public void displayEmploye() {
        for (Employe E : listeEmployes) {
            System.out.println(E.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade()
    {
        Collections.sort(listeEmployes, new Comparator<Employe>()
        {
            @Override
            public int compare(Employe emp1, Employe emp2)
            {
                // Comparaison par nom
                int compareNom = emp1.getNom().compareTo(emp2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }

                // Comparaison par département
                int compareDepartement = emp1.getDépartement().compareTo(emp2.getDépartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }

                // Comparaison par grade
                return Integer.compare(emp1.getGrade(), emp2.getGrade());
            }
        });
    }
}
