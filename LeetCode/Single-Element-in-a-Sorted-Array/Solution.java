1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n=nums.length;
4        if(n==1){
5            return nums[0];
6        }
7        if(nums[0]!=nums[1]){
8            return nums[0];
9        }
10        if(nums[n-1]!=nums[n-2]){
11            return nums[n-1];
12        }
13        int low=1;
14        int high=n-2;
15        while(low<=high){
16            int mid=(low+high)/2;
17            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
18                return nums[mid];
19            }
20            else if(mid%2==0 && nums[mid-1]==nums[mid] || mid%2==1 && nums[mid]==nums[mid+1]){
21                high=mid-1;
22            }
23            else{
24                low=mid+1;
25            }
26        }
27        return -1;
28    }
29}