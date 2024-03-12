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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr != null && curr.next != null) {
            int sum = 0;
            ListNode runner = curr.next;
            boolean foundZeroSum = false;

            while (runner != null) {
                sum += runner.val;

                if (sum == 0) {
                    curr.next = runner.next;
                    foundZeroSum = true;
                    break;
                }

                runner = runner.next;
            }

            if (!foundZeroSum) {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
