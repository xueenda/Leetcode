/*
Sqrt(x)

Implement int sqrt(int x).

Compute and return the square root of x.

Show Tags
Show Similar Problems

*/


public class Solution {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = x;

        while (hi >= lo) {     
            long mid = lo+(hi-lo)/2;
            if (x < mid * mid) {
                hi = mid-1;      // not hi = mid
            } else {
                lo = mid+1;  
            }
        }
        return (int) hi;
    }
}