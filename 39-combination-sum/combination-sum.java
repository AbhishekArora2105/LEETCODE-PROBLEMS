class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(candidates,target,0,res,sub);
        return res;
    }

    public void helper(int[] nums, int target, int i, List<List<Integer>> res, List<Integer> sub){
        if(i == nums.length){
            if(target == 0){
                res.add(new ArrayList<>(sub));
                return;
            }
            return;
        }

        if(nums[i]<= target){
            sub.add(nums[i]);
            helper(nums, target - nums[i], i, res, sub);
            sub.remove(sub.size()-1);
        }
        helper(nums,target, i+1, res, sub);
    }
}