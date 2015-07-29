/*
Combinations Total Accepted: 47286 Total Submissions: 153041 My Submissions Question Solution 
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
*/

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List result = new ArrayList();
        if(n==0 || k ==0)
            return result;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result, list, n, k, 1);
        return result;
    }
    
    private void helper(List result, ArrayList<Integer> list, int n, int k, int start){
        if(list.size() == k){
            result.add(new ArrayList(list));
            return;
        }
        
        for(int i=start;i<=n;i++){
            list.add(i);
            helper(result, list, n, k, i+1);
            list.remove(list.size()-1);
        }
    }
}