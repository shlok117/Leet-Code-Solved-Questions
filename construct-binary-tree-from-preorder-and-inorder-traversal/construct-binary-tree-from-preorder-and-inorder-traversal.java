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
    Map<Integer,Integer> inorderindexMap= new HashMap<>();
    int preOrder ;
        
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder =0;
        for(int i=0;i<inorder.length;i++){
            inorderindexMap.put(inorder[i],i);
        }
        return arrayToTree(preorder,0,preorder.length-1);
    }
    public TreeNode arrayToTree(int [] preorder,int lef, int righ){
        if(lef>righ){
            return null;
        }
        int root = preorder[preOrder];
        preOrder++;
        TreeNode t1= new TreeNode(root);
        t1.left = arrayToTree(preorder,lef,inorderindexMap.get(root)-1);
        t1.right= arrayToTree(preorder,inorderindexMap.get(root)+1,righ);
        
        return t1;
    }
}