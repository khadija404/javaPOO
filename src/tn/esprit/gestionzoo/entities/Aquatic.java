package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    private String habitat;

    public Aquatic() {}

    public Aquatic(String name, int age, boolean isMammal, String family, String habitat) {
        super(name, age, isMammal, family);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+"habitat="+habitat;
    }

    public  void swim(){
        System.out.println("This aquatic animal is swimming");
    }
}
