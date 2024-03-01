class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h = new HashMap<>();
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(char x:magazine.toCharArray()){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            h1.put(ransomNote.charAt(i),h1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e : h1.entrySet()){
            if(h.containsKey(e.getKey()) && h.get(e.getKey())>=e.getValue()){
               continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}