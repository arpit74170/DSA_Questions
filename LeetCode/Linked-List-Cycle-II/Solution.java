1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14         if (head == null || head.next == null) return null;
15        String res="no cycle";
16        ListNode slow=head;
17        ListNode fast=head;
18        while(fast!=null && fast.next!=null){
19             slow=slow.next;
20            fast=fast.next.next;
21            if(slow==fast){
22                //cycel detect
23                break;
24            }                
25        }
26        if(slow!=fast){
27            // no cycle
28            return null;
29        }
30        slow=head;
31        while(slow!=fast){
32            slow=slow.next;
33            fast=fast.next;
34        }
35        return fast;
36    }
37}