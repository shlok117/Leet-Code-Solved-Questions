class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_so_far=nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                max_so_far=max_so_far+nums[i];
            }else{
                max_so_far= nums[i];
            }
            if(max<max_so_far){
                max=max_so_far;
            }
            
        }
        //max= Math.max(max_so_far,max);
        return max;
    }
}

/*class Solution {
    public int maxAscendingSum(int[] nums) {
        int res = nums[0],temp = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > nums[i-1])
                temp+=nums[i];
            else
                temp = nums[i];
            res = Math.max(res,temp);
        }
        return res;
    }
}*/