import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages=20;
        String zooName="my zoo";
        System.out.println(zooName+" comporte "+nbrCages+" cages");
        Scanner obj = new Scanner(System.in);

        do {// Create a Scanner object
            System.out.println("saisir le nom du zoo");
            zooName=obj.nextLine();
        }while (zooName.isEmpty());


        do {  // Create a Scanner object
            System.out.println("saisir le nombre des cages");
            nbrCages=obj.nextInt();
        }while (nbrCages<0);

        System.out.println(zooName+" comporte "+nbrCages+" cages");
    }
}
