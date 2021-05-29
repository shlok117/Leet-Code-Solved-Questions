class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            int sum = nums[i+1]-nums[i];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}