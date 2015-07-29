/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode pre = null;
        while(current != null){
            if(current.val == val){
                if(pre != null)
                    pre.next = current.next;
                else
                    head = current.next;
                ListNode temp = current;
                temp = null;
            }else{
                pre = current;
            }
            current = current.next;
        }
        return head;
    }
}

/**
 * Another solution 
 */

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;
        while(p.next != null){
            if(p.next.val == val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return helper.next;
    }
}