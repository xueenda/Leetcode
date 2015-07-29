/*
Subsets II Total Accepted: 42477 Total Submissions: 153212 My Submissions Question Solution 
Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]*/
/*
注意： 保证没有重复的list
if(!result.contains(list)){
    result.add(new ArrayList(list));
}
*/

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List result = new ArrayList();
        if(nums == null || nums.length==0)
            return result;
        
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result, list, nums, 0);
        return result;
    }
    
    private void helper(List result, ArrayList<Integer> list, int[] nums, int start){
        if(!result.contains(list)){
            result.add(new ArrayList(list));
        }
        
        for(int i= start;i<nums.length;i++){
            list.add(nums[i]);
            helper(result, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}