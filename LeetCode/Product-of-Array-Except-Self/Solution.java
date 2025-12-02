1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int l[]=new int[n];
5        int r[]=new int[n];
6        int res[]=new int[n];
7        l[0]=1;
8        r[n-1]=1;
9        for(int i=1;i<n;i++){
10            l[i]=nums[i-1]*l[i-1];
11        }
12          for(int i=n-2;i>=0;i--){
13            r[i]=nums[i+1]*r[i+1];
14        }
15        for(int i=0;i<n;i++){
16            res[i]=l[i]*r[i];
17        }
18        return res;
19    }
20}