package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.Food.Food;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {


        Aquatic aquaticAnimal = new Aquatic() {
            @Override
            public void swim() {

            }
        };
        System.out.println("------Test Aquatic-----");
        aquaticAnimal.eatMeat(Food.MEAT);

        Penguin penguin = new Penguin();
        System.out.println("\n------Test Penguin ------");
        penguin.eatMeat(Food.MEAT); // Test de la méthode eatMeat pour Penguin
        penguin.swim();

        Terrestrial terrestrialAnimal = new Terrestrial();
        System.out.println("\n------Test Terrestrial ------");
        terrestrialAnimal.eatMeat(Food.MEAT); // Test de la méthode eatMeat pour Terrestrial
        terrestrialAnimal.eatPlant(Food.PLANT); // Test de la méthode eatPlant pour Terrestrial
        terrestrialAnimal.eatPlantAndMeat(Food.BOTH); // Test de la méthode eatPlantAndMeat pour Terrestrial
    }




//        Animal lion = new Animal();
//        lion.setName("Simba");
//        try {
//            lion.setAge(8);
//        } catch (InvalidAgeException e) {
//            System.out.println(e.getMessage());
//        }
//        lion.setFamily("Cats");
//        lion.setMammal(true);
//
//        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
//        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");
//
//
//        Animal dog = new Animal("Canine", "Snoopy", 2, true);
//
//
//        try {
//            myZoo.addAnimal(lion);
//        } catch (ZooFullException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
//        }
//        try {
//            myZoo.addAnimal(dog);
//        } catch (ZooFullException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
//        }
//
//        myZoo.displayAnimals();
//
//        System.out.println(myZoo.searchAnimal(dog));
//        Animal dog2 = new Animal("Canine", "lll", 2, true);
//        System.out.println(myZoo.searchAnimal(dog2));
//
////           System.out.println(myZoo.removeAnimal(dog));
//        myZoo.displayAnimals();
//
//
//        System.out.println(myZoo);
//
//        try {
//            myZoo.addAnimal(lion);
//        } catch (ZooFullException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
//        }
//
//        myZoo.displayAnimals();
//
//        Dolphin d = new Dolphin();
//        d.setSwimmingSpeed(24.5f);
//        Dolphin d1 = new Dolphin();
//        d1.setSwimmingSpeed(21.8f);
//        Dolphin d2 = new Dolphin();
//        d2.setSwimmingSpeed(20.3f);
//        Dolphin d3 = new Dolphin();
//        d3.setSwimmingSpeed(22.6f);
//
//
//        myZoo.addAquaticAnimal(d);
//        myZoo.addAquaticAnimal(d1);
//        myZoo.addAquaticAnimal(d2);
//        myZoo.addAquaticAnimal(d3);
//        Penguin p = new Penguin();
//        p.setSwimmingDepth(24.6f);
//        Penguin p1 = new Penguin();
//        p1.setSwimmingDepth(29.6f);
//        Penguin p2 = new Penguin();
//        p2.setSwimmingDepth(219.6f);
//        Penguin p3 = new Penguin();
//        p1.setSwimmingDepth(2.6f);
//        myZoo.addAquaticAnimal(p);
//        myZoo.addAquaticAnimal(p1);
//        myZoo.addAquaticAnimal(p2);
//        myZoo.addAquaticAnimal(p3);
//        myZoo.addAquaticAnimal(new Penguin());
//
//        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
//            Aquatic[] aquatics = myZoo.getAquaticAnimals();
//            aquatics[i].swim();
//        }
//
//        myZoo.displayNumberOfAquaticsByType();
//
//        System.out.println(myZoo.maxPenguinSwimmingDepth());
//
//    }

}
