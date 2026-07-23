// Last updated: 7/23/2026, 2:54:48 PM
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] copy = new int[m][n];

        // Copy the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = board[i][j];
            }
        }

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                for (int k = 0; k < 8; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];

                    if (ni >= 0 && ni < m &&
                        nj >= 0 && nj < n &&
                        copy[ni][nj] == 1)
                        live++;
                }

                if (copy[i][j] == 1) {
                    if (live < 2 || live > 3)
                        board[i][j] = 0;
                } else {
                    if (live == 3)
                        board[i][j] = 1;
                }
            }
        }
    }
}