class Solution {
     public static  boolean bs(int si,int ei,int arr[][],int t){
            if(si>ei){
                return false;
            }
       int mid = si + (ei - si) / 2;
            int row=mid/arr[0].length;
            int col=mid%arr[0].length;
            if(arr[row][col]==t){
                return true;
            }
            else if(arr[row][col]>t){
                return bs(si,mid-1,arr,t);
            }
            else{
                return bs(mid+1,ei,arr,t);
            }
    }
    public static boolean check(int i, int j, int arr[][], int t) {
        if (bs(0,(arr.length*arr[0].length)-1,arr,t)) {
            return true;
        }
        return false;
     
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return check(0,0,matrix,target);
    }
}