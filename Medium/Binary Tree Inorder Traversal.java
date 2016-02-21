/*
Binary Tree Inorder Traversal

Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
  \
   2
  /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
*/

/*
Stack 的应用
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
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if(root == null)
      return result;
    helper(root,result);
    return result;
  }
  
  public void helper(TreeNode p, List<Integer> result){
    if(p.left!=null)
      helper(p.left,result);
 
    result.add(p.val);
 
    if(p.right!=null)
      helper(p.right,result);
  }
}



public class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    TreeNode curt = root;
    while(curt !=null || !stack.empty()){
      while(curt !=null){
        stack.push(curt);
        curt = curt.left;
      }
      curt = stack.peek();
      stack.pop();
      result.add(curt.val);
      curt = curt.right;
    }   
    
    return result;
  }
}