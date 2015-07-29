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