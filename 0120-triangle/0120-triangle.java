class Solution {
    public int solve(List<List<Integer>> t, int i, int j, Integer[][] dp) {

        // base case: last row
        if (i == t.size() - 1) {
            return t.get(i).get(j);
        }

        if (dp[i][j] != null) return dp[i][j];

        int down = solve(t, i + 1, j, dp);
        int diagonal = solve(t, i + 1, j + 1, dp);

        return dp[i][j] = t.get(i).get(j) + Math.min(down, diagonal);
    }

    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        Integer[][] dp = new Integer[n][n];
        return solve(t, 0, 0, dp);
    }
}
