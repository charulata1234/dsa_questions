class Solution {
public int buyChoco(int[] arr, int money) {
​
int n = arr.length;
int min1 = Integer.MAX_VALUE;
int min2 = Integer.MAX_VALUE;
​
for(int i=0; i<n; i++){
if(arr[i]<min1){
min2 = min1;
min1 = arr[i];
}else if(arr[i]<min2){
min2 = arr[i];
}
}
​
if(min1+min2<=money){
return money-(min1+min2);
}
return money;
}
}