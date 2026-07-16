class Solution {

    public long gcd (long a,long b){
        while(b==0){
            return Math.abs(a);
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        long maxarr[]=new long [nums.length];

        maxarr[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            maxarr[i]=Math.max(maxarr[i-1],nums[i]);
        }
        long arr[]=new long[nums.length];
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            arr[i]=gcd(nums[i],maxarr[i]);
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
        }
        long sum=0;
    Arrays.sort(arr);
        int i=0;

        int j=nums.length-1;
        while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;
            j--;
        }
        return sum;

    }
}