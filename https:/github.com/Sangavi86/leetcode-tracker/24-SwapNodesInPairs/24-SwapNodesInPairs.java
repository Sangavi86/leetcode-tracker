// Last updated: 7/23/2026, 2:57:38 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode  dum=new ListNode(-1);
        dum.next=head;
        ListNode temp=dum;
        while(temp.next!=null && temp.next.next!=null){
            ListNode swap1=temp.next;
            ListNode swap2=temp.next.next;
            swap1.next=swap2.next;
            swap2.next=swap1;
            temp.next=swap2;
            temp=swap1;
        }
        return dum.next;
    }
}