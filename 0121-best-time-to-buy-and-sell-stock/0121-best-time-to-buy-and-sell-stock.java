// class Solution {
//     public int maxProfit(int[] prices) {
//         int cp=0;
//         int p=0;
//         int n=prices.length-1;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             if(prices[i]<min){
//                 min=prices[i];
//         }
        
//             cp=prices[i]-min;
//             if(p<cp){
//                 p=cp;
            
//             // p=Math.max(cp,p);
        
//         }
//         }
//         return p;
//     }
// }
class Solution {
    public int maxProfit(int[] prices)
{
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op; // return op 
}
}