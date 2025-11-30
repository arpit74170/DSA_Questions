class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int c=0;
        int j=nums.length-1;
        while(c<=j){
            if(nums[c]==2){
                //swaf
                int t=nums[c];
                nums[c]=nums[j];
                nums[j]=t;
                j--;
            }
            else if(nums[c]==1){
                c++;

            }
            else if(nums[c]==0){
                //swaf with i
                 int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
                i++;c++;
            }
        }
        
    }
}