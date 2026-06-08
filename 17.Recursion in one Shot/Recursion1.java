class Recursion1 {
    // Qs1 Print Numbers From 5 to 1
    public static void printNumOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumOne(n - 1);
    }

    // Qs2 Print Numbers From 1 to 5
    public static void printNumTwo(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumTwo(n + 1);

    }

    // Qs3 Print Sum Of First n Natural Numbers
    public static void printSumOfN(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSumOfN(i + 1, n, sum);
    }

    // Qs4.1 Print Factorial of n Numbers
    public static void printFactOfN(int i, int n, int fact) {

        if (i == n) {
            fact *= i;
            System.out.println(fact);
            return;
        }
        fact *= i;
        printFactOfN(i + 1, n, fact);
    }

    // Qs4.2 Print Factorial of n Numbers
    public static int calculateFact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calculateFact(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    // Qs5 Print the Fibonacci Sequence till nth Term
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    // Qs6 Print x^n (stack heigth = n)
    public static int calPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        int xPownm1 = calPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    // Qs7 Print x^n (stack heigth = logn)
    public static int calPowerLogn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calPowerLogn(x, n / 2) * calPowerLogn(x, n / 2);
        } else {
            return calPowerLogn(x, n / 2) * calPowerLogn(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        // Qs1 Print Numbers From 5 to 1
        // int n = 5;
        // printNumOne(n);

        // Qs2 Print Numbers From 1 to 5
        // int n = 1;
        // printNumTwo(n);

        // Qs3 Print Sum Of First n Natural Numbers
        // printSumOfN(1, 5, 0);

        // Qs4.1 Print Factorial of n Numbers
        // printFactOfN(1, 5, 1);

        // // Qs4.2 Print Factorial of n Numbers
        // int n = 5;
        // int ans = calculateFact(n);
        // System.err.println(ans);

        // Qs5 Print the Fibonacci Sequence till nth Term
        // int a = 0, b = 1;
        // System.out.print(a+" ");
        // System.out.print(b+" ");
        // int n = 7;
        // printFib(a, b, n - 2);

        // Qs6 Print x^n (stack heigth = n)
        // int x = 2, n = 5;
        // int ans = calPower(x, n);
        // System.err.println(ans);

        // Qs7 Print x^n (stack heigth = logn)
        int x = 2, n = 5;
        int ans = calPowerLogn(x, n);
        System.err.println(ans);
    }
}

