1class Solution {
2     HashMap<String,Integer> dp=new HashMap<>();
3    public int longestStrChain(String[] words) {
4       
5
6        int max = 1;
7        for (int i = 0; i < words.length; i++) {
8            max = Math.max(max, solve(words[i], words));
9        }
10        return max;
11    }
12
13    private int solve(String curr, String[] words) {
14        if(dp.containsKey(curr)){
15            return dp.get(curr);
16        }
17        int best = 1;
18        for (String next : words) {
19            if (isPredecessor(curr, next)) {
20                best = Math.max(best, 1 + solve(next, words));
21            }
22        }
23        dp.put(curr,best);
24        return best;
25    }
26
27    private boolean isPredecessor(String s1, String s2) {
28        if (s2.length() != s1.length() + 1) return false;
29
30        int i = 0, j = 0;
31        boolean skipped = false;
32
33        while (i < s1.length() && j < s2.length()) {
34            if (s1.charAt(i) == s2.charAt(j)) {
35                i++;
36                j++;
37            } else {
38                if (skipped) return false;
39                skipped = true;
40                j++;
41            }
42        }
43        return true;
44    }
45}
46