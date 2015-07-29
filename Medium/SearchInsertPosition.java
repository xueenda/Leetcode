public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int mid;
        while(start+1<end){
            mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid;
            }else{
                end = mid;
            }
        }
        
        if(nums[end]<target)
            return end+1;
        else if(nums[start]<target)
            return start+1;
        else 
            return 0;
    }
}