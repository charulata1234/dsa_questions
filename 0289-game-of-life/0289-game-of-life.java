class Solution {
    public void gameOfLife(int[][] board) {
        /*
        I mutate the numbers to know how to rewrite it in the second pass
        0->0: 0
        0->1: 11
        1->0: 10
        1->1: 1
        */
        int rows = board.length;
        int cols = board[0].length;
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(board[i][j] == 0) processDead(board, i, j);
                else processAlive(board, i, j);
            }            
        }

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(board[i][j] == 10) board[i][j] = 0;
                if(board[i][j] == 11) board[i][j] = 1;
            }            
        }
    }


    private void processAlive(int[][] board, int row, int col){
        int alive = 0;  
        if (isAlive(board, row-1, col-1)) alive++;
        if (isAlive(board, row-1, col)) alive++;
        if (isAlive(board, row-1, col+1)) alive++;
        if (isAlive(board, row, col-1)) alive++;
        if (isAlive(board, row, col+1)) alive++;
        if (isAlive(board, row+1, col-1)) alive++;
        if (isAlive(board, row+1, col)) alive++;
        if (isAlive(board, row+1, col+1)) alive++;
        if(alive < 2 ) board[row][col] = 10;
        if(alive >3) board[row][col] = 10;
    }

    private void processDead(int[][] board, int row, int col){
        int alive = 0;
        if (isAlive(board, row-1, col-1)) alive++;
        if (isAlive(board, row-1, col)) alive++;
        if (isAlive(board, row-1, col+1)) alive++;
        if (isAlive(board, row, col-1)) alive++;
        if (isAlive(board, row, col+1)) alive++;
        if (isAlive(board, row+1, col-1)) alive++;
        if (isAlive(board, row+1, col)) alive++;
        if (isAlive(board, row+1, col+1)) alive++;
        if(alive ==3) board[row][col] = 11;
    }

    private boolean isAlive(int[][] board, int row, int col){
        if(row < 0 || col < 0 || row>board.length-1 || col > board[0].length-1) return false;
        return board[row][col] == 1 || board[row][col] == 10;
    }
}