// Last updated: 7/23/2026, 2:55:08 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}