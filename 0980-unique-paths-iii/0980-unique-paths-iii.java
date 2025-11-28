class Solution {int res=0;
   public boolean safe(int i,int j,int grid[][]){
            if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!=-1){
                return true;
            }
            else{
                return false;
            }
        }
         public void check(int [][] grid, int i,int j,int c){
            if(grid[i][j]==2){
                if(c==0){
                    res++;
                    return;
                }
            }
            int temp=grid[i][j];
            grid[i][j]=-1;
            if(safe(i+1,j,grid)){
                check(grid,i+1,j,c-1);
            }
             if(safe(i-1,j,grid)){
                check(grid,i-1,j,c-1);
            }
             if(safe(i,j+1,grid)){
                check(grid,i,j+1,c-1);
            }
             if(safe(i,j-1,grid)){
                check(grid,i,j-1,c-1);
            }
            grid[i][j]=temp;
        }
    public int uniquePathsIII(int[][] grid) {
        int c=1;
        int sx=0;
        int sy=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    c++;
                }
                else if(grid[i][j]==1){
                 sx=i;
                 sy=j;   
                }
            }
        }
        check(grid,sx,sy,c);
        return res;
    }
}