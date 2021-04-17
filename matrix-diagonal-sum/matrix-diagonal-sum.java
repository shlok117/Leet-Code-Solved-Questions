class Solution {
    public int diagonalSum(int[][] mat) {
    int row = mat.length;
    int col = mat[0].length;
        int sum=0;
        if(row ==1){
            return mat[0][0];
        }
        for(int i=0,j=0;i<row;i++,j++){
             sum=sum+mat[i][j];
        }
        for(int i=0,j=col-1;i<row;i++,j--){
            if(row%2 !=0 && i==j){
                continue;
            }
            sum=sum+mat[i][j];
        }
        return sum;
    }
}