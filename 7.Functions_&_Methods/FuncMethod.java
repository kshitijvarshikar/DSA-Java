import java.util.*;

class FuncMethod {
    // QS.1 Print a given name in a function
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    // QS.2 Calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // QS.3 Calculate the product of two numbers
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    // QS.4 Calculate the factorial of n
    public static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        // loop
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // QS.1 Print a given name in a function
        // System.out.print("Enter Name : ");
        // String name = sc.next();
        // printMyName(name);

        // QS.2 Calculate the sum of two numbers
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("The sum of two number is : " + sum);

        // QS.3 Calculate the product of two numbers
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("The product of two number is : " + calculateProduct(a,
        // b));

        // QS.4 Calculate the factorial of n
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        calculateFactorial(n);

    }

}