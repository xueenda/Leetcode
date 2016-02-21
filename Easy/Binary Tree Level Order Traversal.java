/*
Binary Tree Level Order Traversal

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List list = new ArrayList();
        
        if(root == null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        int curLevelNodeNum = 1;
        
        while(curLevelNodeNum != 0){
            List<Integer> row = new ArrayList();
            int nextLevelNodeNum = 0;
            
            while(curLevelNodeNum != 0){
                TreeNode node = queue.poll();
                curLevelNodeNum--;
                row.add(node.val);
                
                if(node.left != null){
                    queue.offer(node.left);
                    nextLevelNodeNum++;
                }
                
                if(node.right != null){
                    queue.offer(node.right);
                    nextLevelNodeNum++;
                }
            }
            
            list.add(row);
            curLevelNodeNum = nextLevelNodeNum;
        }
        return list;
    }
}

// recursive way
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null)
            return result;
        
        helper(result, root, 1);
        return result;
    }
    
    private void helper(List<List<Integer>> result, TreeNode root, int level){
        if(root == null)
            return;
            
        if(result.size() >= level){
            result.get(level-1).add(root.val);
        }
        else{
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            result.add(list);
        }
        
        helper(result, root.left, level+1);
        helper(result, root.right, level+1);
    }
}