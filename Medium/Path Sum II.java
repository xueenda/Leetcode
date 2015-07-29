/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List result = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        findPath(result, list, root, sum);
        
        return result;
    }
    
    private void findPath(List result, ArrayList<Integer> list, TreeNode root, int sum){
        if(root==null)
            return;
            
        sum -= root.val;
            
        list.add(root.val);
        
        if(root.left==null && root.right==null&&sum == 0){
            result.add(new ArrayList(list));
        }
        
        findPath(result, list, root.left, sum);
        findPath(result, list, root.right, sum);
        list.remove(list.size()-1);
    }
}