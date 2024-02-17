class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack=new Stack<>();

        for(int asteroid:asteroids){
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                int sum=asteroid+stack.peek();
                if(sum>0){
                    asteroid=0;
                }
                else if(sum<0){
                    stack.pop();
                }
                else{
                    stack.pop();
                    asteroid=0;
                }
            }

            if(asteroid!=0){
                stack.push(asteroid);
            }
        }

        int arr[]=new int[stack.size()];

        for(int x=stack.size()-1;x>=0;x--){
            arr[x]=stack.pop();
        }

        return arr;
    }
}