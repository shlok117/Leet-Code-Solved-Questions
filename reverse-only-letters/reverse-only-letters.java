class Solution {
    public String reverseOnlyLetters(String S) {
        int j=S.length()-1;
        char[] ch = S.toCharArray();
        int i=0;
        while(i<j){
            if(!Character.isLetter(ch[i])){
                i++;
            }else if(!Character.isLetter(ch[j])){
                j--;
            }else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}