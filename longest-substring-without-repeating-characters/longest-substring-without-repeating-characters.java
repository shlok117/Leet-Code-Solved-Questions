class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        int result=0;
        for(int i=0;i<length;i++){
            boolean[] array = new boolean[256];
            
            for(int j=i;j<length;j++){
                if(array[s.charAt(j)]==true){
                    break;
                }
                else{
                    result=Math.max(result,j-i+1);
                    //System.out.println(s.substring(i,j+1));
                    array[s.charAt(j)]=true;
                }
            }
            //array[s.charAt(i)-'a']=false;
            
        }
        return result;
    }
}