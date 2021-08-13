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
    public boolean isSymmetric(TreeNode root) {
        boolean flag= isMirror(root,root);
        return flag;
    }
    public boolean isMirror(TreeNode root,TreeNode root1){
        if(root==null && root1==null){
            return true;
        }
        else if(root1==null || root==null){
            return false;
        }else if(root.val !=root1.val){
            return false;
        }else{
            return isMirror(root.left,root1.right) && isMirror(root.right,root1.left);
        }
        
    }
}