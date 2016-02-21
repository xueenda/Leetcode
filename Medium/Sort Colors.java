/*
Sort Colors

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

*/


public class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <=1)
            return;
        int color = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==color)
                continue;
            else{
                int j=i+1;
                for(;j<nums.length;j++){
                    if(nums[j] == color){
                        int temp  = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                if(j == nums.length){
                    color++;
                    i--;
                }
            }
        }   
    }
}

public class Solution {
    public void sortColors(int[] a) {
        if(a == null || a.length <= 1)
            return;
        
        int pl = 0;
        int pr = a.length - 1;
        int i = 0;
        while(i <= pr){
            if(a[i] == 0){
                swap(a, pl, i);
                pl++;
                i++;
            }else if(a[i] == 1){
                i++;
            }else{
                swap(a, pr, i);
                pr--;
            }
        }
    }
    
    private void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}