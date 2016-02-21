/*
Construct Binary Tree from Inorder and Postorder Traversal

Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (inorder.length != postorder.length) {
      return null;
    }
    return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
  }
  
  private TreeNode buildTree(int[] inorder, int istart, int iend,
      int[] postorder, int pstart, int pend) {
    if (istart > iend) {
      return null;
    }

    TreeNode root = new TreeNode(postorder[pend]);
    int i = istart;
    for(;i<=iend;i++){
      if(inorder[i] == postorder[pend])
        break;
    }

    root.left = buildTree(inorder, istart, i - 1,
        postorder, pstart, pstart + i - istart - 1);
    root.right = buildTree(inorder, i + 1, iend,
        postorder, pstart + i - istart, pend - 1);
    return root;
  }
}