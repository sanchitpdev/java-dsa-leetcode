class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i = 0;i < nums.length; i++ ){
            if(nums[i]<= small){
                small = nums[i];
            }else if(nums[i]<= secondSmall){
                secondSmall = nums[i];
            }else if(nums[i]> secondSmall){
                return true;
            }
        }
        return false;
    }
}
