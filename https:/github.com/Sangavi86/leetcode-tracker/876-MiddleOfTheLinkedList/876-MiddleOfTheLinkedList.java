// Last updated: 9/7/2026, 9:53:54 AM
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode t1=head,t2=head;
        while(t2!=null && t2.next!=null){
            t1=t1.next;
            t2=t2.next.next;
        }
        return t1;
    }
}