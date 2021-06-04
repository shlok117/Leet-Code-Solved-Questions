class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i:nums){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }else{
                map1.put(i,1);
            }
        }
        for(int k:map1.keySet()){
            if(map1.get(k)==2){
                list1.add(k);
            }
        }
        return list1;
    }
}