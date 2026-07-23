// Last updated: 7/23/2026, 2:55:15 PM
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
    public int countNodes(TreeNode root) {
      int val=treeNodes(root);
      return val;  
    }
    public static int treeNodes(TreeNode root){
        if(root==null) return 0;
        return 1+ treeNodes(root.left)+treeNodes(root.right);
    }
}