class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
                
            }else{
                map1.put(i,1);
            }
            if(map1.get(i)==2){
                return i;
            }
        }
        return 0;
    }
}