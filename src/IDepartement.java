import java.util.List;

public interface IDepartement<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String nomDepartement);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void afficherDepartements();
    List<Departement> trierDepartementsParId();
    List<Departement>  trierDepartementsParNomEtNombreEmployes();
}
