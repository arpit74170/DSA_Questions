1class Solution {
2
3    public boolean safe(char grid[][],int i,int j){
4       
5        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!='#' ){
6            return true;
7        }
8        else{
9            return false;
10        }
11    }
12    public boolean  solve(char grid[][],String word,int i,int j,int w){
13        // if(word.length()==1 && grid[i][j]==word.charAt(w)){
14        //     return true;
15        // }
16       
17        if(w==word.length()){
18            return true;
19        }
20         if ( !safe(grid,i,j) || grid[i][j] != word.charAt(w)) {
21             return false;
22        }
23        char temp=grid[i][j];
24        grid[i][j]='#';
25        if( solve(grid,word,i+1,j,w+1)){
26                return true;
27        }
28          if( solve(grid,word,i-1,j,w+1)){
29             return true;
30        }
31          if( solve(grid,word,i,j+1,w+1)){
32                return true;
33        }
34          if( solve(grid,word,i,j-1,w+1)){
35           
36            return true;
37        }
38        grid[i][j]=temp;
39        return false;
40        
41    }
42    public boolean exist(char[][] grid, String word) {
43        boolean ans=false;
44        for(int i=0;i<grid.length;i++){
45            for(int j=0;j<grid[0].length;j++){
46                     if(solve(grid,word,i,j,0)){
47                        return true;
48                }
49            }
50        }
51        return false;
52    }
53}
54
55
56// class Solution {
57
58//     public boolean safe(char grid[][], int i, int j) {
59//         return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] != '#';
60//     }
61
62//     public boolean solve(char grid[][], String word, int i, int j, int w) {
63//         // matched full word
64//         if (w == word.length()) {
65//             return true;
66//         }
67
68//         // out of bounds or char mismatch
69//         if (!safe(grid, i, j) || grid[i][j] != word.charAt(w)) {
70//             return false;
71//         }
72
73//         char temp = grid[i][j];
74//         grid[i][j] = '#'; // mark visited
75
76//         // explore 4 directions
77//         if (solve(grid, word, i + 1, j, w + 1)) return true;
78//         if (solve(grid, word, i - 1, j, w + 1)) return true;
79//         if (solve(grid, word, i, j + 1, w + 1)) return true;
80//         if (solve(grid, word, i, j - 1, w + 1)) return true;
81
82//         grid[i][j] = temp; // backtrack
83//         return false;
84//     }
85
86//     public boolean exist(char[][] grid, String word) {
87
88//         for (int i = 0; i < grid.length; i++) {
89//             for (int j = 0; j < grid[0].length; j++) {
90
91//                 if (grid[i][j] == word.charAt(0)) {
92//                     if (solve(grid, word, i, j, 0))
93//                         return true;
94//                 }
95//             }
96//         }
97//         return false;
98//     }
99// }
100