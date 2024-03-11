class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 1) {
            return 0;
        }
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        int i = 0;
        int prevEnd = intervals[i][1];
        int count = 0;
        i++;
        while(i < intervals.length) {
            if(intervals[i][0] >= prevEnd) {
                prevEnd = intervals[i][1];
                i++;
            } else {
                prevEnd = Math.min(prevEnd, intervals[i][1]);
                count++;
                i++;
            }
        }
       return count;
    }
}