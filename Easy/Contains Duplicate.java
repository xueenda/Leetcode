/*
Contains Duplicate

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

分析：
用 HashSet
*/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int x: nums){
            if(map.containsKey(x))
                return true;
            map.put(x,1);
        }
        return false;
    }
}