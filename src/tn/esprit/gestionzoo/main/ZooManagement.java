package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Aquatic frog=new Aquatic("tod",1,false,"amphibian","bogs");
        Terrestrial rat=new Terrestrial("remy",1,true,"Muridae",4);
        Dolphin dolphin=new Dolphin("dodo",2,true,"delphinidae","oceans",35);
        Penguin penguin=new Penguin("emperror penguin",5,false,"Spheniscidae","snow",300);

        System.out.println(frog);
        System.out.println(rat);
        System.out.println(dolphin);
        System.out.println(penguin);

        frog.swim();
        dolphin.swim();
        penguin.swim();
    }

}
