1class Solution {
2    public boolean check(int i, int j, int matrix[][], int target){
3        if(target==matrix[i][j]){
4            return true;
5        }
6        if(j==0 && target <matrix[i][j] ){
7            return false;
8        }
9        if(i==matrix.length-1 && target>matrix[i][j]){
10            return false;
11        }
12        if(matrix[i][j]>target){
13            return check(i,j-1,matrix,target);
14        }
15        else{
16            return check(i+1,j,matrix,target);
17        }
18    }
19    public boolean searchMatrix(int[][] matrix, int target) {
20        int m=matrix.length;
21        int n=matrix[0].length;
22       return  check(0,n-1,matrix,target);
23    }
24}