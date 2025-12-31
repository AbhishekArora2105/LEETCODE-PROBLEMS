class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        } 

        PriorityQueue<Integer> minh = new PriorityQueue<>((a,b) -> Integer.compare(mp.get(a),mp.get(b)));

        for(int val : mp.keySet()){
            minh.offer(val);
            
            if(minh.size() > k){
                minh.poll();
            }
        }

        while(!minh.isEmpty()){
            int c = minh.poll();
            res.add(c);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}