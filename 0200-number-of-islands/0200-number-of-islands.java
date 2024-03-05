class Solution {
    
    public int numIslands(char[][] grid) {
        int ans=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    
                    num(grid,i,j);
                }
            }
        }
        return ans;
       
    }
    
    public void num(char[][] grid,int i,int j){
       
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1'){
             grid[i][j]='0';
            num(grid,i-1,j);
            
            num(grid,i+1,j);
            num(grid,i,j-1);
            num(grid,i,j+1);
        }
        
    }
}