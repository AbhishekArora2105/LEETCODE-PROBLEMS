class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0,new ArrayList<>(),res,candidates,target);
        return res;
    }

    public void helper(int ind,List<Integer> curr,List<List<Integer>> res,int[] nums,int target){
        if(ind == nums.length){
            if(target == 0)res.add(new ArrayList<>(curr));
            return;
        }

        if(nums[ind] <= target){
            curr.add(nums[ind]);
        helper(ind,curr,res,nums,target-nums[ind]);
        curr.remove(curr.size() - 1);
        }
        helper(ind+1,curr,res,nums,target);
    }
}