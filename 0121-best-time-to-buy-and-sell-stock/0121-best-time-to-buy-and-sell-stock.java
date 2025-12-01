class Solution {
    public int maxProfit(int[] prices) {
        int cp=0;
        int p=0;
        int n=prices.length-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
           cp=prices[i]-min;
            if(p<cp){
                p=cp;
            }
        }
        return p;
    }
}