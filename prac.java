
public class prac {
    public static void main(String[] args) {
        int a[] = new int[5];

        System.out.println("Hello Guys");

        // try {
            // int result = 5 / 0;
            // System.out.println(a[8]);
        // } 
        // catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("Tries to access out of bound index");
        // } 
        // catch (ArithmeticException e) {
            // System.out.println("ArithmeticException");
            // System.out.println(e.getStackTrace());
            // System.out.println(e.getMessage());
            // System.out.println(e);
        // }


        // try {
            // int result = 5 / 0;
            // System.out.println(a[8]);
        // } 
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
            // System.out.println("Handling Ecxception");
        // }

        try {
            int result = 5 / 0;
            System.out.println(a[8]);
        } 
        catch (Exception e) {
            System.out.println("Handling Exception");
        }

        System.out.println("Bye Guys");

    }

}
