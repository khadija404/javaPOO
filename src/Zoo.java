public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages=25;
    Zoo(){}
    Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        animals=new Animal[nbrCages];
    }

    void displayZoo(){
        System.out.println("le nom du zoo:"+name+" la ville:"+city+" nombre de cages:"+nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
