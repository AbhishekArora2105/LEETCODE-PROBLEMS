class Solution {
    public int[] dp;
    public int helper(int ind, int nums[]){
        if(ind >= nums.length-1) return 0;
        if(dp[ind] != -1)return dp[ind];
        int mini = Integer.MAX_VALUE;

        for (int i = 1; i <= nums[ind]; i++) {
            int next = helper(ind + i, nums);
            if (next != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + next);
            }
        }
        return dp[ind] = mini;
    }

    public int jump(int[] nums) {
        dp = new int[nums.length + 1];
        for(int i = 0;i<=nums.length;i++){
            dp[i] = -1;
        }
        return helper(0,nums);
    }
}