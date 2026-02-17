class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int currZero = 0;
        long total = 0L;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                currZero++;
                total += currZero;
            }else{
                currZero = 0;
            }
        }

        return total;
        
    }
}
