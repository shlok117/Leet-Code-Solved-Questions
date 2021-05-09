class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1="";
        String temp2="";
        for(int i=0;i<word1.length;i++){
            temp1+=word1[i];
            
        }
        //System.out.println(temp1);
        for(int j=0;j<word2.length;j++){
            temp2+=word2[j];
        }
        if(temp1.equals(temp2)){
            return true;
        }
        return false;
    }
}