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