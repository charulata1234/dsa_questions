class Solution {
public int maxVowels(String s, int k) {
String vowels = "aeiou";
int max = 0;
int count = 0;
for(int i = 0 ; i <= s.length() - k ; i++){
for(int j = i ; j < i + k ; j++){
if(vowels.contains("" + s.charAt(j)))
count++;
}
max = Math.max(max,count);
count = 0;
}
return max;
}
}