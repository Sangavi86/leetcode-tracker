// Last updated: 9/7/2026, 9:53:31 AM
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } 
        else if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        } 
        else {
            int sum = 0;
            sum += root.val;
            sum += rangeSumBST(root.left, low, high);
            sum += rangeSumBST(root.right, low, high);
            return sum;
        }
    }
}
