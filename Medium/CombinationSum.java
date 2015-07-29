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