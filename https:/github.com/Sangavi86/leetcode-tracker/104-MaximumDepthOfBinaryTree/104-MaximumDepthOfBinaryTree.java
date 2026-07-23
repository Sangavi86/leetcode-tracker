// Last updated: 7/23/2026, 2:56:31 PM

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; 
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
