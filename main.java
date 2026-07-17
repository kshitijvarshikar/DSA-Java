import java.util.*;

public class main {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = next;
        }
    }

    // add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addlast(String data) {
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

    // print
    public void print() {
        if (head == null) {
            System.out.println("List is empthy");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    // deletefirst
    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empthy");
            return;
        }
        head = head.next;
    }

    // deletelast
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empthy");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLatNode = head;
        Node lasNode = head.next;
        while (lasNode.next != null) {
            lasNode = lasNode.next;
            secondLatNode = secondLatNode.next;
        }

        secondLatNode.next = null;
    }

    public static void main(String[] args) {
        main ll = new main();
        ll.addfirst("a");
        ll.addfirst("is");
        ll.print();

        ll.addlast("list");
        ll.print();

        ll.deletelast();
        ll.print();
        ll.deletefirst();
        ll.print();

    }
}