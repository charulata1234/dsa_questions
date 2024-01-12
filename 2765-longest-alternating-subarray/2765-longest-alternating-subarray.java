class Solution {
    public int alternatingSubarray(int[] nums) {
        int i = 0, j = 1, diff = 1, n = nums.length, len = -1;
        while (j < n) {
            if (nums[j] - nums[j - 1] != diff) {
                if (nums[j] - nums[j - 1] == 1) {
                    i = j - 1;
                } else {
                    i = j;
                    j++;
                }
                diff = 1;
                continue;
            }
            len = Math.max(len, j - i + 1);
            diff = diff > 0 ? -1 : 1;
            j++;
        }
        return len;
    }
}