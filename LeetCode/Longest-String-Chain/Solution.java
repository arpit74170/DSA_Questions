1class Solution {
2
3    public boolean isok(String s1,String s2){
4        int i=0;
5        int j=0;
6        boolean skip=false;
7        if(s1.length()+1 !=s2.length()){
8            return false;
9        }
10            else{
11              while(i !=s1.length() && j!=s2.length()){
12                if(s1.charAt(i)!=s2.charAt(j)  ){
13                    if(skip){
14                        return false;
15                    }
16                    // j++;
17                    j++;
18                    skip=true;
19                }
20                else{
21                    i++;j++;
22                }
23              }
24            }
25            return true;
26    }
27
28    public int longestStrChain(String[] words) {
29        Arrays.sort(words,(a,b)->a.length()-b.length());
30        int max=1;
31        int dp[]=new int[words.length];
32        Arrays.fill(dp,1);
33        for(int i=1;i<words.length;i++){
34            for(int j=0;j<i;j++){
35                if(isok(words[j],words[i])){
36                    if(dp[i] < dp[j]+1 ){
37                        dp[i]=dp[j]+1;
38                        max=Math.max(max,dp[i]);
39                    }
40                }
41            }
42        }
43        return max;
44       
45            
46            
47        
48    }
49}