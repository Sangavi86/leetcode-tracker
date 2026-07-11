// Last updated: 7/11/2026, 4:01:39 PM
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
