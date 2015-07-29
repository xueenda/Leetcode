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