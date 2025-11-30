class Solution {
    public boolean isPalindrome(int x) {
        //reverse
      if(x==0){
        return true;
      }
        int d1=0;
        int rem=0;
        boolean ans=false;
        int num=x;
        while(x!=0){
             rem=x%10;
             d1=d1*10+rem;
            x=x/10;
        }
     
        if(num==d1 && num>0){
            ans=true;
        }
        return ans;
    }

}