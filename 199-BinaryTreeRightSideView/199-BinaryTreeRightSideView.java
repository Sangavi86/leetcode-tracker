// Last updated: 7/13/2026, 8:53:25 AM
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (i == size - 1)
                    ans.add(node.val);

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }
        }

        return ans;
    }
}