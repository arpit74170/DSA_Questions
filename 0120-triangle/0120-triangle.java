// class Solution {
//     public int solve(List<List<Integer>> t, int i, int j, Integer[][] dp) {

//         // base case: last row
//         if (i == t.size() - 1) {
//             return t.get(i).get(j);
//         }

//         if (dp[i][j] != null) return dp[i][j];

//         int down = solve(t, i + 1, j, dp);
//         int diagonal = solve(t, i + 1, j + 1, dp);

//         return dp[i][j] = t.get(i).get(j) + Math.min(down, diagonal);
//     }

//     public int minimumTotal(List<List<Integer>> t) {
//         int n = t.size();
//         Integer[][] dp = new Integer[n][n];
//         return solve(t, 0, 0, dp);
//     }
// }
class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = t.get(n - 1).get(j);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int down = dp[i + 1][j];
                int diagonal = dp[i + 1][j + 1];
                dp[i][j] = t.get(i).get(j) + Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }
}
