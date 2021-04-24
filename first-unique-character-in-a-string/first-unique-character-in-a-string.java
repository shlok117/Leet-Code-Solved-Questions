class Solution {
    public int firstUniqChar(String s) {
        char[] StringArray =  s.toCharArray();
    Map<Character,Integer> mapOfcharacter = new HashMap<>();
        for(int i=0;i<StringArray.length;i++){
            if(mapOfcharacter.containsKey(StringArray[i])){
                int x =  mapOfcharacter.get(StringArray[i]);
                x++;
                mapOfcharacter.put(StringArray[i],x);
            }else{
                mapOfcharacter.put(StringArray[i],1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(mapOfcharacter.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}