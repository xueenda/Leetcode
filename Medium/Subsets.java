/*
Subsets

Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/


public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List result = new ArrayList();
    if(nums == null || nums.length == 0) {
      return result;
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    Arrays.sort(nums);
    helper(result, list, nums,0);
    return result;
  }
  
  private void helper(List result, ArrayList<Integer> list, int[] nums, int start){
    
    result.add(new ArrayList(list));
    
    for(int i=start; i<nums.length;i++){
      list.add(nums[i]);
      helper(result, list, nums, i+1);
      list.remove(list.size()-1);
    }
  }
}