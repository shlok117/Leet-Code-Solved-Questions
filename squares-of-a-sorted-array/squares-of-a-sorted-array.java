class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arraySort = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arraySort[i]=nums[i]*nums[i];
        }
        Arrays.sort(arraySort);
    return arraySort;
    }
    
}