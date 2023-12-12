class Solution {
    public int maxProduct(int[] nums) {
        int firstLargest=0;
        int secondLargest=0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
    for(int i=0;i<nums.length;i++){
        pQueue.add(nums[i]);
    }
        firstLargest=pQueue.poll();
        secondLargest=pQueue.poll();
        
        return (firstLargest-1)*(secondLargest-1);
        
    }
}