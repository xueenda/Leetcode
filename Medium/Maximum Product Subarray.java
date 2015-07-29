/*
Maximum Product Subarray Total Accepted: 34868 Total Submissions: 178599 My Submissions Question Solution 
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.

分析：
同时保存 最大值 和最小值 因为有负值存在
*/

public class Solution {
    public int maxProduct(int[] A) {
        if(A==null || A.length==0)  
            return 0;  
     
        int maxLocal = A[0];  
        int minLocal = A[0];  
        int global = A[0];  
     
        for(int i=1; i<A.length; i++){  
            int temp = maxLocal;  
            maxLocal = Math.max(Math.max(A[i]*maxLocal, A[i]), A[i]*minLocal);  
            minLocal = Math.min(Math.min(A[i]*temp, A[i]), A[i]*minLocal);  
            global = Math.max(global, maxLocal);  
        }  
        return global;
    }
}