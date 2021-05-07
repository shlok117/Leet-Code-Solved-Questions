class Solution {
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()-1;
        int count =0;
        while(i<j){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(j))){
                count--;
            }
            i++;
            j--;
            
        }
        if(count==0){
                return true;
            }
        return false;
    }       
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch == 'i' || ch=='o'||ch=='u'||ch=='A' || ch == 'E'||ch=='O'||ch=='I'||ch=='U'){
            return true;
        }
        return false;
    }
}
