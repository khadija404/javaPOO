import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement>departements;

    DepartementHashSet() {
        this.departements = new HashSet<>();
    }


    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        Iterator<Departement>iterator=departements.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getNomDepartement().equals(nomDepartement)){
                return true;
            }
            else{
                iterator.next();
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);

    }

    @Override
    public void afficherDepartements() {
        Iterator<Departement> iterator = departements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Override
    public List<Departement> trierDepartementsParId() {
        List<Departement> deps =new ArrayList<>();
        deps.addAll(departements);
        Collections.sort(deps);
        return deps;
    }

    @Override
    public List<Departement>  trierDepartementsParNomEtNombreEmployes() {
        List<Departement> deps =new ArrayList<>();
        deps.addAll(departements);
        Collections.sort(deps,new NomnbEmployeComparator());
        return deps;
    }
}
