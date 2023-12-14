class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowdiff1 = new int[grid.length];
        int[] coldiff1 = new int[grid[0].length];
int[] rowdiff0 = new int[grid.length];
        int[] coldiff0 = new int[grid[0].length];
        //calculate the diff arrays
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    rowdiff1[i]++;
                    coldiff1[j]++;
                } else {
                    rowdiff0[i]++;
                    coldiff0[j]++;
                }
            }
        }
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                grid[i][j] = rowdiff1[i] + coldiff1[j]-rowdiff0[i]-coldiff0[j];
            }
        }

        return grid; 
    }
}