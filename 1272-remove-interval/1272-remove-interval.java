class Solution {

    int removeStart;
    int removeEnd;
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        removeStart = toBeRemoved[0];
        removeEnd = toBeRemoved[1];

        for (int[] i : intervals) {
            int intervalStart = i[0];
            int intervalEnd = i[1];
            checkIntersection(intervalStart, intervalEnd);
        }

        return answer;
    }

    private void checkIntersection(int intervalStart, int intervalEnd) {
        if (intervalStart >= removeStart && intervalEnd <= removeEnd) return;

        if (intervalStart < removeStart && intervalEnd > removeEnd) {
            addIntersection(intervalStart, removeStart);
            addIntersection(removeEnd, intervalEnd);
        } else {
            int start = intervalStart;
            int end = intervalEnd;
            if (intervalStart < removeStart) {
                end = Math.min(intervalEnd, removeStart);
            } else if (intervalEnd > removeEnd) {
                start = Math.max(intervalStart, removeEnd);
            }
            addIntersection(start, end);
        }
    }

    private void addIntersection(int start, int end) {
        List<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);

        answer.add(result);
    }

}