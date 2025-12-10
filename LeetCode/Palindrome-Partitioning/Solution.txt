1class Solution {
2    public static  boolean palindrome(String s, int si, int ei){
3            while(si<=ei){
4                if(s.charAt(si)!=s.charAt(ei)){
5                    return false;
6                }
7                si++;
8                ei--;
9            }
10            return true;
11
12    }
13    public static void solver(List<List<String>> list, String s,int start, List<String> path){
14        if(start==s.length()){
15            list.add(new ArrayList<>(path) );
16            return;
17        }
18        for(int end=start+1;end<=s.length();end++){
19            if(palindrome(s,start,end-1)){
20                path.add(s.substring(start,end));
21                solver(list,s,end,path);
22                path.remove(path.size()-1);
23            }
24        }
25    }
26    public List<List<String>> partition(String s) {
27        List<List<String>> list= new ArrayList<>();
28        List<String> path=new ArrayList<>();
29        solver(list,s,0,path);
30        return list;
31
32        }
33}