1class Solution { 
2    public boolean safe(char[][] board,int row,int col, int k){
3        //for row
4        for(int i=0;i<board.length;i++){
5            if(board[i][col]==(char)(k+'0')){
6                return false;
7            }
8        }
9        //col
10           for(int j=0;j<board.length;j++){
11            if(board[row][j]==(char)(k+'0')){
12                return false;
13            }
14        }
15        //grid
16        int sr=(row/3)*3;
17        int sc=(col/3)*3;
18        for(int i=sr;i<sr+3;i++){
19            for(int j=sc;j<sc+3;j++){
20                if(board[i][j]==(char)(k+'0')){
21                    return false;
22                }
23            }
24        }
25        return true;
26    }
27    public boolean helper(char[][] board,int row, int col){
28        if(row==board.length){
29            return true;
30        }
31        int nrow=0;
32        int ncol=0;
33        // if(col<board.length){
34        //     ncol=col+1;
35        //     nrow=row;
36        // }
37        // else{
38        //     nrow=row+1;
39        //     ncol=0;
40        // }
41         if(col == board.length-1) {
42           nrow = row + 1;
43           ncol = 0;
44       } else {
45           nrow = row;
46           ncol = col + 1;
47       }
48        if(board[row][col]!='.'){
49            return helper(board,nrow,ncol);
50        }
51        else{
52            for(int i=1;i<=9;i++){
53           
54                if(safe(board,row,col,i)){
55                    board[row][col]=(char)(i+'0');
56                    if(helper(board,nrow,ncol)){
57                        return true;
58                    }
59                    else{
60                        board[row][col]='.';
61                    }
62                }
63            }
64        }
65        return false;
66
67
68    }
69    public void solveSudoku(char[][] board) {
70         helper(board,0,0);
71    }
72}