/*
Rotate List
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        
        int length = getLength(head);
        n = n % length;
        
        ListNode node = new ListNode(0);
        node.next = head;
        head = node;
        
        ListNode tail = node;
        for(int i=0;i<n;i++){
            head = head.next;
        }
        
        while(head.next!=null){
            tail = tail.next;
            head = head.next;
        }
        
        head.next = node.next;
        node.next = tail.next;
        tail.next = null;
        return node.next;
    }
    
    private int getLength(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}