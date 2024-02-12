class Solution {

    public int isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return 1;
        }
        return 0;
    }

    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;
        for(int i = 0 ; i < k ; i++){
            count+=isVowel(s.charAt(i));
        }
        max = count;
        for(int i = 1 ; i <= s.length() - k ; i++){
            count = count - isVowel(s.charAt(i-1)) +isVowel(s.charAt(i+k-1));
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}