/*
Next Permutation

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

*/


public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1)
            return;
        if(nums.length==2){
            swap(nums,0,1);
            return;
        }
            
        for(int i = nums.length-2; i>=0;i--){
            if(nums[i+1]>nums[i]){
                int j;
                for(j=nums.length-1;j>=i;j--){
                    if(nums[j]>nums[i])
                        break;
                }
                swap(nums,i,j);
                reverse(nums, i+1,nums.length-1);
                return;
            }
        }
        reverse(nums,0,nums.length-1);
    }
    
    private void swap(int[] nums,int i,int j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
    
    private void reverse(int[] nums,int i,int j){
        for(;i<j;i++,j--){
            swap(nums,i,j);
        }
    }
}