/*
Maximum Subarray

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
*/


public class Solution {
    public int maxSubArray(int[] nums) {
        int newsum = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            newsum = Math.max(newsum+nums[i],nums[i]);
            max = Math.max(max, newsum);
        }
        return max;
    }
}