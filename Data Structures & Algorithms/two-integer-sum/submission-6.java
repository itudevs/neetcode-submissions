class Solution {
    public int[] twoSum(int[] nums, int target) {
        int count=1;
        int iteration=0;
        while (iteration!=count){
            if(count==nums.length){ //reset loop assuming the pair exists
               iteration++;
               count=iteration+1;
            }

            if(iteration==nums.length)
               iteration=0;

            if(nums[iteration]+nums[count]==target){
              return new int[] {iteration,count};       
            }
            
            count++;
        }
        return new int [] {};
    }
}
