class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> s1 = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
                s1.push(c);
                if(count != 1){
                    sb.append(c);
                }
            }
            if( c == ')'){
                count--;
                s1.pop();
                if(count!=0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}