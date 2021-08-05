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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode q1 = new TreeNode();
        
        if(root == null){
            q1.val = val;
            return q1;
        }
        if(root.val>val){
            root.left = insertIntoBST(root.left,val);
        }
        if(root.val<val){
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}