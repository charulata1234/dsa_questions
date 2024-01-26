class Solution {
private int minDiff=Integer.MAX_VALUE;
private TreeNode prev;
public int getMinimumDifference(TreeNode root) {
prev=null;
inorder(root);
return minDiff;
}
​
public void inorder(TreeNode root){
if(root==null){
return;
}
inorder(root.left);
if(prev!=null){
minDiff=Math.min(minDiff,root.val-prev.val);
}
prev=root;
inorder(root.right);
​
}
}