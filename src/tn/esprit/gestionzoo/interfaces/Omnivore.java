package tn.esprit.gestionzoo.interfaces;

// Instruction 35 :-------------------------------------------
//interface Omnivore<T> extends Carnivore<T>, Herbivore<T>
//{
//    void eatPlantAndMeat(T food);
//}-------------------------------------------------------------

// Instruction 37 :-------------------------------------------

public interface Omnivore<T> extends Carnivore<T>, Herbivore<T>
{
    void eatPlant(T Food);
    void eatPlantAndMeat(T Food);
}
//---------------------------------------------------------------