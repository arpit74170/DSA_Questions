1class Solution {
2    public int maxDistinct(String s) {
3          int c=0;
4    int arr[]=new int [26];
5    for(int i=0;i<s.length();i++){
6        char t=s.charAt(i);
7        if(arr[t-'a']==0){
8            c++;
9            arr[t-'a']++;
10        }
11    }
12    return c;
13    }
14}