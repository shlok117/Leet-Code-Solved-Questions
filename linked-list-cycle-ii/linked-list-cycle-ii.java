/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Boolean loopEx = false;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                loopEx = true;
                break;
            }
        }
        if(loopEx){
            slow= head;
            while(slow!=fast){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
        return null;
    }
}