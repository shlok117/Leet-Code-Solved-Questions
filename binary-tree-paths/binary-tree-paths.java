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
        List<String> str = new ArrayList<>();
        printString(root,"",str);
        return str;
        
    }
    public void printString(TreeNode root,String p,List<String> str){
        if(root!=null){
        p+=Integer.toString(root.val); // p=1
        if(root.left==null && root.right==null){
            str.add(p);
        }else{
            p+="->";
            printString(root.left,p,str);
            printString(root.right,p,str);
        }
        }
    }
}