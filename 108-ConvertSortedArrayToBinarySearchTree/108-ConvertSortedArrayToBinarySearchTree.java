// Last updated: 7/13/2026, 8:54:18 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    return makeTree(nums, 0, nums.length - 1);
}
private TreeNode makeTree(int[] nums, int start, int end) {
    if (start>end) {
        return null;
    }
    int mid=(start + end) / 2;
    TreeNode root=new TreeNode(nums[mid]);
    root.left=makeTree(nums, start, mid - 1);
    root.right=makeTree(nums, mid + 1, end);
    return root;
}
}