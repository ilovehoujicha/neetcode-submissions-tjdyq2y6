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
    public boolean hasCycle(ListNode head) {
        ListNode curr_slow = head, curr_fast = head;
        while (curr_fast.next.next != null) {
            curr_slow = curr_slow.next;
            curr_fast = curr_fast.next.next;
            if (curr_slow == curr_fast) return true;
        }
        return false;
    }
}
