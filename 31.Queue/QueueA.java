
// Queue Using Array
import java.util.*;

public class QueueA {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpthy() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        // Enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("OverFlow");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue
        // O(n)
        public static int remove() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek
        public static int peek() {
            if (isEmpthy()) {
                System.out.println("Empthy Queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpthy()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
