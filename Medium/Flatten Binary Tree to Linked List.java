/*
Given a binary tree, flatten it to a linked list in-place.

For example,
Given

     1
    / \
     2   5
    / \   \
   3   4   6
The flattened tree should look like:
   1
  \
   2
    \
     3
    \
     4
      \
       5
      \
       6

分析：
借助 lastnode 保存上一个根节点
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
  private TreeNode lastNode = null;
  
  public void flatten(TreeNode root) {
    if(root == null)
      return;
    if(lastNode != null){
      lastNode.left=null;
      lastNode.right = root;
    }
    lastNode = root;
    TreeNode right = root.right;
    flatten(root.left);
    flatten(right);
  }
}