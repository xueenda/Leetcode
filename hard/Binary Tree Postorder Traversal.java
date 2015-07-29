/*
Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode previsited = null;
        while(root!=null || !stack.empty()){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }else{
                root = stack.peek();
                if(root.right!=null && previsited != root.right){
                    root = root.right;
                }else{
                    list.add(root.val);
                    previsited = stack.pop();;
                    root = null;
                }
            }
        }
        return list;
    }
}

// Second Solution

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode previsited = null;
        while(!stack.empty()){
            while(root.left!=null){
                stack.push(root.left);
                root = root.left;
            }
            
            root = stack.peek();
            if(root.right!=null && previsited!=root.right){
                root = root.right;
                stack.push(root);
            }else{
                list.add(root.val);
                previsited = stack.pop();
                root.left = null;
            }
        }
        return list;
    }
}