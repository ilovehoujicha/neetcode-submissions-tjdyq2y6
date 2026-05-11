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
    public int res = 0;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        dfs(root);
        return res;
    }
    
    public int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftmax = Math.max(dfs(node.left), 0);
        int rightmax = Math.max(dfs(node.right), 0);

        res = Math.max(res, node.val + leftmax + rightmax);
        return node.val + Math.max(leftmax, rightmax);
    }
}
