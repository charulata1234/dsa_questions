class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed=s.trim();
        String[] b= trimmed.split(" "); 
        String len= ""+b[b.length-1];
        return len.length();
    }
}