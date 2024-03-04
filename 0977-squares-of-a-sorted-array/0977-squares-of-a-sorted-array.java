class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int[] result = new int[nums.length];
        int i = nums.length - 1;

        while(left <= right){
            if(Math.abs(nums[left]) >= Math.abs(nums[right])){
                result[i] = nums[left] * nums[left];
                i--;
                left++;
            }
            else{
                result[i] = nums[right] * nums[right];
                i--;
                right--;
            }
        }

        return result;
    }
}
