class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows=img.length;
        int col=img[0].length;
        int [][]  ans = new int [rows][col];
       for(int i=0;i<rows;i++){
           
           for(int j=0;j<col;j++){
               int sum =0;
               int countNearbyCells=1;
               sum+=img[i][j];
               
               if(isValid(img,i-1,j-1)){
                    sum+=img[i-1][j-1];
                    countNearbyCells++;
               }   
                if(isValid(img,i,j-1)){
                     sum+=img[i][j-1];
                     countNearbyCells++;
                }
                   
                if(isValid(img,i+1,j-1)){
                    sum+=img[i+1][j-1];
                    countNearbyCells++;
                }
                    
                if(isValid(img,i+1,j)){
                     sum+=img[i+1][j];
                     countNearbyCells++;
                }
                   
                if(isValid(img,i+1,j+1)){
                   sum+=img[i+1][j+1];
                   countNearbyCells++;
                }
                    
                if(isValid(img,i,j+1)){
                    sum+=img[i][j+1];
                    countNearbyCells++;
                }
                    
                if(isValid(img,i-1,j+1)){
                     sum+=img[i-1][j+1];
                     countNearbyCells++;
                }
                if(isValid(img,i-1,j))
                {
                    sum+=img[i-1][j];
                    countNearbyCells++;
                }
               
                ans[i][j]=sum/countNearbyCells;


           }
       } 
        return ans;
    }
    public boolean isValid(int[][] arr,int i,int j){
        int rows=arr.length;
        int col=arr[0].length;
        if(i>=0&&i<rows&&j>=0&&j<col)
            return true;
        return false;
    }
}