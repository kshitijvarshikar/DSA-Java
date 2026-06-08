import java.util.*;

class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Qs. take an array as input from the user. search for a given number x and
        // print the index at which it occurs
        System.out.print("Enter Array : ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }

    }
}
