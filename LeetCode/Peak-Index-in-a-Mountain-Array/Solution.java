1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int i=0;
4        int j=arr.length-1;
5        while(i<j){
6            if(arr[i]==arr[j]){
7                i++;
8                j--;
9            }
10            else if(arr[i]>arr[j]){
11                j--;
12            }
13            else{
14                i++;
15            }
16        }
17        return i;
18    }
19}