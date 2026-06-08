import java.util.HashSet; //--> to use HashSet

class recursion {

    // Qs1 Tower Of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    // Qs2 Print a String in Reverse
    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }

    // Qs3 Find the 1st & Last Occurance of an Element in String
    public static int first = -1;
    public static int last = -1;

    public static void firstOccurance(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println("First Element a is on index : " + first);
            System.out.println("last Element a is on index : " + last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        firstOccurance(str, index + 1, element);
    }

    // Qs4 Check if an Array is Sorted (Strictly Increasing)
    public static boolean isSorted(int arr[], int index) {
        if (arr[index] == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            // Array Is Sorted
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    // Qs5 Move all "x" to the End of the String
    public static void moveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i <= count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, index + 1, count, newString);
        }
    }

    // Qs6 Remove Duplicates in a String
    public static boolean[] map = new boolean[26]; // Array

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    // Qs7 Print all the Subsequences of a String -- IMPORTANT
    public static void subSequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);

        // to be
        subSequences(str, index + 1, newString + currChar);

        // or not to be
        subSequences(str, index + 1, newString);
    }

    // Qs8 Print all the Unique Subsequences of a String -- IMPORTANT
    // import java.util.HashSet; //--> to use HashSet
    public static void uniqueSubSequence(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(index);

        // to be
        uniqueSubSequence(str, index + 1, newString + currChar, set);

        // or not to be
        uniqueSubSequence(str, index + 1, newString, set);
    }

    // Qs9 Print Keypad Combination
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Qs1 Tower Of Hanoi
        // int n = 2;
        // towerOfHanoi(n, "S", "H", "D");

        // Qs2 Print a String in Reverse
        // String str = "abcd";
        // int index = str.length() - 1;
        // printRev(str, index);

        // Qs3 Find the 1st & Last Occurance of an Element in String
        // String str = "abaacdaefaah";
        // firstOccurance(str, 0, 'a');

        // Qs4 Check if an Array is Sorted (Strictly Increasing)
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));

        // Qs5 Move all "x" to the End of the String
        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");

        // Qs6 Remove Duplicates in a String
        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // Qs7 Print all the Subsequences of a String -- IMPORTANT
        // String str = "abc";
        // subSequences(str, 0, "");

        // Qs8 Print all the Unique Subsequences of a String -- IMPORTANT
        // import java.util.HashSet; //--> to use HashSet
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubSequence(str, 0, "", set);

        // Qs9 Print Keypad Combination
        String str = "23";
        printComb(str, 0, "");
    }
}