class Pair{
    int key;
    int[] val;

    Pair(int key, int[] val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxh = new PriorityQueue<>((a,b) -> Integer.compare(b.key,a.key));
        
        for(int i = 0;i<points.length;i++){
            int a = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            maxh.offer(new Pair(a,points[i]));

            if( maxh.size() > k){
                maxh.poll();
            }
        }

        int[][] res = new int[k][2];
        int index = 0;
        while(!maxh.isEmpty()){
            Pair c = maxh.poll();
            res[index++] = c.val;
        }

        return res;
    }
}