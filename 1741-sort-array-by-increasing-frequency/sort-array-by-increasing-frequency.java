class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        Integer[] arr = new Integer[n];

        for(int i =0;i<n;i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr,(a,b) -> {
            int f = Integer.compare(mp.get(a),mp.get(b));
            if( f != 0)return f;
            return Integer.compare(b,a);
        });

        int[] res = new int[n];

        for(int i=0;i<n;i++){
            res[i] = arr[i];
        }

        return res;

    }
}