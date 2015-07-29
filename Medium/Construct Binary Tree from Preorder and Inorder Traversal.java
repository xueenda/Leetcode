/*
Construct Binary Tree from Preorder and Inorder Traversal
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length != inorder.length)
            return null;
        
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    
    private TreeNode build(int[] preorder, int pstart,int pend, int[] inorder, int istart, int iend){
        if(pstart>pend)
            return null;
        TreeNode root = new TreeNode(preorder[pstart]);
        int i=istart;
        for(;i<=iend;i++){
            if(inorder[i] == preorder[pstart])
                break;
        }
        
        root.left = build(preorder, pstart+1, pstart+i-istart, inorder, istart, i-1);
        root.right = build(preorder, i - iend + pend + 1, pend, inorder, i+1, iend);     
        
        return root;
    }
}