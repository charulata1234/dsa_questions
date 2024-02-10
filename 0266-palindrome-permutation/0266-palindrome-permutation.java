class Solution {
    public boolean canPermutePalindrome(String s) {
        // if the string is of even length, then each character must occur even number of times
        // else, each character except one must occur even number of times
        int[] freq = new int[26];
        for(char c:s.toCharArray())freq[c-'a']++;
        int oddCnt=0;
        for(int i:freq){
            oddCnt+=i%2;
        }
        // if s.length() is odd, oddCnt has to be 1, otherwise it has to be 0.
        return oddCnt==(s.length()&1);
    }
}