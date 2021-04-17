class Solution {
    public int reverse(int x) {
        int temp =0;
        long ans = 0;
        while(x!=0){
            temp=x%10;
            x=x/10;
            ans=ans*10 + temp;
        }
        if(ans <Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
            return 0;
        }
        return (int)ans;
        
    }
}