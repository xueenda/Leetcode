/**
Count and Say My Submissions Question

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Subscribe to see which companies asked this question
*/


public class Solution {
  public String countAndSay(int n) {
    if(n<=0)
      return "";
    String cur = "1";
    int start = 1;
    while(start<n){
      StringBuilder res = new StringBuilder();
      int count = 1;
      for(int i=0; i<cur.length(); i++){
        if(i+1 < cur.length() && cur.charAt(i) == cur.charAt(i+1))
          count++;
        else{
          res.append(count);
          res.append(cur.charAt(i));
          count = 1;
        }
      }
      cur = res.toString();
      start++;
    }
    
    return cur;
  }
}