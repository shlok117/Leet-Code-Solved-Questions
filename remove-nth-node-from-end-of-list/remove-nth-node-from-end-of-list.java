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
        ListNode temp =head;
        ListNode temp2 = head;
        for(int i=1;i<=n;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head.next;
        }
        while(temp.next!=null){
            temp=temp.next;
            temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
}
}