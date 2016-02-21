/*
Binary Tree Right Side View

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1      <---
 /   \
2   3     <---
 \   \
  5   4     <---
You should return [1, 3, 4].

分析：
借助 HashMap 每次都会重置key value pair 并保存最后存入的值
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
  public List<Integer> rightSideView(TreeNode root) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    helper(map,root,0);
    
    int level = 0;
    List<Integer> result = new ArrayList<Integer>();
    while (map.containsKey(level)) {
      result.add(map.get(level));
      level++;
    }
    return result;
  }
  
  private void helper(HashMap<Integer, Integer> map, TreeNode root,int level){
    if(root==null)
      return;
    map.put(level, root.val);
    helper(map, root.left, level+1);
    helper(map, root.right, level+1);
  }
  
  
}