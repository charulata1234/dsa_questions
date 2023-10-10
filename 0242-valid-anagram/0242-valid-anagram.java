class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> b= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
           if(!b.containsKey(s.charAt(i))){
               b.put(s.charAt(i),1);
           }
           else{
                b.put(s.charAt(i),b.get(s.charAt(i))+1);
           }
        }

 for(int i=0;i<t.length();i++){
     if(b.containsKey(t.charAt(i))){
         b.put(t.charAt(i),b.get(t.charAt(i))-1);
         if( b.get(t.charAt(i))<0){
             return false;
         }
     }else{
         return false;
     }
 }
 for(Map.Entry<Character,Integer> pair: b.entrySet()){
     if(pair.getValue()!=0){
         return false;
     }
 }
 return true;
    }
}