1
2class Solution {
3    public static boolean distribution(int quantities[],int n,int mid){
4        int storecount=0;
5        for(int i=0;i<quantities.length;i++){
6            storecount+=quantities[i]/mid;
7            if(quantities[i]%mid!=0){
8                storecount++;
9            }
10
11        }
12        if(storecount>n){
13            return false;
14        }
15        return true;
16    } 
17    public int minimizedMaximum(int n, int[] quantities) {
18        int si=1;
19        int res=-1;
20        int ei=Integer.MIN_VALUE;
21
22        //max value 
23        for(int i=0;i<quantities.length;i++){
24            if(quantities[i]>ei){
25                ei=quantities[i];
26            }
27        }
28        // System.out.print(ei);
29        //binary search
30        while(si<=ei){
31            int mid=si+(ei-si)/2;
32            if(distribution(quantities,n,mid)){
33                res=mid;
34                ei=mid-1;
35            }
36            else{
37                si=mid+1;
38            }
39        }
40        return res;
41    }
42}