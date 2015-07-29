/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)
            return head;
            
        ListNode p1 = head;
        ListNode p2 = head;
        int i = 0;
        while(p2.next != null){
            if(i<n){
                p2 = p2.next;
                i++;
            }else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        if(i < n){
            head = p1.next;
        }else
            p1.next = p1.next.next;
        
        return head;
    }
}