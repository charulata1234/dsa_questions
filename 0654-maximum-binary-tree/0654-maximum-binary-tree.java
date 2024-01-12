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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return task(0, nums.length - 1, nums);
    }

    static TreeNode task(int low, int high, int[] nums) {
        if(low > high) return null;
        int max = -1, maxInd = 0;

        for(int i = low; i <= high; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxInd = i;
            }
        }

        TreeNode node = new TreeNode(max);

        node.left = task(low, maxInd - 1, nums);
        node.right = task(maxInd + 1, high, nums);

        return node;
    }
}