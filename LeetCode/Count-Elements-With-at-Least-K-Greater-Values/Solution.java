1class Solution {
2    public int countElements(int[] nums, int k) {
3          if(k==0){
4            return nums.length;
5        }
6        if(nums.length==1 ){
7            return 0;
8        }
9      
10        int n=nums.length;
11        Arrays.sort(nums);
12        int c=0;
13        int kl=nums[n-k];
14        for(int i=0;i<n-k;i++){
15            if(nums[i]<kl){
16                c++;
17            }
18        }
19        return c;
20    }
21}