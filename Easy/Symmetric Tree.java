/*
Symmetric Tree

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
*/
/*
分析 判断是否为对称树 将树一分为二 进行递归比较
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        
        return isSymmetricTree(root.left, root.right);
    }
    
    public boolean isSymmetricTree(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        
        return (p.val == q.val) && isSymmetricTree(p.left,q.right) &&  isSymmetricTree(p.right,q.left);
    }
}