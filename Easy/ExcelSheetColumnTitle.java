public class Solution {
    public String convertToTitle(int n) {
        int size = 0;
        StringBuilder s = new StringBuilder();
        while(n>0){
            n--;
            char ch = (char) (n % 26 + 'A');
            n /=26;
            s.append(ch);
        }
        return s.reverse().toString();
    }
}