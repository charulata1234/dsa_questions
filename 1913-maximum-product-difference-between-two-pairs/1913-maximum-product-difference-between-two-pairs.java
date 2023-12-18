class Solution {
    public int maxProductDifference(int[] nums) {
        PriorityQueue<Integer> largestTwo = new  PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> smallestTwo = new  PriorityQueue<Integer>();
        int firstLargest=0;
        int secondLargest=0;
        int firstSmallest=0;
        int secondSmallest=0;
        for(int i=0;i<nums.length;i++){
            largestTwo.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            smallestTwo.add(nums[i]);
        }
        firstLargest=largestTwo.poll();
        secondLargest=largestTwo.poll();
        firstSmallest=smallestTwo.poll();
        secondSmallest=smallestTwo.poll();
        
        return (firstLargest*secondLargest)-(firstSmallest*secondSmallest);
        
    }
}