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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode right = null;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();

                if (node != null) { 
                    right = node;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (right != null) res.add(right.val);
        }
        return res;
    }
}
