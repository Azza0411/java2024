package entities;

import java.util.Objects;

public class Employe implements Comparable<Employe>
{
    int identifiant;
    String Nom;
    String Prenom;
    String Département;
    int Grade;

   public Employe(){};
    public Employe( int A, String B,String C,String D,int E)
    {
        this.identifiant=A;
        this.Nom=B;
        this.Prenom=C;
        this.Département=D;
        this.Grade=E;
    }

    public int getIdentifiant()
    {
        return identifiant;
    }

    public void setIdentifiant(int X)
    {
        this.identifiant = X;
    }


    public String getNom()
    {
        return Nom;
    }

    public void setNom(String X)
    {
        this.Nom=X;
    }

    public String getPrenom()
    {
        return  Prenom;
    }

    public void setPrenom(String X)
    {
        this.Prenom=X;
    }

    public String getDépartement()
    {
        return Département;
    }

    public void setDépartement(String X)
    {
        this.Département=X;
    }

    public int getGrade()
    {
        return  Grade;
    }

    public void setGrade(int X)
    {
        this.Grade=X;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return identifiant == employe.identifiant && Grade == employe.Grade && Objects.equals(Nom, employe.Nom) && Objects.equals(Prenom, employe.Prenom) && Objects.equals(Département, employe.Département);
    }



    @Override
    public String toString()
    {
        return "Caractéristiques de l'employé :{" +
                "identifiant :" + identifiant +
                ", Nom : " + Nom + '\'' +
                ", Prenom : '" + Prenom + '\'' +
                ", Département : '" + Département + '\'' +
                ", Grade : " + Grade +
                '}';
    }


    @Override
    public int compareTo(Employe emp)
    {
        return Integer.compare(this.identifiant, emp.identifiant);
    }


}
