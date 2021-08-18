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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        Stack<TreeNode> s1= new Stack<>();
        if(root==null){
            return 0;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode t1= s1.pop();
            if(isLeftNode(t1.left)){
                sum+=t1.left.val;
            }
            if(t1.right!=null){
                s1.push(t1.right);
            }
            if(t1.left!=null){
                s1.push(t1.left);
            }
            
        }
        return sum;
    }
    public boolean isLeftNode(TreeNode root){
        if(root!=null && root.left==null && root.right ==null){
            return true;
        }else{
            return false;
        }
    }
}