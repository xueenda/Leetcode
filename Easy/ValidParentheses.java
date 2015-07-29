public class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0 || s.length() < 2)
            return false;
            
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++){
            if( "({[".indexOf(s.charAt(i)) >= 0)
                stack.push(s.charAt(i));
            else{
                if(!stack.isEmpty() && isValidPair(stack.peek(), s.charAt(i))){
                    stack.pop();
                }
                else
                    return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    private boolean isValidPair(char a, char b){
        if((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')){
            return true;
        }else
            return false;
    }
}