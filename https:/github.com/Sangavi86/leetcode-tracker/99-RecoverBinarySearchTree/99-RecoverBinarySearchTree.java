// Last updated: 7/23/2026, 2:56:34 PM
import java.util.*;

class Solution {

    public void recoverTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        // Step 1: inorder → store values
        inorder(root, list);

        // Step 2: sort values
        Collections.sort(list);

        // Step 3: replace values
        fix(root, list, new int[]{0});
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private void fix(TreeNode root, List<Integer> list, int[] index) {
        if (root == null) return;

        fix(root.left, list, index);
        root.val = list.get(index[0]++);
        fix(root.right, list, index);
    }
}