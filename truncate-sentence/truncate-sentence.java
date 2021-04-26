class Solution {
    public String truncateSentence(String s, int k) {
        String res="";
        String[] array= s.split(" ");
        for(int i=0;i<k;i++){
            res=res+array[i]+" ";
            
        }
        res.trim();
        
        
        return res.trim();
    }
}