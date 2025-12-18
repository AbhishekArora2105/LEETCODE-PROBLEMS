class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int n = intervals.length;

        int maxTime = intervals[0][1];
        int cnt = 1;

        for(int i = 0;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(currStart >= maxTime){
                cnt++;
                maxTime = currEnd;
            }

        }

        return n - cnt;
    }
}