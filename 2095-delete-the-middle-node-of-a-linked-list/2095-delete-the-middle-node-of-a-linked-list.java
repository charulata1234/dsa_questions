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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int length=0;

        if(head.next==null) return null; //for single element

        while(temp!=null){
            length++;
            temp=temp.next;
        }
        length/=2;
        temp=head;
        
        while(length>1){
            temp=temp.next;
            length--;
        }
        if(temp.next!=null)temp.next=temp.next.next;
        return head;
    }
}