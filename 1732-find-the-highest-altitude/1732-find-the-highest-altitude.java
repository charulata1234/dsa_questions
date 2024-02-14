class Solution {
    public int largestAltitude(int[] gain) {
        // int p[]=new int[gain.length+1];
        // p[0]=0;
        int sum=0, max_sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
           // p[i]=sum;
            max_sum=Math.max(max_sum,sum);
        }
        return max_sum;
    }
}