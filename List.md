## Find middle

public ListNode findMiddle(ListNode head){
  ListNode slow = head, fast = head.next;
  while(fast!=null && fast.next!=null){
    slow = slow.next;
    fast = fast.next.next;
  }
  return slow;
}