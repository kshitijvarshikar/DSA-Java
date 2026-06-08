
// Circular Queue Using Array
import java.util.*;

public class CircularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpthy() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("OverFlow");
                return;
            }
            // if it's the 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue
        // O(1)
        public static int remove() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            int res = arr[front];

            // if only 1 element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        // Peek
        public static int peek() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);

        System.out.println(q.remove());
        q.add(7);
        
        while (!q.isEmpthy()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
