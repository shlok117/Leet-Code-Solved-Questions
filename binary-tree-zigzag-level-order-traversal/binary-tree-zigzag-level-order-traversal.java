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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list1= new ArrayList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        if(root==null){
            return list1;
        }
        q1.add(root);
        int counter = 0;
        while(!q1.isEmpty()){
            List<Integer> l1 = new ArrayList<>();
            int len = q1.size();
            for(int i=0;i<len;i++){
                TreeNode t1 = q1.poll();
                l1.add(t1.val);
                if(t1.left!=null){
                    q1.add(t1.left);
                }
                if(t1.right !=null){
                    q1.add(t1.right);
                }
            }
            if(counter%2==0){
                list1.add(l1);
            }else{
                
               Collections.reverse(l1);
                list1.add(l1);
            }
            counter++;
        }
        return list1;
    }
}