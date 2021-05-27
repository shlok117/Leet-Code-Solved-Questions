class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for( int i:nums){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }else{
                map1.put(i,1);
            }
            
        }
        for(int key : map1.keySet()){
            if(map1.get(key)>(nums.length)/3){
                list1.add(key);
            }
        }
        return list1;
        
    }
}