import java.util.ArrayList;
import java.util.Collections;

public class mainArrayList {
    public static void main(String[] args) {
        // Starting From Capital Letters. In ArrayList Because ArrayList Object ki honi
        // vali hai.
        // Integer | Float | String | Boolean

        // ArrayList<String> list1 = new ArrayList<String>(); // -> String ArrayList
        // ArrayList<Boolean> list2 = new ArrayList<>(); // -> Boolean ArrayList

        ArrayList<Integer> list = new ArrayList<Integer>(); // -> Integer ArrayList

        // Add Element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list); // Output :- [0, 2, 3]

        // Get Element
        int element = list.get(0);
        System.out.println(element); // Output :- 0

        // Add Element in Between
        list.add(1, 1);
        System.out.println(list); // Output :- [0, 1, 2, 3]

        // Set Element
        list.set(0, 5);
        System.out.println(list); // Output :- [5, 1, 2, 3]

        // Delete/Remove Element
        list.remove(3);
        System.out.println(list); // Output :- [5, 1, 2]

        // Size
        int size = list.size();
        System.out.println(size); // Output :- 3

        // Loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " "); // Output :- 5 1 2
        }

        // Sorting -> import java.util.Collections;
        Collections.sort(list); // Ascending sort
        System.out.print(list + " "); // Output :- [1, 2, 5]
    }
}