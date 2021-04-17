class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int sum = Integer.MAX_VALUE;
        int index =-1;
        for(int i=0,j=0;i<points.length;i++,j++){
            if(points[i][0]==x || points[i][1]==y ){
                int temp = Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                if(temp<sum){
                    sum= temp;
                    index= i;
                }
            }
        }
        return index;
    }
}