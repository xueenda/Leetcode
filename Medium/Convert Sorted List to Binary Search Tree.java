/*
Convert Sorted List to Binary Search Tree

Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode current;
    
    public TreeNode sortedListToBST(ListNode head) {
        int size=0;
        current = head;
        while(head!=null){
            size++;
            head =  head.next;
        }
        
        return buildTree(size);
    }
    
    private TreeNode buildTree(int size){
        if(size<=0)
            return null;
        TreeNode left = buildTree(size/2);
        TreeNode root = new TreeNode(current.val);
        current = current.next;
        TreeNode right = buildTree(size - 1 - size / 2);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}