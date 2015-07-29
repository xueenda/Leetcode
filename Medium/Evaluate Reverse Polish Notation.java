/*
Evaluate Reverse Polish Notation
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

分析：
碰到 “+ - * /” 就从stack中pop 连个数值 进行运算，让后将结果再push 到stack 中
*/

public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length==0)
            return 0;
            
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<tokens.length;i++){
            if("+-*/".contains(tokens[i])){
                int b = stack.pop();
                int a = stack.pop();
                switch(tokens[i]){
                    case "+":
                        a +=b;
                        break;
                    case "-":
                        a -=b;
                        break;
                    case "*":
                        a *=b;
                        break;
                    case "/":
                        a /=b;
                        break;
                }
                stack.push(a);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return stack.pop();
    }
}