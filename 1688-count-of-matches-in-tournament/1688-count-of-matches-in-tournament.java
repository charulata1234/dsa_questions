class Solution {
    public int numberOfMatches(int n) {
       
         int ans = 0;

        while(n != 1)
        {
            // odd
            if(n %2!=0)
            {
                ans += (n / 2);
                n = (n / 2) + 1;
            }
            else
            {
                ans += (n / 2);
                n = (n / 2);
            }
        }
        return ans;
    }
}