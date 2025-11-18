import java.util.HashSet;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Departement d1=new Departement(1,"dep",11);
        Departement d2=new Departement(2,"adep",12);
        Departement d3=new Departement(3,"dep",12);
        Departement d4=new Departement(4,"dep",14);
        Departement d5=new Departement(5,"random",16);

        DepartementHashSet deps=new DepartementHashSet();
        deps.ajouterDepartement(d1);
        deps.ajouterDepartement(d2);
        deps.ajouterDepartement(d3);
        deps.ajouterDepartement(d4);

        System.out.println(deps.rechercherDepartement("zzz"));
        System.out.println(deps.rechercherDepartement("dep5"));

        System.out.println(deps.rechercherDepartement(d1));
        System.out.println(deps.rechercherDepartement(d5));

        deps.ajouterDepartement(d5);
        deps.afficherDepartements();
        deps.supprimerDepartement(d5);
        System.out.println("-----------------------");
        deps.afficherDepartements();


        System.out.println("-----------------------");
        System.out.println(deps.trierDepartementsParId());


        System.out.println("-----------------------");
        System.out.println(deps.trierDepartementsParNomEtNombreEmployes());
    }


}

