class Solution {
    public void helper(int[] nums, Set<List<Integer>> res, int ind){
        if(ind == nums.length){
            List<Integer> curr = new ArrayList<>();
            for(int i : nums){
                curr.add(i);
            }
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = ind;i<nums.length;i++){

            swap(nums,i , ind);
            helper(nums,res,ind+1);
            swap(nums,i,ind);
        }
    }

    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        helper(nums,res,0);
        List<List<Integer>> final1 = new ArrayList<>(res);
        return final1;
    }
}