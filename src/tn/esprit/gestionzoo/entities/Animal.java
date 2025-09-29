package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String name, int age, boolean isMammal, String family) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<=0){
            System.out.println("l'age ne peut pas etre negative");
        }
        this.age = age;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
