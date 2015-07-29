/*
Reverse Integer
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/

/*
x mod 10 去余数 再乘 10
*/
public class Solution {
    public int reverse(int x) {
        long result = 0;
        while(x!=0){
            result = result*10 + x%10;
            x/=10;
        }
        if(result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE)
            return 0;
            
        return (int)result;
    }
}