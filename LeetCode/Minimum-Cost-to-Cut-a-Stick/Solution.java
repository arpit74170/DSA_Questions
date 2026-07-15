1class Solution {
2    public int solve(int s, int e, int[] cuts, int i, int j,int dp[][]){
3        if(i>j){
4            return 0;
5        }
6        if(dp[i][j]!=-1){
7            return dp[i][j];
8        }
9        int mincost=Integer.MAX_VALUE;
10        for(int idx=i;idx<=j;idx++){
11            int cost=(e-s)+ solve(s,cuts[idx],cuts,i,idx-1,dp)+ solve(cuts[idx],e,cuts,idx+1,j,dp);
12              mincost=Math.min(mincost,cost);
13        }
14        return dp[i][j]= mincost;
15    }
16    public int minCost(int n, int[] cuts) {
17        Arrays.sort(cuts);
18        int dp[][]=new int[cuts.length][cuts.length];
19          for (int[] row : dp) {
20            Arrays.fill(row, -1);
21        }
22        
23      return  solve(0,n,cuts,0,cuts.length-1,dp);
24    }
25}