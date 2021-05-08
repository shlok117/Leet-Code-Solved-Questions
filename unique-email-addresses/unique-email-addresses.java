class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> sringEmail =  new ArrayList<>();
        for(String email :emails){
            String[] array = email.split("@");
            String temp="";
            int l = array[0].length();
            for(int i=0;i<l;i++){
                char ch = array[0].charAt(i);
                if(ch == '.'){
                    continue;
                }
                if(ch=='+'){
                    break;
                }
                temp+=ch;
            }
            temp=temp+"@"+array[1];
            if(!sringEmail.contains(temp)){
                sringEmail.add(temp);
            }
        }
        return sringEmail.size();
    }
}