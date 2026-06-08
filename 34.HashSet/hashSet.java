import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // ignore

        // Print All Element
        System.out.println(set);

        // Size
        System.out.println("Size of Set is : " + set.size());

        // Search
        if (set.contains(1)) {
            System.out.println("Set Contains");
        }
        if (!set.contains(6)) {
            System.out.println("Does Not Contains");
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We Deleted 1");
        }

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}