1class Solution {
2    public int countElements(int[] nums, int k) {
3        int n = nums.length;
4        if (k == 0) return n;  
5
6        Arrays.sort(nums);
7        int kthLargest = nums[n - k];
8
9        int count = 0;
10        for (int x : nums) {
11            if (x < kthLargest) count++;
12        }
13        return count;
14    }
15}
16