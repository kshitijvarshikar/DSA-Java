import java.util.*;

class prac {

    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + curChar);
        }
    }

    public static int countTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int vertically = countTiles(n - m, m);
        int horizontally = countTiles(n - 1, m);

        return vertically + horizontally;
    }

    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }

        // single
        int way1 = callGuest(n - 1);

        // pair
        int way2 = (n - 1) * callGuest(n - 2);

        return way1 + way2;
    }

    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n - 1, subset);

        // add nhi hoga
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

        // int n = 4;
        // int totalPairs = callGuest(n);
        // System.out.println(totalPairs);

        // int n = 4, m = 2;
        // int totalChoice = countTiles(n, m);
        // System.out.println("Total Option is: " + totalChoice);

        // String str = "abc";
        // printPerm(str, "");
    }
}