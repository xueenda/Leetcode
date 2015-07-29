/*
Remove Duplicates from Sorted Array II Total Accepted: 46341 Total Submissions: 152152 My Submissions Question Solution 
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/

/*
    Set two pointers, the length between j and i is less than 2
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int count = 0;
        int j = 0;
        for(int i = 0;i<nums.length && j<nums.length;i++){
            if(nums[i]!=nums[j]){
                j=i;
            }
            if(i-j < 2)
                nums[count++] = nums[j];
        }
        return count;
    }
}