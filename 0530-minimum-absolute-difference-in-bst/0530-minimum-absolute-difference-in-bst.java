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
    TreeNode prev;
    Integer minDiff = null;
    public int getMinimumDifference(TreeNode root) {
       inorder(root);
       return minDiff!=null?minDiff:0;
    }

    private void inorder(TreeNode root){
      //base
      if(root == null)
         return;
      
      //logic
      inorder(root.left);
      if(prev != null){
         int diff = root.val-prev.val;
         if(minDiff == null)
            minDiff = diff;
         if(diff<minDiff)
            minDiff = diff;
      }
      prev = root;
      inorder(root.right);
    }
}