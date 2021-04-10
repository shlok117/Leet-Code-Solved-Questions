class Solution {
    public int maxSubArray(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int maxEnd = 0;
        for(int i=0;i<nums.length;i++){
            maxEnd =maxEnd +nums[i];
            if(maxNum < maxEnd) {
                maxNum = maxEnd;
            }
            if(maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return maxNum;
    }
}