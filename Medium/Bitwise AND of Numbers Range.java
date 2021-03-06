/*
Bitwise AND of Numbers Range 

Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.

分析 5 6 7 分别为 101 110 111 取左边最长相同部分 为 100
*/


public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while(m!=n){
            m >>= 1;
            n >>= 1;
            i++;
        }
        return (m<<i);
    }
}