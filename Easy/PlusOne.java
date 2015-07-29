public class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        
        int plus = 1;
        
        for(int i = digits.length-1; i>=0; i--){
            if(plus == 1){
                digits[i] = digits[i] + plus;
                if(digits[i] < 10)
                    plus = 0;
                else
                    digits[i] = 0;
            }
        }
        
        if(plus == 1){
            int[] numbers = new int[size+1];
            numbers[0] = 1;
            for(int i=0;i<size; i++){
                numbers[i+1] = digits[i];
            }
            return numbers;
        }
        return digits;
    }
}