class Solution {
    public void moveZeroes(int[] nums) {
        //To keep track of index.
        int index = 0;
        //It will add non zero element into array.
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[index]= nums[i];
                index++;
            }
        }
        //This will fill remaing part with zero's
        while(index<nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
