class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int curri = 0;
        int prev = arr[0];
        int prev2 = 0;
        
        for(int i = 1;i<n;i++){
            int take = arr[i]+prev2;
            int not = prev;
            
            curri = Math.max(take,not);
            
            prev2 = prev;
            prev = curri;
        }
        
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        int[] temp1 = Arrays.copyOfRange(nums,0,n-1);
        int[] temp2 = Arrays.copyOfRange(nums,1,n);

        return Math.max(findMaxSum(temp1),findMaxSum(temp2));
    }
}