class Solution {
      
    public String reversePrefix(String word, char ch) {
        int index=0;
      boolean flag=false;
        String reverse="";
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                index=i;
                flag=true;
                break;
                
            }
        }
        if(flag){
        for(int i=index;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        }
       
        else{
            return word;
        }
         for(int i=index+1;i<word.length();i++){
            reverse=reverse+word.charAt(i);
        }
        return reverse;
    }
}