class Solution {
      public static int solve(int nums[], int i, int[] dp, int end) {
        if (i >= end) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        // if (i != nums.length - 1) {
        int left = solve(nums, i + 2, dp, end) + nums[i];
        int right = solve(nums, i + 1, dp, end);
        dp[i] = Math.max(left, right);

        // }
        return dp[i];

    }

    public int rob(int[] nums) {
     if(nums.length==1){
        return nums[0];
     }
        int dp[] = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int rob1 = solve(nums, 1, dp, nums.length );
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int rob2 = solve(nums, 0, dp, nums.length-1);
        // System.out.println(rob1);
        // System.out.println(rob2);
            return Math.max(rob1, rob2);
    }
}
