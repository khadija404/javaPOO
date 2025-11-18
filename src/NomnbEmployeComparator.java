import java.util.Comparator;

public class NomnbEmployeComparator implements Comparator<Departement> {

    @Override
    public int compare(Departement o1, Departement o2) {
        int nomComparison = o1.getNomDepartement().compareTo(o2.getNomDepartement());
        return Integer.compare(o1.getNombreEmployes(),o2.getNombreEmployes());
    }
}
