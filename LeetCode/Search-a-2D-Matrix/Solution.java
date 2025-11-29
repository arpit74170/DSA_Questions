1class Solution {
2     public static  boolean bs(int si,int ei,int arr[][],int t){
3            if(si>ei){
4                return false;
5            }
6       int mid = si + (ei - si) / 2;
7            int row=mid/arr[0].length;
8            int col=mid%arr[0].length;
9            if(arr[row][col]==t){
10                return true;
11            }
12            else if(arr[row][col]>t){
13                return bs(si,mid-1,arr,t);
14            }
15            else{
16                return bs(mid+1,ei,arr,t);
17            }
18    }
19    public static boolean check(int i, int j, int arr[][], int t) {
20        if (bs(0,(arr.length*arr[0].length)-1,arr,t)) {
21            return true;
22        }
23        return false;
24     
25    }
26    public boolean searchMatrix(int[][] matrix, int target) {
27        return check(0,0,matrix,target);
28    }
29}