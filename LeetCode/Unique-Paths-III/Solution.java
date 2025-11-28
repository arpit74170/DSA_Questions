1class Solution {int res=0;
2   public boolean safe(int i,int j,int grid[][]){
3            if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!=-1){
4                return true;
5            }
6            else{
7                return false;
8            }
9        }
10         public void check(int [][] grid, int i,int j,int c){
11            if(grid[i][j]==2){
12                if(c==0){
13                    res++;
14                    return;
15                }
16            }
17            int temp=grid[i][j];
18            grid[i][j]=-1;
19            if(safe(i+1,j,grid)){
20                check(grid,i+1,j,c-1);
21            }
22             if(safe(i-1,j,grid)){
23                check(grid,i-1,j,c-1);
24            }
25             if(safe(i,j+1,grid)){
26                check(grid,i,j+1,c-1);
27            }
28             if(safe(i,j-1,grid)){
29                check(grid,i,j-1,c-1);
30            }
31            grid[i][j]=temp;
32        }
33    public int uniquePathsIII(int[][] grid) {
34        int c=1;
35        int sx=0;
36        int sy=0;
37        for(int i=0;i<grid.length;i++){
38            for(int j=0;j<grid[0].length;j++){
39                if(grid[i][j]==0){
40                    c++;
41                }
42                else if(grid[i][j]==1){
43                 sx=i;
44                 sy=j;   
45                }
46            }
47        }
48        check(grid,sx,sy,c);
49        return res;
50    }
51}