class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> stringC = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    String b =words[j];
                    if(s.contains(b) && !stringC.contains(b)){
                        stringC.add(b);
                    }
                }
            }
        }
        return stringC;
    }
}