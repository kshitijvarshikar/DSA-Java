
// Binary Tree (Most Top Comapanies Ask This Qs)
import java.util.*;

public class BuildTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1; // idx starts from -1

        public static Node buildTree(int nodes[]) {
            idx++; // First call → idx = 0
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // PreOrder(Recursive Approach) --> Time Complexity O(n)
    public static void preorder(Node root) {
        if (root == null) {
            return; // if u want null -1, so return -1.
        }
        System.out.print(root.data + " "); // Step 1: Print the current node (ROOT)
        preorder((root.left)); // Step 2: Go to LEFT subtree and repeat same process
        preorder((root.right)); // Step 3: Go to RIGHT subtree and repeat same process
    }

    // InOrder(Recursive Approach) --> Time Complexity O(n)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // PostOrder(Recursive Approach) --> Time Complexity O(n)
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal(Iterable Approach) --> Time Complexity O(n)
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if (curNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    // Count Of Nodes(Recursive Approach)
    // Time Complexity O(n) --> because atleast travel each node at once.
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // Sum Of Nodes(Recursive Approach) --> Time Complexity O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of a Tree(Recursive Approach) --> Time Complexity O(n)
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }

    // Approach 1 : Not Optimized O(n^2)
    // Diameter of a Tree -->
    // Time Complexity O(n^2)
    // beacause 1st travel for diameter, again 2nd travel for heigth
    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // Approach 2 : Optimized O(n)
    // Diameter of a Tree --> Time Complexity O(n)
    static class TreeInfo {
        int hgt;
        int diam;

        TreeInfo(int hgt, int diam) {
            this.hgt = hgt;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.hgt, right.hgt) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.hgt + right.hgt + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); // Now root.data = 1
        // System.out.println(root.data); // Output :- 1

        // preorder(root); // output : 1,2,4,5,3,6

        // inorder(root); // output : 4,2,5,1,3,6

        // postorder(root); // output : 4,5,2,6,3,1

        // levelOrder(root);
        // Output :
        // 1
        // 2 3
        // 4 5 6

        System.out.println(countOfNodes(root)); // Output :- 6

        System.out.println(sumOfNodes(root)); // Output :- 21

        System.out.println(heightOfTree(root)); // Output :- 3

        System.out.println(diameterOfTree(root)); // Output :- 5

        System.out.println(diameter(root).diam); // Output :- 5
    }
}
