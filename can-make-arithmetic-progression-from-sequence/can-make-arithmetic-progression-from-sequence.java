class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int flag =0;
        int d=arr[1]-arr[0];
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]-arr[i]!=arr[i]-arr[i+1]){
                return false;
            }
        }
        return true;
        
    }
}