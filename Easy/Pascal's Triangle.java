/*
Pascal's Triangle Total Accepted: 51458 Total Submissions: 170715 My Submissions Question Solution 
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/


public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List list = new ArrayList();

    if(numRows != 0){
      List<Integer> pre = null;
      for(int i=1; i <= numRows; i++){
        List<Integer> row = new ArrayList();
        for(int j = 1; j<=i; j++){
          if(j == 1 || j == i)
            row.add(1);
          else{
            int number = pre.get(j-2) + pre.get(j-1);
            row.add(number);
          }
        }
        pre = row;
        list.add(row);
      }
    }
      
    return list;
  }
}