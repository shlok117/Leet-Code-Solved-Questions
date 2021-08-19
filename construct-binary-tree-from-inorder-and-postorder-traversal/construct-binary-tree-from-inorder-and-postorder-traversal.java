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
    int postOrder ;
    Map<Integer,Integer> m1= new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0 ; i<inorder.length;i++){
            m1.put(inorder[i],i);
        }
        postOrder = postorder.length-1;
        return arrayToTree(postorder,0,postorder.length-1);
    }
    public TreeNode arrayToTree(int[] postorder, int left,int right){
        if(left>right){
            return null;
        }
        
        int root = postorder[postOrder];
       
        TreeNode t1 = new TreeNode(root);
         postOrder--;
        
        t1.right = arrayToTree(postorder,m1.get(root)+1,right);
        t1.left= arrayToTree(postorder,left,m1.get(root)-1);
        return t1;
    }
}