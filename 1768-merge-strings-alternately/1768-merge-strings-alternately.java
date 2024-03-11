class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String res="";
        while(i<word1.length() && j<word2.length()){
        res=res+word1.charAt(i);
        res=res+word2.charAt(j);
            i++;
            j++;
        }
        while(j<word2.length()){
              res=res+word2.charAt(j);
            j++;
        }
        while(i<word1.length()){
              res=res+word1.charAt(i);
            i++;
        }
        return res;
    }
}