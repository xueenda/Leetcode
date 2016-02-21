/*
Word Ladder

Given two words (beginWord and endWord), and a dictionary, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
Hide Tags Breadth-first Search
Show Similar Problems
*/


public class Solution {
  public int ladderLength(String start, String end, Set<String> dict) {
    if (dict == null || dict.size() == 0) {
      return 0;
    }

    Queue<String> queue = new LinkedList<String>();
    queue.add(start);
    dict.remove(start);
    int length = 1;

    while(!queue.isEmpty()) {
      int count = queue.size();
      for (int i = 0; i<count; i++){
        String current = queue.poll();
        char[] arr = current.toCharArray();
        for (int j=0; j < arr.length; j++) {
          char temp = arr[j];
          for (char c = 'a'; c <= 'z'; c++) {
            if (c == arr[j]) {
              continue;
            }
            arr[j] = c;
            String tmp = new String(arr);
            if (tmp.equals(end)) {
              return length + 1;
            }
            if (dict.contains(tmp)){
              queue.add(tmp);
              dict.remove(tmp);
            }
          }
          arr[j] = temp;
        }
      }
      length++;
    }
    return 0;
  }
}