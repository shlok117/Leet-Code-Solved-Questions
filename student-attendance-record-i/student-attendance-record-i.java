class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countl=0;
        int countP = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                countA++;
                countl=0;
            }
            else if(s.charAt(i)=='L'){
                countl++;
            }else{
                countl=0;
            }
            if(countA>=2 || countl>=3 ){
            return false;
        }
        }
        
        return true;
    }
}