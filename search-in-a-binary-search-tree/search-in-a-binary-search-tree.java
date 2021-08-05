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
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> q1 = new LinkedList<>();
        if(root == null){
            return null;
        }
        q1.add(root);
        TreeNode temp1 = null;
        while(!q1.isEmpty()){
            TreeNode temp = q1.remove();
            if(temp.val==val){
                temp1 = temp;
            }
            if(temp.left !=null){
                q1.add(temp.left);
            }
            if(temp.right!=null){
                q1.add(temp.right);
            }
        }
        return temp1;
        
    }
}