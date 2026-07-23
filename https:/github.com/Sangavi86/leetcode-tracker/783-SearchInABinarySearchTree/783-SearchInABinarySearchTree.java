// Last updated: 7/23/2026, 3:04:06 PM
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
