class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int count = 0;
        int tm = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1)count++;

                if(grid[i][j] == 2 && vis[i][j] == 0){
                    vis[i][j] = 2;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int cnt = 0;
        int dro[] = {-1,0,1,0};
        int dco[] = {0,-1,0,1};

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int time = q.peek().time;
            q.poll();
            tm = Math.max(tm,time);

            for(int i = 0;i<4;i++){
                int nro = row+dro[i];
                int nco = col+dco[i];

                if(nro>=0 && nro<m&&nco>=0&&nco<n&&vis[nro][nco] == 0&&grid[nro][nco] == 1){
                    vis[nro][nco] = 2;
                    q.add(new Pair(nro,nco,(time+1)));
                    cnt++;
                }
            }
            
        }
        if(cnt != count)return -1;
        return tm;
    }
}