import java.util.*;

public class linkedlistByCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add
        list.add("is");
        list.add("a");
        System.out.println(list);

        // addfirst
        list.addFirst("this");
        System.out.println(list);

        // addlast
        list.addLast("LinkedList");
        System.out.println(list);

        // size
        System.out.println(list.size());

        // get
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // deletion
        // list.remove(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
