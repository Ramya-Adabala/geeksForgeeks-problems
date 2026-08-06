class Solution {
    public int orangesRot(int[][] grid) {
        // code here
        int m=grid.length;
        int n=grid[0].length; int total=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                q.offer(new int[] {i,j});
                }
              if(grid[i][j]==1) 
             total++;
                }
        }
        if(total==0) return 0;
        int dx[]={0,0,-1,1};
        int []dy={1,-1,0,0};
        int time=0;
    while(!q.isEmpty()){
        int z=q.size();
         
         for(int i=0;i<z;i++){
            int p[]=q.poll();
            for(int j=0;j<4;j++){
                int x=p[0]+dx[j];
                int y=p[1]+dy[j];
                if(x<0 || y<0 || x>=m|| y>=n || grid[x][y]==0 || grid[x][y]==2)
                continue;
                grid[x][y]=2;
                q.offer(new int[]{x,y});
                total--;
            }
         }
         if(q.size()!=0){
         time++;
         }

    }
    return (total==0)?time:-1;
    }
}