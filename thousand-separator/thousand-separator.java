class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb= new StringBuilder(Integer.toString(n));
        int length=sb.length();
        int count=0;
        if(n>=0 &&n<1000){
            return sb.toString();
        }else{
            for(int i=length-1;i>=1;i--){
                count++;
                if(count==3){
                    sb.insert(i,'.');
                    count=0;
                }
            }
            return sb.toString();
        }
    }
}