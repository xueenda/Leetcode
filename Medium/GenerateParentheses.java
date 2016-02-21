/*
Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
*/


public class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    if(n <= 0)
      return list;
    
    getPair("",list,n,n);
    return list;
  }
  
  private void getPair(String s,List<String> list, int left, int right){
    if(left > right || left < 0 || right < 0) {
    return;   
  }
    if(left==0&&right==0){
      list.add(s);
      return;
    }
    getPair(s+"(",list,left-1,right);
    getPair(s+")",list,left,right-1);
  }
}