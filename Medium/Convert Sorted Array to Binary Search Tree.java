/*
Convert Sorted Array to Binary Search Tree

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

分析：
取中值作为根
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null)
            return null;
        return buildTree(nums, 0, nums.length-1);
    }
    
    private TreeNode buildTree(int[] nums, int start, int end){
        if(start>end)
            return null;
        
        TreeNode root = new TreeNode(nums[(start+end)/2]);
        root.left = buildTree(nums, start, (start+end)/2 -1);
        root.right = buildTree(nums, (start+end)/2 + 1, end);
        
        return root;
    }
}