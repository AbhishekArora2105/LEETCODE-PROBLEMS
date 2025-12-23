class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i<nums.length;i++){
            int find = target - nums[i];
            if(mp.containsKey(find)){
                res[0] = mp.get(find);
                res[1] = i;
            }
            mp.put(nums[i],i);
        }
        return res;
    }
}