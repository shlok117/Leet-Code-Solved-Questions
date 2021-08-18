class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int lastVal = 0;
        Queue<TreeNode> Q1 = new LinkedList<>();
        if(root == null){
            return 0;
        }
        Q1.add(root);
        while(! Q1.isEmpty()){
            TreeNode temp = Q1.poll();
            lastVal = temp.val;
            if(temp.right != null){
                Q1.add(temp.right);
            }
            if(temp.left != null){
                Q1.add(temp.left);
            }
            
        }
        return lastVal;
    }
}