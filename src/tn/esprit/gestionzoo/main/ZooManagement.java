package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia", "Hammamet");

        Aquatic dolphin = new Dolphin("Flipper", 6, true, "Delphinidae", "Océan", 25.5f);
        Aquatic penguin = new Penguin("Pingu", 3, false, "Spheniscidae", "Antarctique", 20.0f);
        Aquatic penguin2 = new Penguin("Pingu", 3, false, "Spheniscidae", "Antarctique", 25.0f);

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin2);

        for (int i = 0; i <myZoo.getCompteurAquatic() ; i++) {
            myZoo.getAquaticAnimals()[i].swim();
        }
        System.out.println(myZoo.getMaxPenguinDepth());
        myZoo.displayNumberOfAquaticByType();


    }

}
