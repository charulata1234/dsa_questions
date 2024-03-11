class Solution {
    public String reverseWords(String s) {

      String[] temp=s.trim().split("\\s+");
      int p1=0;
      int p2=temp.length-1;
      while(p1<p2)
      {
          String swap=temp[p1];
          temp[p1]=temp[p2];
          temp[p2]=swap;
          p1++;
          p2--;
      }
      return String.join(" ",temp);
    
    }
}