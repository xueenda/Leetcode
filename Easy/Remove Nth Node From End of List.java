/*
Remove Nth Node From End of List

Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *   int val;
 *   ListNode next;
 *   ListNode(int x) { val = x; }
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

// javascript
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
  if(n == 0)
    return head;
    
  var p1 = head;
  var p2 = head;
  
  while(n--){
    p2 = p2.next;
  }
  
  if(!p2)
    return p1.next;
    
  while(p2.next){
    p1 = p1.next;
    p2 = p2.next;
  }
  
  p1.next = p1.next.next;
  
  return head;
};