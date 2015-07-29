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