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
    public int findBottomLeftValue(TreeNode root) {
        Queue <TreeNode> q= new LinkedList<>();
        q.add(root);
        int ans =0;
        while(!q.isEmpty()){
            int s= q.size();
            for(int i=0;i<s;i++){
                TreeNode top = q.remove();
                if(i==0)   ans=top.val;
                if(top.left!=null)     q.add(top.left);
                if(top.right!=null)  q.add(top.right);
            }
        }
        return ans;
    }
}