/*
Combination Sum

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 

*/


public class Solution {
  public  List<List<Integer>> combinationSum(int[] candidates, int target) {
    List result = new ArrayList();
    if (candidates == null) {
      return result;
    }

    ArrayList<Integer> path = new ArrayList<Integer>();
    Arrays.sort(candidates);
    helper(candidates, target, path, 0, result);

    return result;
  }

   void helper(int[] candidates, int target, ArrayList<Integer> path, int index,
    List result) {
    if (target == 0) {
      result.add(new ArrayList<Integer>(path));
      return;
    }
    
    if (candidates[index] > target) 
        return;

    for (int i = index; i < candidates.length; i++) {
      path.add(candidates[i]);
      helper(candidates, target - candidates[i], path, i, result);
      path.remove(path.size() - 1);
    }
  }
}