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