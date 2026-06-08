import java.util.*;

class qs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Qs:- Take an array of Strings input from the user & find the cumulative
        // (combined) length of all those strings.
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        String name[] = new String[size];

        int totLength = 0;

        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
            totLength += name[i].length();
        }
        System.out.println(totLength);
        // Enter Array Size : 3
        // ram
        // shyam
        // dam
        // 11

    }
}
