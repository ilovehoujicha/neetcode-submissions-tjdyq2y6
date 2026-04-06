/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head, prev = null;
        int counter = 0;

        while (curr != null) {
            counter++;
            curr = curr.next;
        }

        counter = counter - n;
        curr = head;
        
        while (curr != null) {
            ListNode tempnext = curr.next;
            if (counter == 0) {
                if (prev == null) return head.next;
                else prev.next = tempnext;
                break;
            }
            prev = curr; // store prev pointer in case of removal
            curr = tempnext;
            counter--;
        }
        return head;
    }
}
