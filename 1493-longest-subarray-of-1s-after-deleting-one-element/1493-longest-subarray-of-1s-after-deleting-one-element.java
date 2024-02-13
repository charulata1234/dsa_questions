class Solution {
    public int longestSubarray(int[] nums) {
        
        int i =0;
        int j =0;
        int zeroCount = 0;
        int res = 0;

        while(i < nums.length && j < nums.length)
        {
            if(nums[j] == 0)
            {
                ++zeroCount;
                while(zeroCount > 1)
                {
                    if(nums[i] == 0) --zeroCount;
                    ++i;
                }
                
            }
            ++j;
            res = Math.max(res, j -i);
        }
        
        return res-1;
    }}