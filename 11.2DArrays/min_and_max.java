import java.util.*;

public class min_and_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row = sc.nextInt();

        System.out.print("Enter Col: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int findmin = Integer.MAX_VALUE;
        int findmax = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] < findmin) {
                    findmin = arr[i][j];
                }
                if (arr[i][j] > findmax) {
                    findmax = arr[i][j];
                }
            }
        }
        System.out.println("MIN: " + findmin);
        System.out.println("MAX: " + findmax);
    }
}