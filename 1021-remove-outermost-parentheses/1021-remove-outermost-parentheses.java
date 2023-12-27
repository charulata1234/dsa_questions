class Solution {
    public String removeOuterParentheses(String s) {
         // Check if the string starts and ends with parentheses
    // if (!s.startsWith("(") || !s.endsWith(")")) {
    //   return s;
    // }

    // Create a StringBuilder to store the result
    StringBuilder result = new StringBuilder();
    int count = 0;
    int flag = 0;
    // Iterate through the string, adding characters to the StringBuilder
    for (int i = 0; i < s.length() ; i++) {
        if(s.charAt(i)=='('){
            count++;
            flag++;
        }else{
            count--;
        }
        if(count==0)flag =0;

        if(flag>1 && count!=0){
            
            result.append(s.charAt(i));
            }
        }
    

    // Return the result
    return result.toString();
  
    }
}