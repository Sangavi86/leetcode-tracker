// Last updated: 9/7/2026, 9:54:47 AM
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null) {
            return null;
        }
        if (root.val==val) {
            return root;
        } else if (val<root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val); // ← Fixed this line
        }
    }
}
