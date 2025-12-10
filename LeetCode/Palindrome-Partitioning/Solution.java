1public class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(s, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(String s, int start, List<String> path, List<List<String>> result) {
9        // If we've reached the end of the string, add the current partition to the result list
10        if (start == s.length()) {
11            result.add(new ArrayList<>(path));
12            return;
13        }
14        // Explore all possible partitions
15        for (int end = start + 1; end <= s.length(); end++) {
16            // If the current substring is a palindrome, add it to the current path
17            if (isPalindrome(s, start, end - 1)) {
18                path.add(s.substring(start, end));
19                // Recur to find other partitions
20                backtrack(s, end, path, result);
21                // Backtrack to explore other partitions
22                path.remove(path.size() - 1);
23            }
24        }
25    }
26
27    private boolean isPalindrome(String s, int left, int right) {
28        // Check if the substring s[left:right+1] is a palindrome
29        while (left < right) {
30            if (s.charAt(left++) != s.charAt(right--)) {
31                return false;
32            }
33        }
34        return true;
35    }
36}