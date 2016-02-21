/*
Happy Number My Submissions Question

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/


public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        do{
            n = calculate(n);
            if(set.contains(n))
                return false;
            set.add(n);
        }while(n != 1);
        return true;
    }
    
    public int calculate(int n){
        int sum = 0;
        int i=0,power,digit;
        do{
            power = (int)Math.pow(10,i);
            digit = (int)(n/power)%10;
            sum += digit*digit;
            i++;
        }while(n > power);
        return sum;
    }
}

/**
* Another solution
*/

public class Solution {
    public boolean isHappy(int n) {
        HashSet<String> set = new HashSet<String>();
        do{
            String number = Integer.toString(n);
            int length = number.length();
            int[] digits = new int[length];
            
            int sum = 0,power,digit;
            for(int i =0; i<length;i++){
                power = (int)Math.pow(10,i);
                digit = (int)(n/power)%10;
                digits[i] = digit;
                sum += digit*digit;
            }
            
            Arrays.sort(digits);
            String key = "";
            for(int i=0; i<length;i++){
                key += digits[i];
            }
            if(set.contains(key))
                return false;
            set.add(key);
            
            n = sum;
        }while(n != 1);
        return true;
    }
}