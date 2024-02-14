class Solution {
public int pivotIndex(int[] nums) {
​
int fwd_sum[]=new int[nums.length];
int bwd_sum[]=new int[nums.length];
​
int sum=0;
for(int i=0;i<nums.length;i++){
sum+=nums[i];
fwd_sum[i]=sum;
}
​
sum=0;
for(int i=nums.length-1;i>=0;i--){
sum+=nums[i];
bwd_sum[i]=sum;
}
​
for(int i=0;i<nums.length;i++){
if(fwd_sum[i]==bwd_sum[i]) return i;
}
​
return -1;
}
}