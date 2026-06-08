class compareFunc {
    public static void main(String[] args) {
        // Compare Strings are Equal or Not-Equal
        String name1 = "kshitij";
        String name2 = "kshitij";
        // String name2 = "kkshitij";

        // str1 = cello ,
        // str2 = hello
        // str1 < str2 --> Because Alphabetically c < h

        // Comparing Cases -->
        // str1 > str2 = +ve value
        // str1 == str2 = 0 value
        // str1 < str2 = -ve value

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("String is Equal");
        // } else {
        // System.out.println("String is Not Equal");
        // }

        // Or both are same but this method fails in some cases
        if (name1 == name2) {
            System.out.println("String is Equal");
        } else {
            System.out.println("String is Not Equal");
        }

        // == --> Fails Case - Because String Is Object
        if (new String("ravi") == new String("Ravi")) {
            System.out.println("String is Equal");
        } else {
            System.out.println("String is Not Equal");
        }

    }
}
