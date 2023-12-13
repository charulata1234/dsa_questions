class Solution {
    public int numSpecial(int[][] mat) {
        int specialCountNumber=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sumRow=0;
                int sumCol=0;
                if(mat[i][j]==1){
                    for(int k=0;k<mat.length;k++){
                        sumRow+=mat[k][j];
                    }
                    for(int k=0;k<mat[0].length;k++){
                        sumCol+=mat[i][k];
                    }
                    if(sumCol+sumRow==2){
                        specialCountNumber++;
                    }

                }
            }
        }
        return specialCountNumber;
    }
}