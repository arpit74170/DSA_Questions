// class Solution {
//       public static int solve(List<List<Integer>> t, int i, int j,int dp[][]) {
//         if (i == t.size() - 1) {
//             return t.get(i).get(j);

//         }
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }

//         int p1 = solve(t, i + 1, j + 1,dp);
//         int p2 = solve(t, i + 1, j,dp);
//         dp[i][j]=t.get(i).get(j) + Math.min(p1, p2);
//         return dp[i][j];

//     }

//     public int minimumTotal(List<List<Integer>> t) {
    
//          int dp[][]=new int [t.size()][t.size()];
//          for(int i=0;i<dp.length;i++){
//             for(int j=0;j<dp[0].length;j++){
//                 dp[i][j]=-1;
//             }
//          }


//         int ans = solve(t, 0, 0,dp);
//         return ans;
//     }
// }

class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
        return solve(0, 0, triangle, dp);
    }

    private int solve(int i, int j, List<List<Integer>> t, Integer[][] dp) {
        if (i == t.size() - 1) {
            return t.get(i).get(j);
        }

        if (dp[i][j] != null) return dp[i][j];

        int down = solve(i + 1, j, t, dp);
        int diag = solve(i + 1, j + 1, t, dp);

        dp[i][j] = t.get(i).get(j) + Math.min(down, diag);
        return dp[i][j];
    }
}