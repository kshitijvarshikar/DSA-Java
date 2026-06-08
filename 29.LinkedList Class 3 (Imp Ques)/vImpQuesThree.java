// Qs3 :- Given the head of a singly linked list, determine if the linked list has a cycle in it.
public class vImpQuesThree {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; // slow

        while (hare != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        vImpQuesThree obj = new vImpQuesThree();

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);

        // Create cycle: last node points to node with value 2
        head.next.next.next.next = head.next;

        boolean result = obj.hasCycle(head);

        System.out.println(result);
    }
}
