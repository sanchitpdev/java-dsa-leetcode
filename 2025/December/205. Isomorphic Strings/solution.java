class Solution {
    public boolean isIsomorphic(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }
    
    Map<Character,Character> chMapping = new HashMap<>();

    for(int i = 0;i< s.length(); i++){
        char og = s.charAt(i);
        char rp = t.charAt(i) ;

        if(!chMapping.containsKey(og)){
            if(!chMapping.containsValue(rp)){
            chMapping.put(og,rp);
            }else{
                return false;
            }
        }else{
            char mapedChar = chMapping.get(og);
            if(mapedChar != rp){
                return false;
            }
        }
    }
    return true;
    }
}
