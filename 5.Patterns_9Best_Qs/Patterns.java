import java.util.*;

class Patterns {
    public static void main(String[] args) {

        // Qs.1 Print The Pattern
        // *****
        // *****
        // *****
        // *****
        // int n = 4;
        // int m = 5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        // //inner loop
        // for(int j=1; j<=m; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Qs.2 Print The Pattern
        // *****
        // *   *
        // *   *
        // *****
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Qs.3 Print The Pattern
        // *
        // **
        // ***
        // ****
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Qs.4 Print The Pattern
        // ****
        // ***
        // **
        // *
        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Qs.5 Print The Pattern
        //    *
        //   **
        //  ***
        // ****
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // // inner loop -> space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // inner loop -> star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Qs.6 Print The Pattern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Qs.7 Print The Pattern
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // int n = 5;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Qs.7.1 Print The Pattern
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n-i+1; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // Qs.8 Print The Pattern
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int n = 5;
        // int number = 1;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(number+" ");
        // number++;
        // }
        // System.out.println();
        // }

        // Qs.9 Print The Pattern
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
