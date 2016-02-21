/*
Add Two Numbers 

You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
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
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode ln = l1;
    ListNode tail = null;
    int add = 0;
    while(l1!=null){
      if( l2!=null){
        l1.val += l2.val + add;
        l2 = l2.next;
      }else{
        l1.val += add;
      }
      add = l1.val/10;
      l1.val %= 10;
      if(l1.next == null)
        tail = l1;
      l1 = l1.next;
    }
    
    if(l2!=null)
      tail.next = l2;
      
    while(l2!=null){
      l2.val += add;
      add = l2.val/10;
      l2.val %= 10;
      if(l2.next == null)
        tail = l2;
      l2 = l2.next;
    }
    
    if(add==1){
      ListNode n = new ListNode(1);
      tail.next = n;
    }
      
    return ln;
  }
}


// javascript
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
  var l = l1;
  var t;
  var add = 0;
  
  while(l1 || l2){
    l1.val = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + add;
    add = parseInt(l1.val / 10);
    l1.val %= 10;
    if(!l1.next){
      l1.next = l2 ? l2.next : null;
      l2 = null;
      t = l1;
    }
    l1 = l1.next;
    l2 = l2 ? l2.next : null;
  }

  if(add == 1){
    var n = new ListNode(1);
    t.next = n;
  }
  
  return l;
};