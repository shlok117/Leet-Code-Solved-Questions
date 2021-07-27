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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        if(root == null ){
            return list1;
        }
        if(root!=null){
            stack1.push(root);
        }
        while(!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            if(temp.left==null && temp.right==null){
                list1.add(temp.val);
            }
            else if(temp.right !=null && temp.left==null){
                stack1.push(temp.right);
                temp.right = null;
                stack1.push(temp);
            }
            else if(temp.left!=null && temp.right==null){
                stack1.push(temp);
                stack1.push(temp.left);
                temp.left=null;
            }else{
                stack1.push(temp.right);
                stack1.push(temp);
                stack1.push(temp.left);
                temp.right= null;
                temp.left=null;
            }
        }
        return list1;
    }
}