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