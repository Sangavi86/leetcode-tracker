// Last updated: 7/13/2026, 8:54:14 AM
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        if(root.left==null && root.right==null){
            if(root.val==targetSum)
            return true;
            else
            return false;
        }
        int sum=targetSum-root.val;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}