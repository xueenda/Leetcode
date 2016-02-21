/*
Combination Sum II

Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
A solution set is: 
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 

*/


public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
        
        if (index>=candidates.length || candidates[index] > target) 
                return;

        int prev = -1;
        for (int i = index; i < candidates.length; i++) {
            if(candidates[i] != prev){
                path.add(candidates[i]);
                helper(candidates, target - candidates[i], path, i+1, result);
                path.remove(path.size() - 1);
                prev = candidates[i];
            }
        }
    }
}