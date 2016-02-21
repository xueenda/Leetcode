/*
Excel Sheet Column

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

  1 -> A
  2 -> B
  3 -> C
  ...
  26 -> Z
  27 -> AA
  28 -> AB 
*/

 
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