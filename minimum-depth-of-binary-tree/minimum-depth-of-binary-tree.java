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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if((root.left ==null) && (root.right ==null)){
            return 1;
        }
        int count = Integer.MAX_VALUE;
        if(root.left !=null){
            count = Math.min(minDepth(root.left),count);
        }
        if(root.right !=null){
            count = Math.min(minDepth(root.right),count);
        }
        return count+1;
        
    }
}