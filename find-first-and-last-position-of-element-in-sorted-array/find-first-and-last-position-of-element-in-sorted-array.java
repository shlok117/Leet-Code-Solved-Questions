class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int low=0;
        int high=nums.length-1;
        int temp=-1;
        while(low<=high){
          int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                 low=mid+1;
            }
            else{
                temp=mid;
                high=mid-1;
            }
        }
        arr[0]=temp;
        
        int l=0;
        int high1=nums.length-1;
        int temp1=-1;
        while(l<=high1){
          int mid1=(l+high1)/2;
            if(nums[mid1]>target){
                high1=mid1-1;
            }
            else if(nums[mid1]<target){
                l=mid1+1;
            }
            else{
                temp1=mid1;
                l=mid1+1;
            }
        }
        arr[1]=temp1;
        return arr;
        
    }
    
}