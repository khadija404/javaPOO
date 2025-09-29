package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Animal fennec =new Animal("labib",-1,true,"canidés");
        Animal chacal =new Animal("kalila",4,true,"canidés");
        Animal taureau =new Animal("chatraba",4,true,"bovidés");
        Zoo myzoo= new Zoo("belvedere","tunis");

        myzoo.addAnimal(fennec);
        System.out.println("l'indice de l'animal ajoute est: "+myzoo.searchAnimal(fennec));

        Animal renard =new Animal("labib",2,true,"canidés");
        System.out.println("recherche d'un animal identique non ajoute: "+myzoo.searchAnimal(renard));

        System.out.println("l'ajout a ete effectue avec succes: "+myzoo.addAnimal(fennec));
        myzoo.addAnimal(chacal);
        myzoo.addAnimal(taureau);

        myzoo.displayAnilmals();
        myzoo.removeAnimal(taureau);
        myzoo.displayAnilmals();
        System.out.println("le zoo est complet: "+myzoo.isZooFull());


        Zoo zoo= new Zoo("monZoo","tunis");
        zoo.addAnimal(fennec);
        zoo.addAnimal(taureau);
        System.out.println("leplus grand des deux zoo est: "+zoo.compareZoo(zoo,myzoo));

    }

}
