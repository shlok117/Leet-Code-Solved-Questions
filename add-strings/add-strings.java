class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j= num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry=0;
        while(i>=0||j>=0){
            int s=carry;
            if(i>=0){
                s+=num1.charAt(i)-'0';
            }
            if(j>=0){
                s+=num2.charAt(j)-'0';
            }
            sb.append(s%10);
            carry=s/10;
            i--;j--;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}