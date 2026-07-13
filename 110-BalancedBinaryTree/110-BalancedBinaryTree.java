// Last updated: 7/13/2026, 8:54:16 AM
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int n=Math.abs(maxDepth(root.right)-maxDepth(root.left));
        if(n>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);      
    }
    public int maxDepth(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}