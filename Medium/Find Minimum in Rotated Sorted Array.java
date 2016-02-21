/*
Find Minimum in Rotated Sorted Array

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/


public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            int mid = start+(end-start)/2;
            
            if(nums[mid] > nums[end])
                start = mid+1;
            else if(nums[mid] < nums[start])
                end = mid;
            else
                end = mid-1;
        }
        
        return nums[start];
    }
}