class Solution {
    public static int bs(int nums[],int target, int si,int ei){
         if(si>ei){
            return -1;
         }
         int mid=si+(ei-si)/2;
         if(nums[mid]==target){
            return mid;
         }
         if(nums[mid]>=nums[si] ){
            //unsorted array
            if(target<=nums[mid] && target>=nums[si]){
                return bs(nums,target,si,mid-1);
            }
            else{
                return bs(nums,target,mid+1,ei);
            }
         }
         else{
            //sorted array
            if(nums[mid]<=target && nums[ei]>=target){
                return bs(nums,target,mid+1,ei);
            }
            else{
                return bs(nums,target,si,mid-1);
            }
         }
    }
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        return bs(nums,target,si,ei);
    }
}