import java.util.*;

class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // STRING DECLARATION
        // String name = "Kshitij";
        // String fullname = "Kshitij Varshikar";
        // String sentence = "My name is Kshitij Varshikar";
        // System.out.println(name);
        // System.out.println(fullname);
        // System.out.println(sentence);

        // INPUT IN STRING
        System.out.print("Enter String : ");
        // String str = sc.next(); // input(ra vi)-->output(ra)
        String str = sc.nextLine(); // input(ra vi)-->output(ra vi)

        System.out.println("Your Name is : " + str);

    }
}

// Note -->
// 1.String is Immutable means we cannot change delete or update string once it
// store in memory
// 2. if u want to change string so u have to create another string and changed
// what changes you want