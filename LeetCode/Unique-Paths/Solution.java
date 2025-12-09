1//Method 1
2
3// class Solution {
4//     public int uniquePaths(int m, int n) {
5//         int grid[][] = new int[m][n];
6//         for (int i = 0; i < m; i++) {
7//             grid[i][0] = 1;
8
9//         }
10//         for (int i = 0; i < n; i++) {
11//             grid[0][i] = 1;
12
13//         }
14//         for (int i = 1; i < m; i++) {
15//             for (int j = 1; j < n; j++) {
16//                 grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
17//             }
18
19//         }
20//         return grid[m - 1][n - 1];
21//     }
22// }
23
24//Method 2
25
26class Solution {
27
28    public static int solver(int m, int n, int i, int j, int dp[][]) {
29        if (i >= m || j >= n) {
30            return 0;
31        }
32        if (i == m - 1 && j == n - 1) {
33            return 1;
34        }
35
36        if (dp[i][j] == -1) {
37            int left = solver(m, n, i + 1, j, dp);
38            int right = solver(m, n, i, j + 1, dp);
39            dp[i][j] = left + right;
40
41        }
42
43        return dp[i][j];
44
45    }
46 public int uniquePaths(int m, int n) {
47   
48int dp[][]=new int [m][n];for(
49        int i = 0;i<m;i++)
50        {
51            for (int j = 0; j < n; j++) {
52                dp[i][j] = -1;
53            }
54        }
55        return solver(m, n, 0, 0,dp); 
56    }
57}
58
59
60// class Solution {
61
62//     public int solve(int i, int j, int[][] dp) {
63
64//         // base case
65//         if(i == 0 && j == 0) return 1;
66//         if(i < 0 || j < 0) return 0;
67
68        
69//         if(dp[i][j] != -1) return dp[i][j];
70
71//         int up = solve(i - 1, j, dp);
72//         int left = solve(i, j - 1, dp);
73
74//         return dp[i][j] = up + left;
75//     }
76
77//     public int uniquePaths(int m, int n) {
78
79//         int[][] dp = new int[m][n];
80
81        
82//         for(int a = 0; a < m; a++){
83//             for(int b = 0; b < n; b++){
84//                 dp[a][b] = -1;
85//             }
86//         }
87
88//         return solve(m - 1, n - 1, dp);
89//     }
90// }
91
92// class Solution {
93//     public int solve(int i,int j,int dp[][]){
94//          //base 
95//         if(i==0 && j==0){
96//             return 1;
97//         }
98//         if(i<0 || j<0){
99//             return 0;
100//         }
101//          dp[i-1][j]=solve(i-1,j,dp);
102//          dp[i][j-1]=solve(i,j-1,dp);
103//         return dp[i-1][j]+dp[i][j-1];
104//     }
105//     public int uniquePaths(int m, int n) {
106//         int[][] dp = new int[m][n];
107        
108//         for (int j = 0; j < n; j++) {
109//             dp[0][j] = -1;
110//         }
111
112//         for (int i = 0; i < m; i++) {
113//             dp[i][0] = -1;
114//         }
115//        return solve(m-1,n-1,dp);
116
117
118
119//     }
120// }
121
122// class Solution {
123
124//    public int uniquePaths(int m, int n) {
125//     int grid[][]=new int[m][n];
126//     for(int i=0;i<m-1;i++){
127//         grid[i][0]=1;
128//     }
129//      for(int i=0;i<n-1;i++){
130//         grid[0][i]=1;
131//     }
132//     for(int i=1;i<m-1;i++){
133//         for(int j=1;j<n-1;j++){
134//             grid[i][j]=grid[i-1][j]+grid[i][j-1];
135//         }
136//     }
137//     return grid[m][n];
138
139//     }
140// }
141