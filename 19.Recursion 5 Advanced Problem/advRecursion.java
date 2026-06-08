import java.util.ArrayList;

class advRecursion {
    // Qs1 Print all Permuations of a String
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc" --> if a chose "bc", if b chose "ac", if c chose "ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currChar);
        }
    }

    // Qs2 Count Total Paths in a Maze to Move from (0,0) to (n,m)
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);

        // move right
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    // Qs3 Place Tiles of Size 1xm in a Floor of size nxm
    public static int printTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int vertPlacements = printTiles(n - m, m);

        // horizontally
        int horPlacements = printTiles(n - 1, m);

        return vertPlacements + horPlacements;
    }

    // Qs4 Find the Number of ways in which you can invite n people to your party,
    // single or in pairs
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = callGuests(n - 1);

        // pair
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }

    // Qs5 Print all the subsets of a set of first n natural numbers
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
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
        // Qs1 Print all Permuations of a String
        // String str = "abc";
        // printPerm(str, "");

        // Qs2 Count Total Paths in a Maze to Move from (0,0) to (n,m)
        // int n = 3, m = 3;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println(totalPaths);

        // Qs3 Place Tiles of Size 1xm in a Floor of size nxm
        // int n = 4, m = 2;
        // int totalTiles = printTiles(n, m);
        // System.out.println(totalTiles);

        // Qs4 Find the Number of ways in which you can invite n people to your party,
        // single or in pairs
        // int n = 4;
        // System.out.println(callGuests(n));

        // Qs5 Print all the subsets of a set of first n natural numbers
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>(); // to use this --> import java.util.ArrayList;
        findSubsets(n, subset);
    }
}