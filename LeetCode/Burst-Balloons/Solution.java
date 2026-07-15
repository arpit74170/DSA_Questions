1class Solution {
2
3    public int solve(int i, int j, int arr[],int dp[][]){
4        if(i>j){
5            return 0;
6        }
7        if(dp[i][j]!=-1){
8            return dp[i][j];
9        }
10        int ans=0;
11        for(int k=i;k<=j;k++){
12            int cost=arr[i-1] * arr[k]*arr[j+1]+solve(i,k-1,arr,dp)+solve(k+1,j,arr,dp);
13            ans=Math.max(cost,ans);
14            dp[i][j]=ans;
15        }
16        return dp[i][j];
17    }
18
19    public int maxCoins(int[] nums) {
20        int arr[]=new int[nums.length+2];
21        for(int i=0;i<nums.length;i++){
22            arr[i+1]=nums[i];
23        }
24        arr[0]=1;
25        arr[arr.length-1]=1;
26        int dp[][]=new int[arr.length][arr.length];
27
28        for(int i=0;i<arr.length;i++){
29            Arrays.fill(dp[i],-1);
30        }
31        // System.out.print(arr[1]);
32        // System.out.print(arr[nums.length]);
33      return  solve(1,nums.length,arr,dp);
34        
35    }
36}