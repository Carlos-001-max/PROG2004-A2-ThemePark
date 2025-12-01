import java.util.Comparator;
/**
 * Comparator for sorting visitors by name and age
 */
public class VisitorComparator implements Comparator<Visitor> {
    /**
     * Compare two visitors by name and age
     */
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int nameCompare = v1.getName().compareTo(v2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}