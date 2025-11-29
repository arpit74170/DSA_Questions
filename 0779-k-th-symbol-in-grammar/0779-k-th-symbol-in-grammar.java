class Solution {
    public int kth(int n,int k){
        if(n==1 && k==1){
            return 0;

        }
        double num=Math.pow(2,n-1);
        int num2=(int) num;
         int mid=num2/2;
        if(k>mid){
            return 1-kth(n-1,k-mid);
        }
        else{
            return kth(n-1,k);
        }
    }
    public int kthGrammar(int n, int k) {
        return kth(n,k);
    }
}