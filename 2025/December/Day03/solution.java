class Solution {
    public int[] productExceptSelf(int[] nums) {
        //creating left array.
        int[] left = new int[nums.length];
        //creating right array
        int[] right = new int[nums.length];

        //Left array
        left[0] = 1;
        for(int i = 1; i< nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        //Right array
        right[nums.length - 1] = 1;  
        for(int i = nums.length - 2;i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int[] ans = new int[nums.length];
        for(int i = 0;i<ans.length ; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
