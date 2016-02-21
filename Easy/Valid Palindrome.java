/*
Valid Palindrome

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/


public class Solution {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

    int start = 0;
    int end = s.length()-1;
    
    while(start < end){
      if(s.charAt(start) != s.charAt(end))
        return false;
      start++;
      end--;
    }
    
    return true;
  }
}