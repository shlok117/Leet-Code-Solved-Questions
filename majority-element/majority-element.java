class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int num:nums){
            if(map1.containsKey(num)){
                map1.put(num,map1.get(num)+1);
            }else{
                map1.put(num,1);
            }
            if(map1.get(num)>(nums.length)/2){
                return num;
            }
        }
        return 0;
    }
}