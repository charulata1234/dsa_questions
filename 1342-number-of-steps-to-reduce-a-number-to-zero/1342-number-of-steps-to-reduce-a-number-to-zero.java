class Solution {
    public int numberOfSteps(int num) {
         int count=0;
        while(num>0){
            count++;
            num=((num&1)!=0)?num-1:num>>1;
        }        
        return count;
    }
}