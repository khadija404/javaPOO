package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin() {}

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public Dolphin(String name, int age, boolean isMammal, String family, String habitat, float swimmingSpeed) {
        super(name, age, isMammal, family, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"swimmingSpeed="+swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming");
    }
}
