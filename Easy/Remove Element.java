/*
Remove Element

Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

*/


public class Solution {
  public int removeElement(int[] nums, int val) {
    int size = nums.length;
    for(int i=0;i<size;i++){
      if(nums[i] == val){
        nums[i] = nums[size-1];
        size--;
        i--;
      }
    }
    return size;
  }
}