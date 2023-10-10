/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //stack to maintain nodes of both the list
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        
        //Traverse List A
        ListNode p = headA;
        while(p!=null){
            stack1.push(p);
            p = p.next;
        }
        //Traverse List B
        p = headB;
        while(p!=null){
            stack2.push(p);
            p = p.next;
        }
        //make p null
        p = null;
        //pop from stack while node in both stack are same
        while(!stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek() == stack2.peek())){
            p = stack1.pop();
            stack2.pop();
        }
        //return p : null if no intersection ,or, the intersecting node
        return p;

    }
}