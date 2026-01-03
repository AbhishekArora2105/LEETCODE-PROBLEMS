class Solution {

    public boolean helper(int[] nums, int sum){
        int m = nums.length+1;
        int n = sum+1;
        boolean dp[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = true;
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j - nums[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[m-1][n-1];

    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int val : nums){
            sum+=val;
        }

        if(sum % 2 != 0)return false;
        return helper(nums,sum/2);
    }
}