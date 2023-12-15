class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String concat1="";
        String concat2="";
        for(int i=0;i<word1.length;i++){
           concat1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
           concat2+=word2[i];
     }
        if(concat1.equals(concat2)){
            return true;
        }
        return false;
    }
}