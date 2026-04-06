1// class Solution {
2//     public int maxSubArray(int[] nums) {
3//         int n=nums.length;
4//         int maxsum=nums[0];
5//         int sum=nums[0];
6//         for(int i=1;i<n;i++){
7//             sum=Math.max(nums[i],nums[i]+sum);
8//             maxsum=Math.max(maxsum,sum);
9//         }
10//         return maxsum;
11//     }
12//}
13// class Solution {
14//     public int maxSubArray(int[] nums) {
15//         int n=nums.length;
16//         int max=nums[0];
17//         int cs=0;
18//         for(int i=0;i<n;i++){
19//             cs+=nums[i];
20//             max=Math.max(cs,max);
21//             if(cs<0){
22//                 cs=0;
23//             }
24//         }
25//         return max;
26//     }
27// }
28
29class Solution {
30    public int maxSubArray(int[] nums) {
31        int n=nums.length;
32        int cursum=0;
33        int maxsum=nums[0];
34        for(int i=0;i<n;i++){
35            cursum+=nums[i];
36            maxsum=Math.max(cursum,maxsum);
37            if(cursum<0){
38                cursum=0;
39            }
40        }
41 return maxsum;
42        }
43       
44    }