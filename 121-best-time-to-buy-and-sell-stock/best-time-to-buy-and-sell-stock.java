class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxP = 0;
        int mini = prices[0];
        for(int i = 1;i<n;i++){
            int cost = prices[i]-mini;
            maxP = Math.max(cost,maxP);
            mini = Math.min(mini,prices[i]);
        }

        return maxP;
    }
}