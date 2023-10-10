class Solution {
    public boolean isIsomorphic(String s, String t) {
         HashMap<Character, Character> b= new  HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
         if(!b.containsKey(s.charAt(i)) && b.containsValue(t.charAt(i))){
                return false;
            }
        else  if(!b.containsKey(s.charAt(i)) && !b.containsValue(t.charAt(i))){
              b.put(s.charAt(i),t.charAt(i));
          }
            
            else if(b.get(s.charAt(i))!=t.charAt(i)){
                return false;
                
            }
        }
        return true;
    }
}