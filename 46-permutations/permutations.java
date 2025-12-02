class Solution {
    public void helper(int[] nums, List<List<Integer>> res, int ind){
        if(ind == nums.length){
            List<Integer> sub = new ArrayList<>();
            for(int i : nums){
                sub.add(i);
            }
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i = ind; i<nums.length ;i++){

            swap(nums,i,ind);
            helper(nums,res,ind+1);
            swap(nums,i,ind);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(nums,res,0);
        return res;
    }
}