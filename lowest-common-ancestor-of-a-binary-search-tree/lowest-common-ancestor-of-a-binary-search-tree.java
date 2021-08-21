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
        int p1= p.val;
        int q1= q.val;
        int rootVal=root.val;
        if(p1>rootVal && q1>rootVal){
            return lowestCommonAncestor(root.right,p,q);
        }else if(p1<rootVal && q1<rootVal){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    }
}