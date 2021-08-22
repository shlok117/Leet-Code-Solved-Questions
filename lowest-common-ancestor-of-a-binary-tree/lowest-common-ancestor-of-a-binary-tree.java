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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null){
            return null;
        }
        int rootVal = root.val;
        int p1= p.val;
        int p2= q.val;
        
        if(rootVal==p1 || rootVal==p2){
            return root;
        }
        TreeNode left_l = lowestCommonAncestor(root.left,p,q);
        TreeNode right_l = lowestCommonAncestor(root.right,p,q);
        
        if(left_l!=null && right_l!=null){
            return root;
        }
        return (left_l != null) ? left_l : right_l;
    }
}