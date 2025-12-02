class Solution {
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> sub,int ind){
            res.add(new ArrayList<>(sub));
            
        

        
        for(int i = ind;i<nums.length ; i++){
            if(i > ind && nums[i] == nums[i-1])continue;

            sub.add(nums[i]);
            helper(nums,res,sub,i+1);
            sub.remove(sub.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(nums, res, sub, 0);
        return res;
    }
}