class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int start = 0, end = nums.length-1;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == 0) return nums[end];
            else if(sum < 0) start ++;
            else end--;
        }

        return -1;
    }
}