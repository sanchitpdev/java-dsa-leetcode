class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        
        for(int x : set){

            if(!set.contains(x-1)){
                int currentNum = x;
                int currentLength = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest,currentLength);
            }
        }
        return longest;
    }
}
