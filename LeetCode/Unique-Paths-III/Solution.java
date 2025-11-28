1class Solution {
2    int res = 0;
3
4    public boolean safe(int i, int j, int m, int n, int[][] matrix) {
5        return i >= 0 && i < m && j >= 0 && j < n && matrix[i][j] != -1;
6    }
7
8
9    public void check(int[][] matrix, int i, int j, int m, int n, int c) {
10        
11        if (matrix[i][j] == 2) {
12            if (c == 0) res++; 
13            return;
14        }
15
16        
17        matrix[i][j] = -1;
18
19  
20        if (safe(i + 1, j, m, n, matrix)) check(matrix, i + 1, j, m, n, c - 1);
21        if (safe(i - 1, j, m, n, matrix)) check(matrix, i - 1, j, m, n, c - 1);
22        if (safe(i, j + 1, m, n, matrix)) check(matrix, i, j + 1, m, n, c - 1);
23        if (safe(i, j - 1, m, n, matrix)) check(matrix, i, j - 1, m, n, c - 1);
24
25   
26        matrix[i][j] = 0;
27    }
28
29    public int uniquePathsIII(int[][] matrix) {
30        int m = matrix.length;
31        int n = matrix[0].length;
32        int c = 1;
33
34        int startX = 0, startY = 0;
35
36        for (int i = 0; i < m; i++) {
37            for (int j = 0; j < n; j++) {
38                if (matrix[i][j] == 0) c++;
39                else if (matrix[i][j] == 1) {
40                    startX = i;
41                    startY = j;
42                }
43            }
44        }
45
46        check(matrix, startX, startY, m, n, c);
47        return res;
48    }
49}
50