import java.util.List;

public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Bejja", "Sarra", "Informatique", 3);
        Employe e2 = new Employe(2, "Khaled", "Ali", "Marketing", 2);
        Employe e3 = new Employe(3, "Ben Salah", "Nour", "Informatique", 4);
        Employe e4 = new Employe(4, "Trabelsi", "Yasmine", "RH", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        societe.displayEmploye();

        System.out.println("\n Recherche par nom 'Bejja' : " + societe.rechercherEmploye("Bejja"));
        System.out.println(" Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNom();
        societe.displayEmploye();

        System.out.println("\n Employés du département 'Informatique' :");
        List<Employe> informatique = societe.rechercherParDepartement("Informatique");
        for (Employe e : informatique) {
            System.out.println(e);
        }
    }


}

