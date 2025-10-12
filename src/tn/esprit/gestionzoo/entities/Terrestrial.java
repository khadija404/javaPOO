package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;
    public Terrestrial() {}

    public Terrestrial(String name, int age, boolean isMammal, String family, int nbrLegs) {
        super(name, age, isMammal, family);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+"nbrLegs="+nbrLegs;
    }
}
