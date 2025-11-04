package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
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

    public abstract void swim();
    /*public  void swim(){
        System.out.println("This aquatic animal is swimming");
    }*/

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, habitat);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;

        return this.getName().equals(other.getName())
                && this.age == other.age
                && this.habitat.equals(other.habitat);
    }
}
