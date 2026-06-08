import java.util.*;

//Qs. Find the maximum largest number & minimum smallest in an integer array.
class SmallandLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        // Array Creation
        int findMinMax[] = new int[size];

        System.out.print("Enter Elements : ");

        // input from user
        for (int i = 0; i < size; i++) {
            findMinMax[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Output
        for (int i = 0; i < size; i++) {
            if (findMinMax[i] < min) {
                min = findMinMax[i];
            }
            if (findMinMax[i] > max) {
                max = findMinMax[i];
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);

    }
}