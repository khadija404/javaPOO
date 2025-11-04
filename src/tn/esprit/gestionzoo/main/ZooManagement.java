package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia", "Hammamet",3);

        Animal dolphin = new Dolphin("Flipper", 6, true, "Delphinidae", "Océan", 25.5f);
        Animal penguin = new Penguin("Pingu", 3, false, "Spheniscidae", "Antarctique", 20.0f);
        Animal penguin2 = new Penguin("Pingu", 3, false, "Spheniscidae", "Antarctique", 25.0f);
        Animal penguin3 = new Penguin("Pingu", -1, false, "Spheniscidae", "Antarctique", 25.0f);
        Animal penguin4 = new Penguin("Pingu", -1, false, "Spheniscidae", "Antarctique", 25.0f);
        try{
            myZoo.addAnimal(penguin3);
            System.out.println("le zoo contient:"+myZoo.getCompteur()+"animaux");
        }catch (Exception e){
            e.toString();
        }
        try{
            myZoo.addAnimal(dolphin);
            System.out.println("le zoo contient:"+myZoo.getCompteur()+"animaux");
            myZoo.addAnimal(penguin);
            System.out.println("le zoo contient:"+myZoo.getCompteur()+"animaux");
            myZoo.addAnimal(penguin2);
            System.out.println("le zoo contient:"+myZoo.getCompteur()+"animaux");
            myZoo.addAnimal(penguin4);
            System.out.println("le zoo contient:"+myZoo.getCompteur()+"animaux");

        }catch (Exception e){
            e.toString();
        }





    }

}
