package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.interfaces.Omnivore;
import tn.esprit.gestionzoo.Food.Food;
public final class Terrestrial extends Animal implements Omnivore<Food>
{

    private int nbrLegs;

    public Terrestrial() {
    }

    //Instruction 37 : ----------------------------------------------
    @Override
public void eatMeat(Food food) {
    // Logique pour manger de la viande dans le contexte terrestre
    System.out.println("Terrestrial is eating meat.");
}

    @Override
    public void eatPlant(Food food) {
        // Logique pour manger des plantes dans le contexte terrestre
        System.out.println("Terrestrial is eating plant.");
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        // Logique pour manger à la fois de la viande et des plantes dans le contexte terrestre
        System.out.println("Terrestrial is eating both plant and meat.");
    }

//-----------------------------------------------------------------------------

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }




}
