// Last updated: 7/23/2026, 2:55:25 PM
class Solution
 {
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev=null;
        ListNode temp=head;
        ListNode next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}