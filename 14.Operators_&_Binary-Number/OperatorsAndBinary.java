public class OperatorsAndBinary {

    public static void main(String[] args) {

        // 1. ARITHMETIC OPERATORS
        // + - * / %
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        // 2. RELATIONAL OPERATORS
        // > < >= <= == !=
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // 3. LOGICAL OPERATORS
        // && || !
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // 4. ASSIGNMENT OPERATORS
        // = += -= *= /= %=
        int c = 5;

        System.out.println("\nAssignment Operators:");
        c += 3; // c = c + 3
        System.out.println("c += 3 : " + c);

        c -= 2; // c = c - 2
        System.out.println("c -= 2 : " + c);

        c *= 4; // c = c * 4
        System.out.println("c *= 4 : " + c);

        c /= 2; // c = c / 2
        System.out.println("c /= 2 : " + c);

        // 5. UNARY OPERATORS
        // ++ --
        int d = 7;

        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);

        System.out.println("d++ : " + (d++)); // Post Increment
        System.out.println("After d++ : " + d);

        System.out.println("++d : " + (++d)); // Pre Increment

        System.out.println("d-- : " + (d--)); // Post Decrement
        System.out.println("--d : " + (--d)); // Pre Decrement

        // 6. BITWISE OPERATORS (Binary Operations)
        // & | ^ ~
        int p = 5; // Binary: 0101
        int q = 3; // Binary: 0011

        System.out.println("\nBitwise Operators:");
        System.out.println("p & q : " + (p & q)); // AND
        System.out.println("p | q : " + (p | q)); // OR
        System.out.println("p ^ q : " + (p ^ q)); // XOR
        System.out.println("~p : " + (~p)); // NOT

        // 7. SHIFT OPERATORS (Binary Shifting)
        // << >> >>>
        int num = 8; // Binary: 1000

        System.out.println("\nShift Operators:");
        System.out.println("num << 1 : " + (num << 1)); // Left Shift
        System.out.println("num >> 1 : " + (num >> 1)); // Right Shift

        // 8. DECIMAL TO BINARY CONVERSION
        int number = 10;

        System.out.println("\nDecimal to Binary:");
        System.out.println("Binary of 10 = " + Integer.toBinaryString(number));

        // 9. BINARY TO DECIMAL
        String binary = "1010";

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("\nBinary to Decimal:");
        System.out.println("Decimal of 1010 = " + decimal);

    }
}