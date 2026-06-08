import java.util.*;

public class UserInput {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in); // System.in --> for Input

        // String name = sc.next(); // if we give input "kshitij varshikar" but we only
        // get "kshitij"
        // String name = sc.nextLine(); // if we give input "kshitij varshikar" now we
        // get "kshitij varshikar"

        // System.out.println(name); //we give input

        // nextInt() --> used to take integer type input
        // nextFloat() --> used to take Float type input

        // QS : Print Sum of A and B.
        // Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
