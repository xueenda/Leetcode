/*
Pow(x, n)

Implement pow(x, n).
*/


public class Solution {
  public double myPow(double x, int n) {
    if(n==0)
      return 1;
    boolean isPositive = (n >=0)?true:false;
    n = Math.abs(n);
    double r = x;
    int i =1;
    for(;i<n/2;i*=2){
      r *= r;
    }
    n = n-i;
    return (isPositive)?r*myPow(x,n): 1/(r*myPow(x,n));
  }
}