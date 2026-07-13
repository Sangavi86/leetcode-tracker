// Last updated: 7/13/2026, 8:53:04 AM
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}