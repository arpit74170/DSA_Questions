
class Solution {
    public static boolean distribution(int quantities[],int n,int mid){
        int storecount=0;
        for(int i=0;i<quantities.length;i++){
            storecount+=quantities[i]/mid;
            if(quantities[i]%mid!=0){
                storecount++;
            }

        }
        if(storecount>n){
            return false;
        }
        return true;
    } 
    public int minimizedMaximum(int n, int[] quantities) {
        int si=1;
        int res=-1;
        int ei=Integer.MIN_VALUE;

        //max value 
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]>ei){
                ei=quantities[i];
            }
        }
        // System.out.print(ei);
        //binary search
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(distribution(quantities,n,mid)){
                res=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return res;
    }
}