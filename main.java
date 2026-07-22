
import java.util.LinkedList;

public class main {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev; // arrow change
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNode middle = findMiddle(head); // 1st half ka end
            ListNode secondHalfStart = reverse(middle.next);

            ListNode firstHalfStart = head;
            while (secondHalfStart != null) {
                if (firstHalfStart.val != secondHalfStart.val) {
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        main obj = new main();

        main.ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);

        main.Solution sol = obj.new Solution();

        boolean result = sol.isPalindrome(head);

        System.out.println(result);

    }
}