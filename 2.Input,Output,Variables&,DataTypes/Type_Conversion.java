public class Type_Conversion {

    public static void main(String[] args) {

        // Widening Type Conversion (Automatic Conversion)
        // byte -> int
        byte b = 127;
        int a = b;
        System.out.println(b);
        System.out.println(a);

        // Narrowing Type Conversion (Explicit Casting)
        // int -> byte
        int aa = 257;
        byte k = (byte) aa;
        System.out.println(k); // Output: 1 (257 % 256 = 1)

        // Float to Int Type Casting
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t); // Output: 5

        // int -> byte Casting
        int a2 = 2567;
        byte b2 = (byte) a2;
        System.out.println(b2); // Output: 7 (2567 % 256 = 7)

        // Type Promotion
        // byte values are converted to int before multiplication
        byte a3 = 10;
        byte b4 = 20;
        int z = a3 * b4;
        System.out.println(z); // Output: 200
    }
}