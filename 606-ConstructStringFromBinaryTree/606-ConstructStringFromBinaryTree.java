// Last updated: 7/11/2026, 4:03:31 PM
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