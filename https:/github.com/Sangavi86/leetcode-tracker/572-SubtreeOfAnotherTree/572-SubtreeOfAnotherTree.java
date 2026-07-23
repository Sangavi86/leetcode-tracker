// Last updated: 7/23/2026, 3:04:56 PM
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (checkSame(root, subRoot)) {
            return true;
        }
        boolean checkLeft = isSubtree(root.left, subRoot);
        boolean checkRight = isSubtree(root.right, subRoot);
        return checkLeft || checkRight;
    }

    public boolean checkSame(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        boolean leftSame = checkSame(root1.left, root2.left);
        boolean rightSame = checkSame(root1.right, root2.right);
        return leftSame && rightSame;
    }
}
