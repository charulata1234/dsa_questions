class Solution {
    public long largestPerimeter(int[] nums) {
        if(nums.length<3){
            return -1l;
        }
        Arrays.sort(nums);
        long longestPerimeter=-1;
        long currentSum=nums[0]+nums[1];
        for(int i=2;i<nums.length;i++){
            if(nums[i]<currentSum){
                longestPerimeter=currentSum+nums[i];
            }
            currentSum=currentSum+nums[i];
        }
        return longestPerimeter;  
    }
}