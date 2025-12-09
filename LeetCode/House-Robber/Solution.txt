1class Solution {
2    
3    public static int solve(int nums[], int i, int[] dp) {
4        if (i >= nums.length) {
5            return 0;
6        }
7        if (dp[i] != -1) {
8            return dp[i];
9        }
10
11        int left = solve(nums, i + 2, dp) + nums[i];
12        int right = solve(nums, i + 1, dp);
13        dp[i] = Math.max(left, right);
14        return dp[i];
15    }
16    public int rob(int[] nums) {
17         int dp[] = new int[nums.length];
18        for (int i = 0; i < dp.length; i++) {
19            dp[i] = -1;
20        }
21        return solve(nums, 0, dp);
22    }
23}
24public class house_robber {
25
26
27    public static void main(String args[]) {
28        int nums[] = {1, 2, 3, 1};
29       
30    }
31
32}