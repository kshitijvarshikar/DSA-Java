
//Qs2 :- Given the head of a singly linked list, check whether it is a palindrome or not.
import java.util.*;

public class ImpQuesTwo {
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

        ImpQuesTwo obj = new ImpQuesTwo();

        // Create linked list: 1 -> 2 -> 2 -> 1
        ImpQuesTwo.ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(1);

        // Create Solution object
        ImpQuesTwo.Solution sol = obj.new Solution();

        // Call function
        boolean result = sol.isPalindrome(head);

        System.out.println(result);

    }
}