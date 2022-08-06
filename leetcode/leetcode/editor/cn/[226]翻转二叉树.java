
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        getInvertTree(root);
       return root;
    }
    public void getInvertTree(TreeNode root){
        if (root == null)
            return;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode indexNode = root.left;
        root.left = root.right;
        root.right = indexNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
