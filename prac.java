import java.util.*;

public class prac {

    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
    // towerOfHanoi(n - 1, helper, src, dest);

    // }

    // public static void printRev(String str, int idx) {
    // if (idx == 0) {
    // System.out.print(str.charAt(idx));
    // return;
    // }
    // System.out.print(str.charAt(idx) + " ");
    // printRev(str, idx - 1);
    // }

    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element) {
    // if (idx == str.length()) {
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // // char curchar = str.charAt(idx);
    // if (first == -1) {
    // first = idx;
    // } else {
    // last = idx;
    // }
    // findOccurance(str, idx + 1, element);
    // }

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void countX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {

            for (int i = 0; i <= count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);
        if (curChar == 'x') {
            count++;
            countX(str, idx + 1, count, newString);
        } else {
            newString += curChar;
            countX(str, idx + 1, count, newString);
        }
    }

    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char curChar = str.charAt(idx);
    // if (map[curChar - 'a']) {
    // removeDuplicates(str, idx + 1, newString);
    // } else {
    // newString += curChar;
    // map[curChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newString);
    // }
    // }

    // public static void subSequence(String str, int idx, String newString,
    // HashSet<String> set) {
    // if (idx == str.length()) {
    // if (set.contains(newString)) {
    // return;
    // } else {
    // System.out.println(newString);
    // set.add(newString);
    // return;
    // }
    // }
    // char curChar = str.charAt(idx);
    // subSequence(str, idx + 1, newString + curChar, set);
    // subSequence(str, idx + 1, newString, set);
    // }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void maping(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(idx);
        String mapping = keypad[curChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            maping(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        String str = "23";
        maping(str, 0, "");

        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // subSequence(str, 0, "", set);

        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // String str = "axbcxxd";
        // countX(str, 0, 0, "");

        // int arr[] = { 1, 5, 8, 13 };
        // System.out.println(isSorted(arr, 0));

        // String str = "abaacdaefaahaha";
        // findOccurance(str, 0, 'a');

        // String str = "abcd";
        // int idx = str.length() - 1;
        // printRev(str, idx);

        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

    }

}