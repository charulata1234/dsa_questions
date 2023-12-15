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
    double max_avg = 0;
    
    public double maximumAverageSubtree(TreeNode root) {
        getSum(root);
        return max_avg;
    }
    
    private int getSum(TreeNode root) {
        if (root == null) return 0;
        
        // post-order traversal: left - right - root
        int left = getSum(root.left);
        int right = getSum(root.right);
        
        int sum = left + right + root.val;
        double average = (double)sum / (double)(countNodes(root.left) + countNodes(root.right) + 1);
        max_avg = Math.max(max_avg, average);
        
        return sum;
    }
    
    private int countNodes(TreeNode root) {
        if (root == null) return 0;
        
        return countNodes(root.left) + countNodes(root.right) + 1;
        
    }
    
}