// Last updated: 7/23/2026, 2:56:26 PM
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