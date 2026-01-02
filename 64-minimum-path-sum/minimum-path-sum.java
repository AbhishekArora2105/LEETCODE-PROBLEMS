class Solution {
    int dp[][];
    public int helper(int i,int j,int[][] grid){
        if(i ==0 && j == 0)return grid[0][0];

        if(i < 0 || j < 0)return Integer.MAX_VALUE;;

        if(dp[i][j] != -1)return dp[i][j];

        int up = helper(i-1,j,grid);
        int left = helper(i,j-1,grid);

        return dp[i][j] = grid[i][j] + Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            } 
        }

        return helper(m-1,n-1,grid);

    }
}