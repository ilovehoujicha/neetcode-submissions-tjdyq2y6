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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll(); // poll next node
            TreeNode temp = curr.left; // store left pointer of polled node
            curr.left = curr.right; // set left pointer to right pointer
            curr.right = temp; // then replace right pointer with stored pointer
            if (curr.left != null) queue.offer(curr.left);
            if (curr.right != null) queue.offer (curr.right);
        }
        return root;
    }
}
