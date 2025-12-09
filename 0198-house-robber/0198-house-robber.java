class Solution {
    
    public static int solve(int nums[], int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int left = solve(nums, i + 2, dp) + nums[i];
        int right = solve(nums, i + 1, dp);
        dp[i] = Math.max(left, right);
        return dp[i];
    }
    public int rob(int[] nums) {
         int dp[] = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return solve(nums, 0, dp);
    }
}
public class house_robber {


    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 1};
       
    }

}