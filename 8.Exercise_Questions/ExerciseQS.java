import java.util.*;

class ExerciseQS {

    // 1. Enter 3 numbers from the user & make a function to print their average.
    public static int findAvg(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOdd(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        return oddSum;

    }

    // 3. Write a function which takes in 2 numbers and returns the greater of those
    // two.
    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 4. Write a function that takes in the radius as input and returns the
    // circumference of a circle.
    public static double circumferenceOfCircle(double radius) {
        return 2 * 3.14 * radius;
    }

    // 5. Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    public static String voteOrNot(int age) {
        if (age >= 18) {
            // return true; --> use boolean
            return "Elligible"; // --> use String
        } else {
            // return false;
            return "Not-Elligible";
        }
    }

    // 8. Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. x^n
    public static int calculatePower(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;

    }

    // 9. Write a function that calculates the Greatest Common Divisor of 2
    // numbers.(BONUS)
    public static int calculateGCD(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Enter 3 numbers from the user & make a function to print their average.
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // System.out.print("Enter c : ");
        // int c = sc.nextInt();
        // System.out.println("The Average Of 3 Numbers is : " + findAvg(a, b, c));

        // 2. Write a function to print the sum of all odd numbers from 1 to n.
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // System.out.println("The Sum Of Odd Numbers is : " + sumOfOdd(n));

        // 3. Write a function which takes in 2 numbers and returns the greater of those
        // two.
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // int result = maxOfTwo(a, b);
        // System.out.println("The Greater Of Those Two is : " + result);

        // 4. Write a function that takes in the radius as input and returns the
        // circumference of a circle.
        // System.out.print("Enter radius : ");
        // int radius = sc.nextInt();
        // System.out.println("The Circumference Of Circle is : " +
        // circumferenceOfCircle(radius));

        // 5. Write a function that takes in age as input and returns if that person is
        // eligible to vote or not. A person of age > 18 is eligible to vote.
        // System.out.print("Enter age : ");
        // int age = sc.nextInt();
        // System.out.println("The Person Is " + voteOrNot(age));

        // 6. Write an infinite loop using do while condition.
        // int n = 5;
        // int i = 2;
        // do{
        // System.out.println("Hello");
        // i++;
        // } while(i<=i);

        // 7. Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered.
        // int num;
        // int positive = 0, negative = 0, zero = 0;
        // char choice;

        // do {
        // System.out.print("Enter num : ");
        // num = sc.nextInt();

        // if (num > 0) {
        // positive++;
        // } else if (num < 0) {
        // negative++;
        // } else {
        // zero++;
        // }

        // System.out.print("Do You Want To Continue (y/n) : ");
        // choice = sc.next().charAt(0);

        // } while (choice == 'y' || choice == 'Y');
        // System.out.println("Positive Number is : " + positive);
        // System.out.println("Negative Number is : " + negative);
        // System.out.println("Zeros Number is : " + zero);

        // 8. Two numbers are entered by the user, x and n. Write a function to find the
        // value of one number raised to the power of another i.e. x^n
        // System.out.print("Enter x : ");
        // int x = sc.nextInt();
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // System.out.println("x power n is : " + calculatePower(x, n));

        // 9. Write a function that calculates the Greatest Common Divisor of 2
        // numbers.(BONUS)
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // System.out.println("GCD is : " + calculateGCD(a, b));

        // 10. Write a program to print Fibonacci series of n terms where n is input by
        // user:
        // 0 1 1 2 3 5 8 1 3 2 1
        // In the Fibonacci series, a number is the sum of the previous 2 numbers that
        // came before it.(BONUS)
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // if (n == 0)
        // System.out.println(0);
        // if (n == 1)
        // System.out.println(1);

        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }

}