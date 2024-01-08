class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
List<Integer> list = new ArrayList<Integer>();
if ( root == null ) return list;
return inorderTraversal(root,list);
}
​
private List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
if (root != null) {
inorderTraversal(root.left, list);
list.add(root.val);
inorderTraversal(root.right, list);
}
return list;
}