class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length, spare = n - k, diff[] = new int[n];
        long tp = 0;
        for (int i = 0; i < n; i++) {
            tp += technique1[i];
            diff[i] = technique2[i] - technique1[i];
        }
        Arrays.sort(diff);
        for (int i = n - 1; i >= 0 && spare > 0; i--, spare--)
            if (diff[i] > 0)
                tp += diff[i];
        return tp;
    }
}