class Solution {
    int dp[][];
    public int helper(int m,int n){

        if(m == 0 && n == 0)return dp[m][n] = 1;

        if(m < 0 || n < 0)return 0;
        if(dp[m][n] != -1)return dp[m][n];

        int up = helper(m-1,n);
        int left = helper(m,n-1);
        return dp[m][n] = up + left;
    }
    public int uniquePaths(int m, int n) {
        dp= new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return helper(m-1,n-1);
    }
}