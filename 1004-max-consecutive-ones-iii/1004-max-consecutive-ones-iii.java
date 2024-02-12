class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, cz = 0, ans = 0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                cz++;
            }
            if(cz>k)
            {
                if(nums[left]==0)
                {
                    cz--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
