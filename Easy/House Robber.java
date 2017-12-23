/*
House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of 
money you can rob tonight without alerting the police.
*/


public class Solution {
    public int rob(int[] nums) {
        int a=0,b=0;
        for(int i=0; i < nums.length;i++){
            int m=a;
            a = b + nums[i];
            b = Math.max(m, b);
        }
        return Math.max(a,b);
    }
}


public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length==0)
            return 0;
        int[] result = new int[nums.length];
        for(int i=0; i < nums.length;i++){
            if(i==0)
                result[i] = nums[i];
            else if(i == 1)
                result[i] = Math.max(nums[i-1], nums[i]);
            else
                result[i] = Math.max(result[i-1], result[i-2]+nums[i]);
        }
        return result[nums.length-1];
    }
}


public int rob(int[] num) {
  if(num==null || num.length == 0)
    return 0;
 
  int even = 0;
  int odd = 0;
 
  for (int i = 0; i < num.length; i++) {
    if (i % 2 == 0) {
      even += num[i];
      even = Math.max(even, odd);
    } else {
      odd += num[i];
      odd = Math.max(even, odd);
    }
  }
 
  return Math.max(even,odd);
}
