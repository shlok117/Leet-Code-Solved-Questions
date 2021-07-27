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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        if(root == null ){
            return list;
        }
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode temp1 = stack1.pop();
            list.add(temp1.val);
            if(temp1.right!=null){
                stack1.push(temp1.right);
            }
            if(temp1.left!=null){
                stack1.push(temp1.left);
            }
            
        }
        return list;
    }
}