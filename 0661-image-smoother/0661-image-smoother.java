class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int [][]  ans = new int [m][n];
       for(int i=0;i<m;i++){
           
           for(int j=0;j<n;j++){
               int sum =0;
               int c=1;
               sum+=img[i][j];
               
               if(isValid(img,i-1,j-1)){
                    sum+=img[i-1][j-1];
                    c++;
               }   
                if(isValid(img,i,j-1)){
                     sum+=img[i][j-1];
                     c++;
                }
                   
                if(isValid(img,i+1,j-1)){
                    sum+=img[i+1][j-1];
                    c++;
                }
                    
                if(isValid(img,i+1,j)){
                     sum+=img[i+1][j];
                     c++;
                }
                   
                if(isValid(img,i+1,j+1)){
                   sum+=img[i+1][j+1];
                   c++;
                }
                    
                if(isValid(img,i,j+1)){
                    sum+=img[i][j+1];
                    c++;
                }
                    
                if(isValid(img,i-1,j+1)){
                     sum+=img[i-1][j+1];
                     c++;
                }
                if(isValid(img,i-1,j))
                {
                    sum+=img[i-1][j];
                    c++;
                }
               
                ans[i][j]=sum/c;


           }
       } 
        return ans;
    }
    public boolean isValid(int[][] arr,int i,int j){
        int m=arr.length;
        int n=arr[0].length;
        if(i>=0&&i<m&&j>=0&&j<n)
            return true;
        return false;
    }
}