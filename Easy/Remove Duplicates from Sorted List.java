/*
Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/

/*
  head 不会变 不用声明dummpy node
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p!=null){
              if(p.next!=null && p.val == p.next.val){
                  p.next = p.next.next;
              }else{
                  p = p.next;
              }
        }
        return head;
    }
}