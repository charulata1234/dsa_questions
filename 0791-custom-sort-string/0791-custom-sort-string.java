class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> mp  = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch : order.toCharArray()){
            if(mp.containsKey(ch)){
                int count = mp.get(ch);
                while(count>0){
                    res.append(ch);
                    count--;
                }
                mp.remove(ch);
            }
        }
        for(char ch : mp.keySet()){
            int count = mp.get(ch);
            while(count>0){
                res.append(ch);
                count--;
            }
        }
        return res.toString();
    }
}