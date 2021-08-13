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
    public int sumNumbers(TreeNode root) {
       List<String> l1= new ArrayList<>();
        printString(root,"",l1);
        int sum=0;
        for(String i : l1){
            int j = Integer.parseInt(i);
            sum+=j;
        }
        return sum; //1->2->3
    }
    public void printString(TreeNode root,String p,List<String> l){
        if(root!=null){
            p+=Integer.toString(root.val);
            if(root.left == null && root.right == null){
                l.add(p);
            }else{
                printString(root.left,p,l);
                printString(root.right,p,l);
                
            }
        }
    }
}
