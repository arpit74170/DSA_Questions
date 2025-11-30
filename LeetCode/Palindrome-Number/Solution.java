1class Solution {
2    public boolean isPalindrome(int x) {
3        //reverse
4      if(x==0){
5        return true;
6      }
7        int d1=0;
8        int rem=0;
9        boolean ans=false;
10        int num=x;
11        while(x!=0){
12             rem=x%10;
13             d1=d1*10+rem;
14            x=x/10;
15        }
16     
17        if(num==d1 && num>0){
18            ans=true;
19        }
20        return ans;
21    }
22
23}