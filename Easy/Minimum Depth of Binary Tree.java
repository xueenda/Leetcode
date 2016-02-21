/*
Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

分析：
从最底层算起 叶子是1

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
    public int minDepth(TreeNode root) {
        return dfs(root,0,0);
    }
    
    private int dfs(TreeNode root, int depth, int pre){
        if(root == null)
            return 0;
            
        depth++;
        
        if(root.left == null && root.right == null){
            if(pre == 0)
                pre = depth;
            return (pre > 0 && pre < depth) ? pre : depth;
        }
        
        int left = dfs(root.left, depth, pre);
        int right = dfs(root.right, depth, pre);
        
        if(left == 0 || right == 0)
            return left+right;
        else
            return Math.min(left,right);
    }
}

// Solution 2
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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        return dfs(root);
    }
    
    private int dfs(TreeNode root){
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return Math.min(dfs(root.left), dfs(root.right)) + 1;
    }
}