public class Throw_Keyword {

    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }

        System.out.println("Eligible");
    }
}

// throws → “I may throw exception”
// throw → “I am throwing exception now”
