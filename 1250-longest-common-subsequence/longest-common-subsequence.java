class Solution {
    public int[][] dp;
    public int helper(String text1, String text2, int m, int n){
        if(n == 0 || m == 0)return 0;
        if(dp[m][n] != -1)return dp[m][n];

        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
             dp[m][n] = 1 + helper(text1, text2, m - 1, n - 1);
        }

        else dp[m][n] = Math.max(helper(text1,text2,m-1,n), helper(text1,text2,m,n-1));
        
        return dp[m][n];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        dp = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return helper(text1,text2,m,n);
    }
}