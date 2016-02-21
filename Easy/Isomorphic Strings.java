/*
Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

分析：
创建两个 HashMap
*/


public class Solution {
    public boolean isIsomorphic(String s, String t) {
        return test(s,t) && test(t,s);
    }
    
    public boolean test(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<sArray.length;i++){
            if(map.containsKey(sArray[i]))
                if(tArray[i] != map.get(sArray[i]))
                    return false;
            map.put(sArray[i],tArray[i]);
        }
        return true;   
    }
}