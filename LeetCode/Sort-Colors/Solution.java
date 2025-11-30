1class Solution {
2    public void sortColors(int[] nums) {
3        int i=0;
4        int c=0;
5        int j=nums.length-1;
6        while(c<=j){
7            if(nums[c]==2){
8                //swaf
9                int t=nums[c];
10                nums[c]=nums[j];
11                nums[j]=t;
12                j--;
13            }
14            else if(nums[c]==1){
15                c++;
16
17            }
18            else if(nums[c]==0){
19                //swaf with i
20                 int t=nums[i];
21                nums[i]=nums[c];
22                nums[c]=t;
23                i++;c++;
24            }
25        }
26        
27    }
28}