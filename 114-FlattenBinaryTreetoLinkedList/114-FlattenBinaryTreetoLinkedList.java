// Last updated: 7/23/2026, 2:00:01 PM
1import java.util.*;
2class Solution {
3    public static void flatten(TreeNode root) {
4        if (root == null)
5            return;
6        ArrayList<TreeNode> list = new ArrayList<>();
7        Stack<TreeNode> stack = new Stack<>();
8        stack.push(root);
9        while (!stack.isEmpty()) {
10            TreeNode curr = stack.pop();
11            list.add(curr);
12            if (curr.right != null)
13                stack.push(curr.right);
14            if (curr.left != null)
15                stack.push(curr.left);
16        }
17        for (int i = 0; i < list.size() - 1; i++) {
18            list.get(i).left = null;
19            list.get(i).right = list.get(i + 1);
20        }
21        list.get(list.size() - 1).left = null;
22        list.get(list.size() - 1).right = null;
23    }
24}