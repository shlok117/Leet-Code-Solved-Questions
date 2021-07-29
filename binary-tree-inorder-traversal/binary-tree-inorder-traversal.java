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
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stack1.isEmpty()){
            while(temp!=null){
                stack1.push(temp);
                temp=temp.left;
            }
            temp= stack1.pop();
            res.add(temp.val);
            temp=temp.right;
        }
        return res;
}
}