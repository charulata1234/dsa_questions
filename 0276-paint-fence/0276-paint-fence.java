class Solution {
   public int numWays(int n, int k) {
    
    int memo[] = new int[n+1];  //memoized
    int ans = totalWaysMemo(n, k, memo); //memoized
    
    return ans;
}



//memoization DP
private int totalWaysMemo(int n, int k, int[] memo){
    if(n == 0) return 0;
    if(n==1) return k;
    if(n==2) return k * k;
    
    if(memo[n] != 0) return memo[n];
    
    memo[n] = (k-1) * (totalWaysMemo(n-1, k, memo) + totalWaysMemo(n-2, k , memo));
    return memo[n];
}





}