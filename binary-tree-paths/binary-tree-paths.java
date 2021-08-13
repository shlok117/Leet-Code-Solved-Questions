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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> l1= new ArrayList<>();
        printString(root,"",l1);
        return l1; //1->2->3
    }
    public void printString(TreeNode root,String p,List<String> l){
        if(root!=null){
            p+=Integer.toString(root.val);
            if(root.left == null && root.right == null){
                l.add(p);
            }else{
                p+="->";
                
                printString(root.left,p,l);
                printString(root.right,p,l);
                
            }
        }
    }
}