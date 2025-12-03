class Solution {
    boolean subset(int[] arr, int sum){
        int m = arr.length+1;
        int n = sum+1;
        boolean[][] dp = new boolean[m][n];
        
        for(int i = 0 ;i <m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0)dp[i][j] = false;
                if(j == 0)dp[i][j] = true;
            }
        }
        
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        if(sum %2 != 0)return false;
        else return subset(nums,sum/2);
    }
}