class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0,new ArrayList<>(),nums,res);
        return res;
    }

    public void helper(int ind,List<Integer> curr, int[] nums, List<List<Integer>> res){
        if(ind == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[ind]);
        helper(ind+1,curr,nums,res);
        curr.remove(curr.size()-1);
        helper(ind+1,curr,nums,res);
    }

}