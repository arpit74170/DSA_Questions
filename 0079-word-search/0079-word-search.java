class Solution {

    public boolean safe(char grid[][],int i,int j){
       
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]!='#' ){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean  solve(char grid[][],String word,int i,int j,int w){
        // if(word.length()==1 && grid[i][j]==word.charAt(w)){
        //     return true;
        // }
       
        if(w==word.length() ){
            return true;
        }
         if ((!safe(grid,i,j)) || grid[i][j] != word.charAt(w)  ) {
             return false;
        }
        char temp=grid[i][j];
        grid[i][j]='#';
        if(solve(grid,word,i+1,j,w+1)){
                return true;
        }
          if( solve(grid,word,i-1,j,w+1)){
             return true;
        }
          if( solve(grid,word,i,j+1,w+1)){
                return true;
        }
          if(solve(grid,word,i,j-1,w+1)){
           
            return true;
        }
        grid[i][j]=temp;
        return false;
        
    }
    public boolean exist(char[][] grid, String word) {
        boolean ans=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                     if(solve(grid,word,i,j,0)){
                        return true;
                }
            }
        }
        return false;
    }
}


// class Solution {

//     public boolean safe(char grid[][], int i, int j) {
//         return i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] != '#';
//     }

//     public boolean solve(char grid[][], String word, int i, int j, int w) {
//         // matched full word
//         if (w == word.length()) {
//             return true;
//         }

//         // out of bounds or char mismatch
//         if (!safe(grid, i, j) || grid[i][j] != word.charAt(w)) {
//             return false;
//         }

//         char temp = grid[i][j];
//         grid[i][j] = '#'; // mark visited

//         // explore 4 directions
//         if (solve(grid, word, i + 1, j, w + 1)) return true;
//         if (solve(grid, word, i - 1, j, w + 1)) return true;
//         if (solve(grid, word, i, j + 1, w + 1)) return true;
//         if (solve(grid, word, i, j - 1, w + 1)) return true;

//         grid[i][j] = temp; // backtrack
//         return false;
//     }

//     public boolean exist(char[][] grid, String word) {

//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {

//                 if (grid[i][j] == word.charAt(0)) {
//                     if (solve(grid, word, i, j, 0))
//                         return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
