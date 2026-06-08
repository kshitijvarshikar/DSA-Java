import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Build BST Tree (Insertion)
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // Left Subtree
            root.left = insert(root.left, val);
        } else {
            // right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder Traversal to Verify BST Build Correct or Not. (Inorder always Gives
    // Sequence in BST)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search In BST --> Time Complexity O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        // left subtree
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            // left subtree
            return search(root.right, key);
        }
    }

    // Delete A Node
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root.data == val
                 // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print In Range
    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    // Root to leaf Path
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        // leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else { // Non-Leaf
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // Build BST
        // int values[] = { 5, 1, 3, 4, 2, 7 };

        // Search
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        // Common for All
        Node root = null;

        // Common for All
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Common for All
        inorder(root);
        System.out.println();

        // Search
        // if (search(root, 1)) {
        // System.out.println("found");
        // } else {
        // System.out.println("Not Found");
        // }

        // Delete
        delete(root, 4);
        inorder(root);
        System.out.println();

        // Print in Range
        printInRange(root, 6, 10);
        System.out.println();

        // Print Root To leaf
        printRootToLeaf(root, new ArrayList<>());
    }
}