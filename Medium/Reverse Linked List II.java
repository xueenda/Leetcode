/*
Reverse Linked List II
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤

/*
分析：
建立premNode 和 postnNode 来帮助 reverse
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if( m>=n || head==null)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        for(int i=1;i<m;i++){
            if(head == null)
                return null;
            head=head.next;
        }
        
        ListNode premNode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postnNode = mNode.next;
        
        for(int i=m;i<n;i++){
            if(postnNode == null)
                return null;
            ListNode next = postnNode.next;
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = next;
        }
        
        mNode.next = postnNode;
        premNode.next = nNode;
        
        return dummy.next;
    }
}