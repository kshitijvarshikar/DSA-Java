
public class Throw_Keyword {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            getNumberFromArray(a); // show an error because a is declared at below
        } catch (Exception e) {
            System.out.println("Catches the Exception: " + e.getMessage());
        }
    }

    static int getNumberFromArray(int a[]) throws IOException { // I may throw exception
        return a[8];
    }
}

// throws → “I may throw exception”
// throw → “I am throwing exception now”