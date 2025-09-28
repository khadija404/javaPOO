import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Animal fennec =new Animal("labib",2,true,"canidés");
        Animal chacal =new Animal("kalila",4,true,"canidés");
        Animal taureau =new Animal("chatraba",4,true,"bovidés");
        Zoo myzoo= new Zoo("belvedere","tunis",20);

        myzoo.displayZoo();
        System.out.println(myzoo) ;
        System.out.println(myzoo.toString());
        System.out.println(fennec);
    }
}
