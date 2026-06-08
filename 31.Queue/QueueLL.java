
// Queue Using LinkedList
import java.util.*;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpthy() {
            return head == null && tail == null;
        }

        // Enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpthy()) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Dequeue
        public static int remove() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            int front = head.data;
            // Single Node
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpthy()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
