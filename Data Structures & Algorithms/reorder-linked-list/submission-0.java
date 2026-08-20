/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode mid=slow.next;

        //ListNode curr=mid;
        ListNode prev=slow.next=null;
        

        while(mid!=null){
            ListNode next=mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }

        ListNode l1=head;
        mid=prev;
        //ListNode ans=l1;
        while(mid!=null ){
           ListNode tmp1=l1.next;
           ListNode tmp2=mid.next;
           l1.next=mid;
           mid.next=tmp1;
           l1=tmp1;
           mid=tmp2;

        }
    }
}
