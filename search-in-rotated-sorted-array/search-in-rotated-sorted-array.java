class Solution {
    public int search(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        if(arr.contains(target)){
            return arr.indexOf(target);
        }
        return -1;
    }
}