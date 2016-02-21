/*
Triangle

Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/


public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null)
            return 0;
        int size = triangle.size();
        int[][] result = new int[size][size];
        result[0][0] = triangle.get(0).get(0);
        for(int i=1; i<size;i++){
            for(int j=0;j <= i;j++){
                int current = triangle.get(i).get(j);
                if(j==0)
                    result[i][j] = current+result[i-1][j];
                else if(j == i)
                    result[i][j] = current+result[i-1][j-1];
                else
                    result[i][j] = Math.min(current+result[i-1][j], current+result[i-1][j-1]);
            }
        }
        
        int min = result[size-1][0];
        for(int i=1;i<size;i++){
            if(result[size-1][i] < min)
                min = result[size-1][i];
        }
        return min;
    }
}

//Version 1: Bottom-Up
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        int n = triangle.size();
        int[][] sum = new int[n][n];

        for (int i = 0; i < n; i++) {
            sum[n - 1][i] = triangle.get(n - 1).get(i);
        }

        for (int i = n - 2; i >= 0; i--) { 
            for (int j = 0; j <= i; j++) {
                sum[i][j] = Math.min(sum[i + 1][j], sum[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }

        return sum[0][0];
    }
}