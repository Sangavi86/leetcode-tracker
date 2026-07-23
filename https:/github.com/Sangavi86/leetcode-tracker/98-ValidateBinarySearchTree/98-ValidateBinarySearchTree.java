// Last updated: 7/23/2026, 2:56:36 PM
class Solution {
    public boolean Valid(TreeNode root, TreeNode min, TreeNode max) {
        if(root==null) {
            return true;
        } 
        if(min!=null && root.val<=min.val) {
            return false;
        }
        if(max != null && root.val>=max.val) {
            return false;
        }
        return Valid(root.left, min, root) && Valid(root.right, root, max);
    }
    public boolean isValidBST(TreeNode root) {
        return Valid(root,null,null);
    }
}