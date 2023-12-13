class Solution {
public String largestOddNumber(String num) {
long number= Long.valueOf(num);
int countOddDigits=0;
int oddNumber;
long lastDigit=0;
long max=Integer.MIN_VALUE;
if(number%2!=0){
return num;
}
else{
while(number!=0){
if(number%2!=0){
max=number;
countOddDigits++;
break;
}
lastDigit=number%10;
if(lastDigit%2!=0){
max=Math.max(max,lastDigit);
countOddDigits++;
}
number=number/10;
}
}
if(countOddDigits==0){
return "";
}
return ""+max;
}
}