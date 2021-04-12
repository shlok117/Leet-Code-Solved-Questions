class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for(int i:nums){
            set1.add(i);
        }
        Iterator<Integer> it=set1.iterator();
        int[] returnArray = new int [set1.size()];
        int i=0;
        while(it.hasNext()){
            returnArray[i]= it.next();
            i++;
        }
        Arrays.sort(returnArray);
        if(returnArray.length<3){
            return returnArray[returnArray.length-1];
        }
        else{
            return returnArray[returnArray.length-3];
        }
        
    }
}