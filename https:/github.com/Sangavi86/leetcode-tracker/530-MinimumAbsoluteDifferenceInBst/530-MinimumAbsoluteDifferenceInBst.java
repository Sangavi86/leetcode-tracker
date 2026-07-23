// Last updated: 7/23/2026, 3:05:01 PM
class Solution {
    Integer prev=null;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    public void inorder (TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev);
        }
        prev=root.val;
        inorder(root.right);
    }
};