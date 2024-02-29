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
    public int diameterOfBinaryTree(TreeNode root) {
        counter(root);
        return diameter;
    }
    int diameter = 0;
    public int counter(TreeNode node) {
        if(node == null) return 0;
        int left = counter(node.left);
        int right = counter(node.right);
        diameter = Math.max(left+right,diameter);
        return Math.max(left, right)+1;
    }
}