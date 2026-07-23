// Last updated: 7/23/2026, 3:04:50 PM
class Solution {
  public String tree2str(TreeNode node) {
    if (node==null) return "";
    var s=Integer.toString(node.val);
    if (node.left==null && node.right==null)
      return s;    
    s+="(" + tree2str(node.left) + ")";
    if (node.right!=null)
      s+="(" + tree2str(node.right) + ")";
    return s;
  }
}