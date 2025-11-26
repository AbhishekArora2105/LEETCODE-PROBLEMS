class Pair{
    int row;
    int col;
    int step;
    Pair(int row,int col,int step){
        this.row = row;
        this.col = col;
        this.step = step;
    }
}
class Solution {

    


    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;
        int[][] vis = new int[m][n];
        int[][] des = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                    vis[i][j] = 1;
                    q.offer(new Pair(i,j,0));
                }else{
                    vis[i][j] = 0;
                }
            }
        }
        int[] dro = {0,-1,0,1};
        int[] dco = {-1,0,1,0};

        while(!q.isEmpty()){
            int ro = q.peek().row;
            int co = q.peek().col;
            int step = q.peek().step;
            des[ro][co] = step;
            q.remove();
            for(int i= 0;i<4;i++){
                int nro = ro + dro[i];
                int nco = co + dco[i];
                if(nro>=0 &&nro<m &&nco>=0 &&nco<n && vis[nro][nco] == 0 &&mat[nro][nco] == 1){
                    vis[nro][nco] = 1;
                    q.add(new Pair(nro,nco,step+1));
                }

            }
        }
        return des;
    }
}