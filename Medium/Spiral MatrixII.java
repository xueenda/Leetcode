/*
Spiral Matrix II
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
*/

public class Solution {
    public int[][] generateMatrix(int n) {
        if(n<0)
            return null;
        
        int[][] matrix = new int[n][n];
        int count=0;
        int num = 1;
        
        while(count*2 < n){
            for(int i = count;i<n-count;i++)
                matrix[count][i] = num++;
            for(int i = count+1; i<n-count;i++)
                matrix[i][n-count-1] = num++;
            
            if(n - 2 * count == 1)  // if only one row /col remains
                break;
                
            for(int i = n-count-2; i>=count;i--)
                matrix[n-count-1][i] = num++;
            for(int i = n-count-2; i>=count+1;i--)
                matrix[i][count] = num++; 
            count++;
        }
        
        return matrix;
    }
}