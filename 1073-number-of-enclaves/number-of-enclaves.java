class Solution {
    public void dfs(int row,int col,int[][] board,int[][] vis){
        vis[row][col] = 1;
        int m = board.length;
        int n = board[0].length;
        int[] dr = {0, -1, 0, 1};
        int[] dc = {-1, 0, 1, 0};

        for(int i = 0; i<4;i++){
            int nro = row+dr[i];
            int nco = col+dc[i];

            if(nro>=0 && nro<m&& nco>=0&& nco<n&& vis[nro][nco] == 0 && board[nro][nco] == 1){
                dfs(nro,nco,board,vis);
                
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int cnt = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if((i==0 || j == 0 || i == m-1 || j == n-1 ) && vis[i][j] == 0 && grid[i][j] == 1){
                    dfs(i,j,grid,vis);
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}