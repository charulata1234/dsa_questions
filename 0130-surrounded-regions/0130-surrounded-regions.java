class Solution {
    static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };

    public static void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        int vis[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            Arrays.fill(vis[i], 0);
        }

        for (int j = 0; j < c; j++) {
            //top row
            if (board[0][j] == 'O' && vis[0][j] == 0) dfs(0, j, vis, board, r, c);

            //bottom row
            if (board[r - 1][j] == 'O' && vis[r - 1][j] == 0) dfs(r - 1, j, vis, board, r, c);
        }

        for (int i = 0; i < r; i++) {
            //left col
            if (board[i][0] == 'O' && vis[i][0] == 0) dfs(i, 0, vis, board, r, c);

            //right col
            if (board[i][c - 1] == 'O' && vis[i][c - 1] == 0) dfs(i, c - 1, vis, board, r, c);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (vis[i][j] == 0 && board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    private static void dfs(int row, int col, int[][] vis, char[][] board, int r, int c) {
        vis[row][col] = 1;
        for (int i = 0; i <= 3; i++) {
            int nrow = row + dr[i];
            int ncol = col + dc[i];

            if (nrow >= 0 && nrow < r && ncol >= 0 && ncol < c && vis[nrow][ncol] == 0 && board[nrow][ncol] == 'O') {
                dfs(nrow, ncol, vis, board, r, c);
            }
        }
    }
}
