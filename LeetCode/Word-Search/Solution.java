1class Solution {
2
3    public boolean safe(char grid[][],int i,int j){
4       
5        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!='#' ){
6            return true;
7        }
8        return false;
9    }
10    public boolean  solve(char grid[][],String word,int i,int j,int w){
11        // if(word.length()==1 && grid[i][j]==word.charAt(w)){
12        //     return true;
13        // }
14       
15        if(w==word.length()){
16            return true;
17        }
18         if ( !safe(grid,i,j) || grid[i][j] != word.charAt(w)) {
19             return false;
20        }
21        char temp=grid[i][j];
22        grid[i][j]='#';
23        if( solve(grid,word,i+1,j,w+1)){
24                return true;
25        }
26          if( solve(grid,word,i-1,j,w+1)){
27             return true;
28        }
29          if( solve(grid,word,i,j+1,w+1)){
30                return true;
31        }
32          if( solve(grid,word,i,j-1,w+1)){
33           
34            return true;
35        }
36        grid[i][j]=temp;
37        return false;
38        
39    }
40    public boolean exist(char[][] grid, String word) {
41        boolean ans=false;
42        for(int i=0;i<grid.length;i++){
43            for(int j=0;j<grid[0].length;j++){
44                     if(solve(grid,word,i,j,0)){
45                        return true;
46                }
47            }
48        }
49        return false;
50    }
51}
52
53