// Last updated: 7/23/2026, 2:57:37 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        // Step 1: Count nodes
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // Step 2: Store values in array
        int[] arr = new int[n];
        temp = head;
        for (int i = 0; i < n; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        // Step 3: Reverse every k group
        for (int i = 0; i + k <= n; i += k) {
            reverse(arr, i, i + k - 1);
        }

        // Step 4: Build new linked list
        ListNode dummy = new ListNode(0);
        temp = dummy;

        for (int i = 0; i < n; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return dummy.next;
    }

    // simple reverse function
    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}