/*
Binary Tree Zigzag Level Order Traversal

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree {3,9,20,#,#,15,7},
  3
   / \
  9  20
  /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
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
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List result = new ArrayList();
    helper(result, root, 1);
    return result;
  }
  
  private void helper(List result, TreeNode root, int level){
    if(root == null)
      return;
      
    if(level > result.size()){
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(root.val);
      result.add(list);
    }else{
      ArrayList<Integer> list = (ArrayList<Integer>) result.get(level-1);
      if(level%2 == 1){
        list.add(root.val);
      }else{
        list.add(0,root.val);
      }
      result.set(level-1, list);
    }
    
    helper(result, root.left, level+1);
    helper(result, root.right, level+1);
  }
}