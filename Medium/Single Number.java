/*
Single Number

Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

分析：
按位异或  相同的两个数按位异或 结果为0
*/


public class Solution {
  public int singleNumber(int[] nums) {
    if(nums == null || nums.length%2 == 0)
      return -1;

    for(int i=1;i<nums.length;i++)
      nums[i] ^= nums[i-1];
    
    return nums[nums.length-1];
  }
}