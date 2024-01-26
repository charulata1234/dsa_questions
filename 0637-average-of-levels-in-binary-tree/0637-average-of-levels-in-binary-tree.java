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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> resultList = new ArrayList<>();
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            double sum =0; double avg=0;
            for(int i=0;i<levelNum;i++){
                TreeNode t = queue.poll();
                if(t.left !=null) queue.offer(t.left);
                if(t.right !=null) queue.offer(t.right);
                sum+=t.val;                
            }
            resultList.add(sum/levelNum);
        }
        return resultList;
    }
    
}