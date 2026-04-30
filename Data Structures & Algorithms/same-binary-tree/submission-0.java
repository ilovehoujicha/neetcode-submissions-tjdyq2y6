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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);
        while (!stack.isEmpty()) {
            TreeNode curr1 = stack.pop();
            TreeNode curr2 = stack.pop();
            if (curr1 == null && curr2 == null) continue;
            if (curr1 == null || curr2 == null) return false;
            if (curr1.val != curr2.val) return false;

            stack.push(curr1.left);
            stack.push(curr2.left);
            stack.push(curr1.right);
            stack.push(curr2.right);
        }
        return true;
    }
}
