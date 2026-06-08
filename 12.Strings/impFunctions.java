import java.util.*;

//InBuild Functions In Java
class impFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String Concatenation
        String name = "Kshitij";
        String lastname = "Varshikar";
        // String fullname = name + lastname; //KshitijVarshikar
        String fullname = name + " " + lastname; // Space--> Kshitij Varshikar
        System.out.println(fullname);

        // Length
        System.out.println(fullname.length()); // Kshitij Varshikar --> 17

        // charAt[0]-->Each Index
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " ");
        }
    }

}
