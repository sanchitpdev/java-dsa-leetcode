class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        List<Integer> result = new ArrayList<>();

        for(char c : p.toCharArray()){
            pCount[c-'a']++;
        }

        for(int i = 0 ;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sCount[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(pCount,sCount)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}
