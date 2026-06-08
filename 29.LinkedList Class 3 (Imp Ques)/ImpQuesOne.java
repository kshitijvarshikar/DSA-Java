
// Qs1 :- Given the head of a singly linked list, remove the N-th node from the end(last) of the list and return its head.
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ImpQuesOne {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        // get size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // removing sizeth node from last i.e head
        if (n == size) {
            return head.next;
        }

        // find previous node
        int ptf = size - n; // position to find (i.e 4)
        ListNode prev = head; // previous node
        int cp = 1; // current position

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }
        prev.next = prev.next.next; // 3->4->5 ----> 3-->4
        return head;
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ImpQuesOne obj = new ImpQuesOne();
        head = obj.removeNthFromEnd(head, 2);

        // Print result
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
