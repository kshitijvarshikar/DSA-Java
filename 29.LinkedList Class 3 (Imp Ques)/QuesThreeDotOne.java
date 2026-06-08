public class QuesThreeDotOne {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 🔹 Detect Cycle
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    // 🔹 Remove Cycle
    public void removeCycle(ListNode head) {
        if (head == null)
            return;

        ListNode hare = head;
        ListNode turtle = head;
        boolean cycle = false;

        // Step 1: Detect cycle
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle)
            return;

        // Step 2: Find start of cycle
        turtle = head;
        while (hare != turtle) {
            hare = hare.next;
            turtle = turtle.next;
        }

        // Step 3: Find last node of cycle
        while (hare.next != turtle) {
            hare = hare.next;
        }

        // Step 4: Break cycle
        hare.next = null;
    }

    public static void main(String[] args) {

        QuesThreeDotOne obj = new QuesThreeDotOne();

        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);

        // Create cycle: 4 -> 2
        head.next.next.next.next = head.next;

        // Check cycle
        System.out.println("Cycle Present: " + obj.hasCycle(head));

        // Remove cycle
        obj.removeCycle(head);

        // Check again
        System.out.println("Cycle Present After Removal: " + obj.hasCycle(head));
    }
}