class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: chars.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        int ans = 0;
        for(String s: words) {
            Map<Character, Integer> count = new HashMap<>();
            int i = 0;
            for(; i<s.length(); i++) {
                char c = s.charAt(i);
                if(map.containsKey(c)) {
                    if(count.containsKey(c) && count.get(c) + 1 > map.get(c))
                        break;
                    count.put(c, count.getOrDefault(c, 0) + 1);
                } else
                    break;
            }
            if(i == s.length())
                ans += s.length();
        }
        
        return ans;
    }
}