import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter op (+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            System.out.println(a / b);
        } else {
            System.out.println(a % b);
        }

    }
}