class Solution {

    public int solve(int i, int j, int[][] dp) {

        // base case
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;

        
        if(dp[i][j] != -1) return dp[i][j];

        int up = solve(i - 1, j, dp);
        int left = solve(i, j - 1, dp);

        return dp[i][j] = up + left;
    }

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];

        
        for(int a = 0; a < m; a++){
            for(int b = 0; b < n; b++){
                dp[a][b] = -1;
            }
        }

        return solve(m - 1, n - 1, dp);
    }
}

// class Solution {
//     public int solve(int i,int j,int dp[][]){
//          //base 
//         if(i==0 && j==0){
//             return 1;
//         }
//         if(i<0 || j<0){
//             return 0;
//         }
//          dp[i-1][j]=solve(i-1,j,dp);
//          dp[i][j-1]=solve(i,j-1,dp);
//         return dp[i-1][j]+dp[i][j-1];
//     }
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
        
//         for (int j = 0; j < n; j++) {
//             dp[0][j] = -1;
//         }

//         for (int i = 0; i < m; i++) {
//             dp[i][0] = -1;
//         }
//        return solve(m-1,n-1,dp);



//     }
// }
