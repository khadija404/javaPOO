import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBRCAGES=25;
    int compteur=0;
    Zoo(){}
    Zoo(String name,String city){
        this.name=name;
        this.city=city;
        animals=new Animal[NBRCAGES];
    }

    void displayZoo(){
        System.out.println("le nom du zoo:"+name+" la ville:"+city+" nombre de cages:"+NBRCAGES);
    }
    void displayAnilmals(){
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

    boolean addAnimal(Animal animal){
        if(compteur<NBRCAGES && searchAnimal(animal)==-1){
            this.animals[compteur]=animal;
            compteur++;
            return true;
        }
        return false;
    }
    int searchAnimal(Animal animal){
        for (int i = 0; i < compteur; i++) {
            if(animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
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
    boolean isZooFull(){
        if(compteur<NBRCAGES){
            return false;
        }
        return true;
    }

    Zoo compareZoo(Zoo z1,Zoo z2){
        if(z1.compteur>z2.compteur){
            return z1;
        }
        return z2;
    }
}
