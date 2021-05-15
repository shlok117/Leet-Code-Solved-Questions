class Solution 
{
    public ListNode removeElements(ListNode head, int val) 
    {
        while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode temp = head;
        if(head == null) {
            return head;   
        }
        else
        {
            while(temp.next != null) 
            {
                if(temp.next.val == val) 
                {
                    temp.next = temp.next.next; 
                }
                else
                {
                    temp = temp.next;
                }
            }
        }
        return head;
    }
}