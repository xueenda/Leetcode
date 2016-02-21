/*
Anagrams

Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.

例如：
S = ["abc", "bca", "bac", "bbb", "bbca", "abcb"]
答案为：
["abc", "bca", "bac", "bbca", "abcb"]
只有"bbb"没有相同字母组成的单词。
*/


public class Solution {
  public List<String> anagrams(String[] strs) {
    List<String> list = new ArrayList<String>();
    if(strs==null || strs.length==1)
      return list;
      
    HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
    
    for(int i=0; i<strs.length;i++){
      char[] arr = strs[i].toCharArray();
      Arrays.sort(arr);
      String s = String.valueOf(arr);
      if(map.get(s) == null){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(i);
        map.put(s,l);
      }else{
        map.get(s).add(i);
      }
    }
    
    for(ArrayList<Integer> l: map.values()){
    if(l.size() > 1){
      for(Integer i: l){
        list.add(strs[i]);
      }
    }
  }
 
  return list;
  }
}