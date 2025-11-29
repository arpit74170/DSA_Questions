1class Solution {
2    public static int bs(int nums[],int target, int si,int ei){
3         if(si>ei){
4            return -1;
5         }
6         int mid=si+(ei-si)/2;
7         if(nums[mid]==target){
8            return mid;
9         }
10         if(nums[mid]>=nums[si] ){
11            //unsorted array
12            if(target<=nums[mid] && target>=nums[si]){
13                return bs(nums,target,si,mid-1);
14            }
15            else{
16                return bs(nums,target,mid+1,ei);
17            }
18         }
19         else{
20            //sorted array
21            if(nums[mid]<=target && nums[ei]>=target){
22                return bs(nums,target,mid+1,ei);
23            }
24            else{
25                return bs(nums,target,si,mid-1);
26            }
27         }
28    }
29    public int search(int[] nums, int target) {
30        int si=0;
31        int ei=nums.length-1;
32        return bs(nums,target,si,ei);
33    }
34}