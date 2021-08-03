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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        if(root == null ){
            return list1;
        }
        q1.add(root);
        while(!q1.isEmpty()){
            int size = q1.size();
            List<Integer> l1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                
                TreeNode temp = q1.remove();
                l1.add(temp.val);
                if(temp.left!=null){
                    q1.add(temp.left);
               
                }
                if(temp.right!=null){
                    q1.add(temp.right);
                
                }
                
            }
            list1.add(l1);
        }
        return list1;
        
        
    }
}