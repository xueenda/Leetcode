/*
Unique Paths Total Accepted: 51773 Total Submissions: 157298 My Submissions Question Solution 
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 3 x 7 grid. How many possible unique paths are there?

Note: m and n will be at most 100.
*/

public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0)
            return 0;

        int[][] matrix = new int[m][n];
        matrix[0][0] = 1;
        
        for(int i = 1;i<n;i++)
            matrix[0][i] = 1;
        for(int i=1;i<m;i++)
            matrix[i][0] = 1;
            
        for(int i = 1;i<m;i++)
            for(int j=1;j<n;j++)
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
        
        return matrix[m-1][n-1];
    }
}