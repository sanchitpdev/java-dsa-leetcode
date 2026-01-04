class Solution {
    public int majorityElement(int[] nums) {
        //selecting our first candidate
        int majority = nums[0];
        int votes = 1;

        //Loop to itrate through array and find majority element
        for(int i = 1;i <nums.length;i++){
            if(votes == 0){
                votes++;
                majority = nums[i];
            }else if(nums[i]==majority){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }
}
