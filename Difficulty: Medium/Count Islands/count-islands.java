class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   if(grid[i][j]=='L'){
                       dfs(i,j,m,n,grid);
                       res++;
                   }
               }
        }
        return res;
    }
 static void dfs(int i,int j,int m,int n,char mat[][]){
     if(i<0 || j<0|| i>=m || j>=n)
     return ;
     if(mat[i][j]=='L'){
         mat[i][j]='$';
         dfs(i-1,j,m,n,mat);
         dfs(i,j-1,m,n,mat);
         dfs(i+1,j,m,n,mat);
         dfs(i,j+1,m,n,mat);
         dfs(i-1,j-1,m,n,mat);
         dfs(i+1,j+1,m,n,mat);
         dfs(i-1,j+1,m,n,mat);
         dfs(i+1,j-1,m,n,mat);
     }
    }
}