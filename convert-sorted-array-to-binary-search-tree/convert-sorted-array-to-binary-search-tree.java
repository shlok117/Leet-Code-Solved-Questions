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
    int[] nums;
    public TreeNode constructTree(int left, int right){
        if(left>right){
            return null;
        }
        int p=left+(right-left)/2;
        TreeNode t1= new TreeNode(nums[p]);
        t1.left = constructTree(left,p-1);
        t1.right = constructTree(p+1,right);
        return t1;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums= nums;
        return constructTree(0,nums.length-1);
    }
}