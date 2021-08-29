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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s1= new Stack<Integer>();
        ListNode temp = head;
        while(temp!=null){
            s1.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            int temp1=s1.peek();
            s1.pop();
            if(temp1!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}