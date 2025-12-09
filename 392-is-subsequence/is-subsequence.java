class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length() + 1;
        int n = t.length() + 1;

        int[][] dp = new int[m][n];

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i ==0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m-1][n-1] == s.length();
    }
}