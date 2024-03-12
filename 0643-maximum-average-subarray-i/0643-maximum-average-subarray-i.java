// feel free to ask questions, I will reply asap
class Solution {
public double findMaxAverage(int[] nums, int k) {
    //calculate the first k sum first so that later on in comparison, you do not need to
    // deal with the pre-existed values
    double sum =0;
    for(int i=0; i<k; i++){
        sum +=nums[i];
    }
    
    // now slide the window,start by deleting first elements and then add the k+1 over and over
    // until reaches the length ,and update the ans with max out of them
    double ans = sum;
    for(int i=k; i<nums.length; i++){
        sum +=nums[i] - nums[i-k];
        ans = Math.max(sum, ans);
    }
    return ans/k;
}
}