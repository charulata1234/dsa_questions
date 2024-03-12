/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean getPath(TreeNode root, ArrayList<TreeNode> list ,TreeNode n){
        if(root==null){
            return false;}
            list.add(root);
            if(root.val==n.val){
                return true;
            }
            boolean foundLeft= getPath(root.left,list,n);
            boolean foundRight =getPath(root.right,list,n);
            if(foundLeft || foundRight){
                return true;
            }
            list.remove(list.size()-1);
            return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();

        getPath(root,list1,p);
        getPath(root,list2,q);


        int i=0;
        for( i=0;i<list1.size() && i<list2.size() ;i++){
        if(list1.get(i)!=list2.get(i)){
            break;
        }
        }
        TreeNode lca=list1.get(i-1);
        return lca;
    }
}