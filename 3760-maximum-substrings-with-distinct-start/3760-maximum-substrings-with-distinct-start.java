class Solution {
    public int maxDistinct(String s) {
          int c=0;
    int arr[]=new int [26];
    for(int i=0;i<s.length();i++){
        char t=s.charAt(i);
        if(arr[t-'a']==0){
            c++;
            arr[t-'a']++;
        }
    }
    return c;
    }
}