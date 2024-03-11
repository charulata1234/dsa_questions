class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            max = candies[i] > max ? candies[i] : max;
        }

        for (int j = 0 ; j < n; j++) {
            if ((candies[j] + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
}