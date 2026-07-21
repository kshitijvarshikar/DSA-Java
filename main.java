class LL {

    int size;

    LL() {
        this.size = 0;
    }

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empthy");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    // Reverse --> Iterable
    public void printRev() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse --> Recursively
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }
}

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        // list.printRev();
        // list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}