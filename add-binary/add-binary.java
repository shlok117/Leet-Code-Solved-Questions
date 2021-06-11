class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb= new StringBuilder();
        int carry=0;
        while(i>=0||j>=0){
            int s=carry;
            if(i>=0){
                s+=a.charAt(i)-'0';
            }
            if(j>=0){
                s+=b.charAt(j)-'0';
                
            }
            sb.append(s%2);
            carry=s/2;
            i--;j--;
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}