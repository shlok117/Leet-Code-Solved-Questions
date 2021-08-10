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
    public int count=0;
    public int goodNodes(TreeNode root) {
        int j= dfs(root,root.val);
        return j;
        
        
    }
    public int dfs(TreeNode root, int max){
        
        if(root == null){
            return  0;
        }
        max= Math.max(root.val,max);
        if(root.val>=max){
            count++;
        }
        dfs(root.left,max);
        dfs(root.right,max);
        return count;
    }
}