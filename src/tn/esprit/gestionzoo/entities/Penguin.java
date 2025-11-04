package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;
    public Penguin() {}

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public Penguin(String name, int age, boolean isMammal, String family, String habitat, float swimmingDepth) {
        super(name, age, isMammal, family, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+"swimmingDepth="+swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }
}
