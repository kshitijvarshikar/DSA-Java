import java.util.*;

import org.w3c.dom.Node;

public class trieQues {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a-z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // Insert --> O(L)->wordLength
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // O(L)-->wordLength
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    // Search --> O(L)->Key Length
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // Question 1 : Word Break Problem
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    // Question 2 : StartsWith Problem
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // Question 3 : Count Unique Substrings
    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    // Question 4 : Longest Word with all Prefix
    public static String ans = " ";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {

        // Question 1 : Word Break Problem
        // String words[] = { "i", "like", "sam", "samsung", "mobile" };
        // String key = "ilikesamsung";
        // for (int i = 0; i < words.length; i++) {
        // insert(words[i]);
        // }
        // System.out.println(wordBreak(key));

        // Question 2 : StartsWith Problem
        // String words[] = { "apple", "app", "mango", "man", "women" };
        // String prefix = "app";
        // for (int i = 0; i < words.length; i++) {
        // insert(words[i]);
        // }
        // System.out.println(startsWith(prefix));

        // Question 3 : Count Unique Substrings
        // String str = "ababa";
        // for (int i = 0; i < str.length(); i++) {
        // String suffix = str.substring(i);
        // insert(suffix);
        // }
        // System.out.println(countNode(root));

        // Question 4 : Longest Word with all Prefix
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}