class LL {

    int size;

    LL() {
        this.size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    // first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Last
    public void addLast(String data) {
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

    // Print
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

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empthy");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empthy");
            return;
        }
        size--;

        // for some case we have only one element
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // size
    public int getSize() {
        return size;
    }
}

public class linkedlistByManual {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList(); // is --> a --> Null

        list.addLast("list");
        list.printList(); // is --> a --> list --> Null

        list.addFirst("this");
        list.printList(); // this --> is --> a --> list --> Null

        list.deleteFirst();
        list.printList(); // is --> a --> list --> Null

        list.deleteLast();
        list.printList(); // is --> a --> Null

        System.out.println(list.getSize());
        list.addFirst("this"); // 2

        System.out.println(list.getSize()); // 3

    }
}