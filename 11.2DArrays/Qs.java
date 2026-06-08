import java.util.*;

class Qs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Qs. take an matrix as input from the user. search for a given number x and
        // print the indices at which it occurs
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter Col : ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter X : ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}
