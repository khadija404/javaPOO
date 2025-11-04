package tn.esprit.gestionzoo.entities;
import java.util.Arrays;

public class Zoo {
    private Animal[] animals;
    private static final int MAX_AQUATIC = 10;
    private Aquatic[] aquaticAnimals=new Aquatic[MAX_AQUATIC];
    private String name;
    private String city;
    private static final int NBRCAGES=25;
    private int compteur=0;
    private int compteurAquatic = 0;



    public Zoo(){}
    public  Zoo(String name,String city){
        this.name=name;
        this.city=city;
        animals=new Animal[NBRCAGES];
    }

    public int getCompteurAquatic() {
        return compteurAquatic;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setName(String name) {
        if(name.trim().isEmpty()){
            System.out.println("le nom du zoo ne peut pas etre vide");
        }
        this.name = name;
    }

    public void displayZoo(){
        System.out.println("le nom du zoo:"+name+" la ville:"+city+" nombre de cages:"+NBRCAGES);
    }
    public void displayAnilmals(){
        for (int i = 0; i <compteur ; i++) {
            System.out.println(animals[i]);
        }

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBRCAGES +
                '}';
    }

    public boolean addAnimal(Animal animal){
        if(!isZooFull() && searchAnimal(animal)==-1){
            this.animals[compteur]=animal;
            compteur++;
            return true;
        }
        return false;
    }
    public int searchAnimal(Animal animal){
        for (int i = 0; i < compteur; i++) {
            if(animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index!=-1){
            for (int i = index; i < compteur-1; i++) {
                animals[i]=animals[i+1];
            }
            animals[compteur-1]=null;
            compteur--;
            return true;
        }
        return false;
    }
    public boolean isZooFull(){
        if(compteur<NBRCAGES){
            return false;
        }
        return true;
    }

    public Zoo compareZoo(Zoo z1, Zoo z2){
        if(z1.compteur>z2.compteur){
            return z1;
        }
        return z2;
    }

    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (compteurAquatic >= MAX_AQUATIC) {
            System.out.println("Impossible d'ajouter : le zoo a atteint le maximum d'animaux aquatiques !");
            return false;
        }
        aquaticAnimals[compteurAquatic] = aquatic;
        compteurAquatic++;
        System.out.println(aquatic.getName() + " a été ajouté dans la section aquatique !");
        return true;
    }



    public float getMaxPenguinDepth() {
        float maxDepth = 0;
        for (int i = 0; i < compteurAquatic; i++) {
            if (aquaticAnimals[i] instanceof Penguin p) {
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < compteurAquatic; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


}

