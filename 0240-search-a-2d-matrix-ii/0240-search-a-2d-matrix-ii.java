class Solution {
    public boolean check(int i, int j, int matrix[][], int target){
        if(target==matrix[i][j]){
            return true;
        }
        if(j==0 && target <matrix[i][j] ){
            return false;
        }
        if(i==matrix.length-1 && target>matrix[i][j]){
            return false;
        }
        if(matrix[i][j]>target){
            return check(i,j-1,matrix,target);
        }
        else{
            return check(i+1,j,matrix,target);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       return  check(0,n-1,matrix,target);
    }
}