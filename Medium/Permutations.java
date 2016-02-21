/*
Permutations

Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].

*/


public class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List result = new ArrayList();
    if(nums == null)
      return result;
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    helper(nums,list,result);
    
    return result;
  }
  
  private void helper(int[]nums, ArrayList<Integer> list, List result){
    if( list.size() == nums.length){
      result.add(new ArrayList<Integer>(list));
      return;
    }
    
    for(int i = 0; i<nums.length;i++){
      if(list.contains(nums[i])){
        continue;
      }
      list.add(nums[i]);
      helper(nums,list,result);
      list.remove(list.size()-1);
    }
  }
}