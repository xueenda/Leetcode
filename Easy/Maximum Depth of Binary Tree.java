/*
Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

分析：
从叶子算起，逐层网上加+1
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
    public int maxDepth(TreeNode root) {
        return dfs(root);
        
    }
    
    private int dfs(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left,right)+1;
    }
}