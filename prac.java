import java.util.ArrayList;
import java.util.Collections;

public class prac {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        // ArrayList<Boolean> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(5);
        list.add(2);
        list.add(0);

        System.out.println(list);

        // get
        System.out.println(list.get(1));

        // add in betweem
        list.add(2, 3);
        // System.out.println(list);

        // set
        list.set(0, 1);
        System.out.println(list);

        // delete
        list.remove(0);
        System.out.println(list.size());

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}