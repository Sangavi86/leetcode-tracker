// Last updated: 7/23/2026, 2:56:50 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null && temp.next!=null) {
            if (temp.val==temp.next.val) {
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        return head;
    }
}
