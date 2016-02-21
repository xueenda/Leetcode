/*
Word Break 

Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
*/


public class Solution {
  public boolean wordBreak(String s, Set<String> wordDict) {
    if (s == null || s.length() == 0)
      return true;
    
    int maxLength = maxLengthofWord(wordDict);
    boolean[] canSegment = new boolean[s.length() + 1];
    
    canSegment[0] = true;
    for (int i = 1; i <= s.length(); i++) {
      canSegment[i] = false;
      for (int j = 1; j <= maxLength && j <= i; j++) {
        if (!canSegment[i - j]) {
          continue;
        }
        String word = s.substring(i - j, i);
        if (wordDict.contains(word)) {
          canSegment[i] = true;
          break;
        }
      }
    }

    return canSegment[s.length()];
  }
  
  private int maxLengthofWord(Set<String> wordDict){
    int maxLength = 0;
    for(String word: wordDict){
      if(word.length() > maxLength)
        maxLength = word.length();
    }
    return maxLength;
  }
}