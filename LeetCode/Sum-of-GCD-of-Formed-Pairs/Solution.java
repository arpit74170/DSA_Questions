1class Solution {
2
3    public long gcd (long a,long b){
4        while(b==0){
5            return Math.abs(a);
6        }
7        return gcd(b,a%b);
8    }
9    public long gcdSum(int[] nums) {
10        long maxarr[]=new long [nums.length];
11
12        maxarr[0]=nums[0];
13
14        for(int i=1;i<nums.length;i++){
15            maxarr[i]=Math.max(maxarr[i-1],nums[i]);
16        }
17        long arr[]=new long[nums.length];
18        long min=Long.MAX_VALUE;
19        long max=Long.MIN_VALUE;
20        for(int i=0;i<arr.length;i++){
21            arr[i]=gcd(nums[i],maxarr[i]);
22            min=Math.min(arr[i],min);
23            max=Math.max(arr[i],max);
24        }
25        long sum=0;
26    Arrays.sort(arr);
27        int i=0;
28
29        int j=nums.length-1;
30        while(i<j){
31            sum+=gcd(arr[i],arr[j]);
32            i++;
33            j--;
34        }
35        return sum;
36
37    }
38}