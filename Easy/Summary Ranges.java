/*
Summary Ranges

Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/


public class Solution {
  public List<String> summaryRanges(int[] nums) {
    List myList = new ArrayList();
    int temp = 0;
    int length = 0;
    String range = "";
    for(int x : nums ){
      // Set for index 0 
      if(length == 0){
        range = Integer.toString(x);
        length++;
        temp = x;
      }else{
        if(x == temp+1){
          length++;
          temp = x;
        }else{
          if(length > 1)
            range +=  "->" + Integer.toString(temp);
          myList.add(range);
          length = 1;
          range = Integer.toString(x);
          temp = x;
        }
      }
    }
    if(length > 1){
      range +=  "->" + Integer.toString(temp);
    }
      
    if(!range.isEmpty()){
      myList.add(range);
    }
      
    return myList;
  }
}