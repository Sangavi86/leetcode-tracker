// Last updated: 7/13/2026, 8:52:28 AM
class Solution {
    HashMap<TreeNode, Integer> map = new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null)
            return 0;
        if (map.containsKey(root))
            return map.get(root);
        int take = root.val;
        if (root.left != null)
            take += rob(root.left.left) + rob(root.left.right);
        if (root.right != null)
            take += rob(root.right.left) + rob(root.right.right);
        int skip = rob(root.left) + rob(root.right);
        int ans = Math.max(take, skip);
        map.put(root, ans);
        return ans;
    }
}