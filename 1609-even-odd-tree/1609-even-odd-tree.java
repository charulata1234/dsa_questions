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
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        boolean evenLevel = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (evenLevel && (node.val % 2 == 0 || node.val <= prev)) {
                    return false;
                } else if (!evenLevel && (node.val % 2 == 1 || node.val >= prev)) {
                    return false;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

                prev = node.val;
            }
            evenLevel = !evenLevel;
        }

        return true;
    }
}
