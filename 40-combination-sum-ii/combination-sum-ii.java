class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,new ArrayList<>(),res,candidates,target);
        return res;
    }

    public void helper(int ind,List<Integer> curr, List<List<Integer>> res,int[] nums,int target){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int j = ind;j<nums.length;j++){
            if(j > ind && nums[j] == nums[j-1])continue;

            if(nums[j] > target)break;

            curr.add(nums[j]);
            helper(j+1,curr,res,nums,target - nums[j]);
            curr.remove(curr.size() - 1);
        }

    }
}