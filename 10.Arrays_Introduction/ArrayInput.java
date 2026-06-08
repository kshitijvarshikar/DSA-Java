import java.util.*;

class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        //Input
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        //Output
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

    }
}
