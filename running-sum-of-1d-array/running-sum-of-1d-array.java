class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] array = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
           nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}