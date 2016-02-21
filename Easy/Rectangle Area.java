/*
Rectangle Area

Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.

分析：
两个矩形 覆盖的总面积
S = S1 + S2 - S3
S3 为重叠的面积
*/


public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int s1 = (C-A) * (D-B);
        int s2 = (G-E) * (H-F);
        int s3 = 0;
        if( E >= C ||G <= A)
            s3 = 0;
        else if ( F >= D || H <=B)
            s3 = 0;
        else{
            int[] myList = new int[4];
            myList[0] = Math.max(A,E);
            myList[1] = Math.max(B,F);
            myList[2] = Math.min(C,G);
            myList[3] = Math.min(D,H);
            
            s3 = (myList[2]-myList[0]) * (myList[3]-myList[1]);
        }
    
        return s1 + s2 - s3;
    }
}