/*
Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

分析：
n! 这个数字 尾数为零的个数
5！ = 120 return 1

即 n/5 + n/25 + n/125 .... 的数值
*/


public class Solution {
  public int trailingZeroes(int n) {
    int count = 0;
    while (n > 0) {
      n /= 5;
      count += n;
    }
    return count;
  }
}