
//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        getList(root,resultList);
        return resultList;
    }
    public void getList(TreeNode root, List<Integer> list){
        if (root==null)
            return;
        getList(root.left,list);
        getList(root.right,list);
        list.add(root.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
