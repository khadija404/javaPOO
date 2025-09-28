public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal() {}

    public Animal(String name, int age, boolean isMammal, String family) {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.family = family;
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
