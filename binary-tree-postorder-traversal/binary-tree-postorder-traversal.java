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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(root == null){
            return list;
        }
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if(temp.left!=null){
                stack1.push(temp.left);
            }
            if(temp.right!=null){
                stack1.push(temp.right);
            }
        }
        while(!stack2.isEmpty()){
            TreeNode temp2 = stack2.pop();
            list.add(temp2.val);
        }
        return list;
    }
}